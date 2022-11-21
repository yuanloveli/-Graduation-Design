document.addEventListener("DOMContentLoaded", () => {
  const contactForm = document.getElementById("contant-form");
  new Form(contactForm);
});

function Form(form) {
  this.form = form;
  this.inputElement = this.form.querySelectorAll("input,select,textarea");
  this.textareaComponent = this.form.querySelectorAll(".js-flexible-textarea");
  this.inputFileComponent = this.form.querySelectorAll(".js-flie-select");
  this.zipButton = this.form.querySelector(".js-address-search");
  this.inputDate = this.form.querySelectorAll('[type="date"]');
  this.submit = this.form.querySelector('[type="submit"]');

  this.init();
  this.handleEvent();
}

/**
 * 鍒濇湡鍖�
 */
Form.prototype.init = function () {
  this.validateSubmit();
  this.inputDate.forEach(this.initInputDate);
  this.textareaComponent.forEach(this.flexTextarea);
  this.inputFileComponent.forEach(this.displaySelectedFilename);
};

/**
 * 鐧昏浜嬩欢
 */
Form.prototype.handleEvent = function () {
  this.handleValidation(this.inputElement);
  this.handleZipSearch(this.zipButton);
  this.handleSubmit(this.submit);
};

/**
 * 鐧昏鍏充簬鑺傛棩娲诲姩
 */
Form.prototype.handleValidation = function (input) {
  input.forEach(currentInput => {
    // 杈撳叆鍐呭鏇存敼鍚庢樉绀烘秷鎭�
    currentInput.addEventListener("change", this.displayValidation.bind(this));

    // 鍙戦€佹寜閽殑楠岃瘉鎿嶄綔
    currentInput.addEventListener("change", this.validateSubmit.bind(this));
  });
};

/**
 * 鐧昏鏈夊叧鍦板潃妫€绱㈢殑浜嬩欢
 */
Form.prototype.handleZipSearch = function (searchButton) {
  searchButton.addEventListener("click", this.searchAddress.bind(this));
};

/**
 * 娉ㄥ唽鍙戦€佹寜閽浉鍏崇殑浜嬩欢
 */
Form.prototype.handleSubmit = function (submit) {
  submit.addEventListener("click", this.pressSubmit.bind(this));
};

/**
 * 鏄剧ず鎻愮ず
 */
Form.prototype.displayValidation = function (event) {
  const targetInput = event.target;
  const targetName = targetInput.getAttribute("name");
  const invalidMessage = targetInput.getAttribute("title");
  const messageArea = this.form.querySelector(
  `[data-validation="${targetName}"]`);

  const hasValidateMessage =
  messageArea !== null && targetInput.hasAttribute("title");
  const isValid = targetInput.validity.valid;

  targetInput.setAttribute("data-is-valid", isValid);

  if (hasValidateMessage) {
    messageArea.innerHTML = isValid ? "" : invalidMessage;
  }

  return;
};

/**
 * 鏍规嵁琛ㄥ崟鍐呭鏀瑰彉鍙戦€佹寜閽殑鐘舵€併€�
 */
Form.prototype.validateSubmit = function () {
  const isValid = this.form.checkValidity();
  const submitButton = this.submit;
  const messageArea = this.form.querySelector('[data-validation="submit"]');

  submitButton.setAttribute("aria-disabled", !isValid);
  messageArea.innerHTML = isValid ? "" : "娌℃湁杈撳叆鍏ㄩ儴蹇呴』椤圭洰";

  return;
};

/**
 * input[type="date"]鐨勫垵濮嬪€兼寚瀹氱浜屽ぉ鐨勬棩鏈�
 * 鎸囧畾鏃ユ湡浠庣浜屽ぉ鍒颁袱鍛�
 * @use https://momentjs.com/
 */
Form.prototype.initInputDate = function (input) {
  const min = moment().add(1, "days").format("YYYY-MM-DD");
  const max = moment().add(14, "days").format("YYYY-MM-DD");

  input.value = min;
  input.setAttribute("min", min);
  input.setAttribute("max", max);
};

/**
 * textarea鏍规嵁鍐呭杩涜浼哥缉
 * @see https://qiita.com/tsmd/items/fce7bf1f65f03239eef0
 */
Form.prototype.flexTextarea = function (component) {
  const textarea = component.querySelector("textarea");
  const dummyBox = document.createElement("div");
  dummyBox.className = "_dummy-box";
  dummyBox.setAttribute("aria-hidden", true);
  component.insertBefore(dummyBox, null);

  textarea.addEventListener("input", event => {
    dummyBox.textContent = event.target.value + "\u200b";
  });
};

/**
 * input[type=file]涓€夋嫨鐨勬枃浠跺悕
 */
Form.prototype.displaySelectedFilename = function (component) {
  const input = component.querySelector('input[type="file"]');
  const nameBox = document.createElement("p");
  nameBox.className = "_selected-file";
  component.insertBefore(nameBox, null);

  input.addEventListener("input", event => {
    nameBox.innerHTML = event.target.files[0].name;
  });
};

/**
 * 鑷姩濉厖鎸夐挳
 * @see https://waic.jp/docs/WCAG21/Understanding/on-input.html
 * @use https://github.com/ajaxzip3/ajaxzip3.github.io
 */
Form.prototype.searchAddress = function (event) {
  const zip = "postal-code";
  const address1 = "address-level1";
  const address2 = "address-level2";

  const zipInput = this.form.querySelector(`[name="${zip}"]`);
  const address1Input = this.form.querySelector(`[name="${address1}"]`);
  const address2Input = this.form.querySelector(`[name="${address2}"]`);

  AjaxZip3.zip2addr(zip, "", address1, address2);

  // 閭斂缂栫爜妫€绱㈡垚鍔熸椂鎵ц鐨勫鐞�
  AjaxZip3.onSuccess = () => {
    address1Input.setAttribute("data-is-valid", true);
    address2Input.setAttribute("data-is-valid", true);
    address2Input.focus();
  };

  // 閮典究鐣彿妞滅储澶辨晽鏅傘伀瀹熻銇欍倠鍑︾悊
  AjaxZip3.onFailure = () => {
    const messageArea = this.form.querySelector(`[data-validation="${zip}"]`);
    zipInput.setAttribute("data-is-valid", false);
    messageArea.innerHTML = "鎵句笉鍒扮鍚堥偖鏀跨紪鐮佺殑鍦板潃";
  };

  return;
};

/**
 * 鎸変笅鍙戦€佹寜閽椂鐨勮涓�
 */
Form.prototype.pressSubmit = function (event) {
  const isValid = this.form.checkValidity();

  if (isValid) {
    console.log("宸叉垚鍔熷彂閫侊紒");
  }

  event.preventDefault();

  return;
};

/**
 * 璁剧疆 360px 
 */
!function () {
  const viewport = document.querySelector('meta[name="viewport"]');
  function adjustViewport() {
    const value =
    window.outerWidth > 360 ?
    "width=device-width,initial-scale=1" :
    "width=360";
    if (viewport.getAttribute("content") !== value) {
      viewport.setAttribute("content", value);
    }
  }
  addEventListener("resize", adjustViewport, false);
  adjustViewport();
}();
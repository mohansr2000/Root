(window["webpackJsonp"] = window["webpackJsonp"] || []).push([["login-login-module"],{

/***/ "./src/app/login/login-page/login-page.component.css":
/*!***********************************************************!*\
  !*** ./src/app/login/login-page/login-page.component.css ***!
  \***********************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "\n.login-box{\n    background: #fde0e066;\n    padding: 10px;\n    border-radius: 15px;\n    border: 2px solid #e91e63;\n}\n\n.loginBtn {\n    color: #000;\n    background-color: #e91e63;\n    font-size: 16px;\n    border-color: #e91e63;\n}\n\n.form-control {\n      background-color: #ffffff;\n      background-image: none;\n      border: 1px solid #999999;\n      border-radius: 0;\n      box-shadow: 0 1px 1px rgba(0, 0, 0, 0.075) inset;\n      color: #333333;\n      display: block;\n      font-size: 14px;\n      height: 34px;\n      line-height: 1.42857;\n      padding: 6px 12px;\n      transition: border-color 0.15s ease-in-out 0s, box-shadow 0.15s ease-in-out 0s;\n      width: 100%;\n  }\n\n.login-box, .register-box {\n      width: 360px;\n      margin: 7% auto;\n  }\n\n.login-page, .register-page {\n      background: ##e91e63;\n  }\n\n.login-logo, .register-logo {\n      font-size: 35px;\n      text-align: center;\n      margin-bottom: 25px;\n      font-weight: 300;\n  }\n\n.login-box-msg, .register-box-msg {\n      margin: 0;\n      text-align: center;\n      padding: 0 20px 20px 20px;\n  }\n\n.login-box-body, .register-box-body {\n      padding: 20px;\n      border-top: 0;\n      color: #666;\n  }\n\n.has-feedback {\n      position: relative;\n  }\n\n.form-group {\n      margin-bottom: 15px;\n  }\n\n.has-feedback .form-control {\n      padding-right: 42.5px;\n  }\n\n.login-box-body .form-control-feedback, .register-box-body .form-control-feedback {\n      color: #777;\n  }\n\n.form-control-feedback {\n      position: absolute;\n      top: 0;\n      right: 0;\n      z-index: 2;\n      display: block;\n      width: 34px;\n      height: 34px;\n      line-height: 34px;\n      text-align: center;\n      pointer-events: none;\n  }\n\n.checkbox, .radio {\n      position: relative;\n      display: block;\n      margin-top: 10px;\n      margin-bottom: 10px;\n  }\n\n.icheck>label {\n      padding-left: 0;\n  }\n\n.checkbox label, .radio label {\n      min-height: 20px;\n      padding-left: 20px;\n      margin-bottom: 0;\n      font-weight: 400;\n      cursor: pointer;\n  }"

/***/ }),

/***/ "./src/app/login/login-page/login-page.component.html":
/*!************************************************************!*\
  !*** ./src/app/login/login-page/login-page.component.html ***!
  \************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<div class=\"login-box\">\n  <div class=\"login-logo\">\n    <h2>CertiBot</h2>\n  </div><!-- /.login-logo -->\n  <div class=\"login-box-body\">\n      <p class=\"login-box-msg\">Sign in to start your session</p>\n            <div class=\"form-group has-feedback\">\n          <input type=\"text\" name=\"login\" value=\"\" placeholder=\"Username\" class=\"form-control\" id=\"login\" maxlength=\"80\" size=\"30\">            <span class=\"glyphicon glyphicon-user form-control-feedback\"></span>\n      </div>\n      <div class=\"form-group has-feedback\">\n          <input type=\"password\" name=\"password\" value=\"\" placeholder=\"Password\" class=\"form-control\" id=\"password\" size=\"30\">    \n                  <span class=\"glyphicon glyphicon-lock form-control-feedback\"></span>\n      </div>\n      \n              <div class=\"row\">\n          <div class=\"col-xs-8\">\n              <div class=\"checkbox icheck\">\n                 \n              </div>\n          </div><!-- /.col -->\n          <div class=\"col-xs-12\">\n            <button class=\"col-md-12 btn btn-primary\" (click)=\"login()\">Login</button>\n      </div>\n          </div><!-- /.login-box-body -->\n</div>"

/***/ }),

/***/ "./src/app/login/login-page/login-page.component.ts":
/*!**********************************************************!*\
  !*** ./src/app/login/login-page/login-page.component.ts ***!
  \**********************************************************/
/*! exports provided: LoginPageComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "LoginPageComponent", function() { return LoginPageComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _angular_router__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/router */ "./node_modules/@angular/router/fesm5/router.js");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};


var LoginPageComponent = /** @class */ (function () {
    function LoginPageComponent(router) {
        this.router = router;
    }
    LoginPageComponent.prototype.ngOnInit = function () {
    };
    LoginPageComponent.prototype.login = function () {
        this.router.navigate(['/dashboard']);
    };
    LoginPageComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'app-login-page',
            template: __webpack_require__(/*! ./login-page.component.html */ "./src/app/login/login-page/login-page.component.html"),
            styles: [__webpack_require__(/*! ./login-page.component.css */ "./src/app/login/login-page/login-page.component.css")]
        }),
        __metadata("design:paramtypes", [_angular_router__WEBPACK_IMPORTED_MODULE_1__["Router"]])
    ], LoginPageComponent);
    return LoginPageComponent;
}());



/***/ }),

/***/ "./src/app/login/login.module.ts":
/*!***************************************!*\
  !*** ./src/app/login/login.module.ts ***!
  \***************************************/
/*! exports provided: LoginModule */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "LoginModule", function() { return LoginModule; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _angular_common__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/common */ "./node_modules/@angular/common/fesm5/common.js");
/* harmony import */ var _login_page_login_page_component__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! ./login-page/login-page.component */ "./src/app/login/login-page/login-page.component.ts");
/* harmony import */ var _angular_router__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! @angular/router */ "./node_modules/@angular/router/fesm5/router.js");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};




var loginRoutes = [{
        path: '', component: _login_page_login_page_component__WEBPACK_IMPORTED_MODULE_2__["LoginPageComponent"]
    }];
var LoginModule = /** @class */ (function () {
    function LoginModule() {
    }
    LoginModule = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["NgModule"])({
            imports: [
                _angular_common__WEBPACK_IMPORTED_MODULE_1__["CommonModule"],
                _angular_router__WEBPACK_IMPORTED_MODULE_3__["RouterModule"].forChild(loginRoutes)
            ],
            declarations: [_login_page_login_page_component__WEBPACK_IMPORTED_MODULE_2__["LoginPageComponent"]]
        })
    ], LoginModule);
    return LoginModule;
}());



/***/ })

}]);
//# sourceMappingURL=login-login-module.js.map
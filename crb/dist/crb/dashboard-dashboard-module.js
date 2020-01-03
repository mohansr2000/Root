(window["webpackJsonp"] = window["webpackJsonp"] || []).push([["dashboard-dashboard-module"],{

/***/ "./src/app/dashboard/dashboard.component.css":
/*!***************************************************!*\
  !*** ./src/app/dashboard/dashboard.component.css ***!
  \***************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "\n.crbbox {\n    border: 1px solid red;\n}\n.summaryTable td {\n    padding: 0px 10px;\n    font-size: 18px;\n    border: 1px solid;\n}\n.todayTable td {\n    border: 1px solid #000;\n    border: 1px solid #000;\n    width: 15%;\n    min-width: 15%;\n    max-width: 15%;\n    padding: 5px;\n}\n.todayTable {\n    table-layout: fixed;\n    \n}"

/***/ }),

/***/ "./src/app/dashboard/dashboard.component.html":
/*!****************************************************!*\
  !*** ./src/app/dashboard/dashboard.component.html ***!
  \****************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<app-header></app-header>\n\n\n\n\n<div class=\"container box\">\n    <div class=\"row box\">\n      <div class=\"col-md-4\">\n        <mat-card class=\"example-card smBx-blue\">\n            <mat-card-header>\n                <mat-card-title><h3><span class=\"glyphicon glyphicon-file\"></span> Summary</h3></mat-card-title>\n              </mat-card-header>\n            <mat-card-content>\n                  <div class=\"row\">\n                      <table class=\"summaryTable\">\n                        <tr><td>Total :</td><td>{{countDetails.totalCertificates}}</td></tr>\n                        <tr><td>Active :</td><td>{{countDetails.totalActiveCertificates}}</td><td>Expired :</td><td>{{countDetails.totalExpiredCertificates}}</td></tr>\n                      </table>\n                  </div>\n              </mat-card-content>\n          </mat-card>\n    </div>\n      <div class=\"col-md-4\">\n          <mat-card class=\"example-card smBx-green\">\n              <mat-card-header>\n                  <mat-card-title><h3> <span class=\"glyphicon glyphicon-refresh\"></span> Renewed</h3></mat-card-title>\n                </mat-card-header>\n              <mat-card-content>\n                <table class=\"summaryTable\">\n                  <tr><td>Today </td><td>{{countDetails.renewedData.today}}</td><td>7 Days :</td><td>{{countDetails.renewedData.week}}</td></tr>\n                  <tr><td> 30 Days:</td><td>{{countDetails.renewedData.month}}</td><td> 90 Days:</td><td>{{countDetails.renewedData.quarter}}</td></tr>\n                </table>\n                </mat-card-content>\n            </mat-card>\n      </div>\n      <div class=\"col-md-4\">\n          <mat-card class=\"example-card smBx-red\">\n              <mat-card-header>\n                  <mat-card-title><h3><span class=\"glyphicon glyphicon-remove\"></span> Expire</h3></mat-card-title>\n                </mat-card-header>\n              <mat-card-content>\n                <table class=\"summaryTable\">\n                  <tr><td>Today </td><td>{{countDetails.expiredData.today}}</td><td>7 Days :</td><td>{{countDetails.expiredData.week}}</td></tr>\n                  <tr><td> 30 Days:</td><td>{{countDetails.expiredData.month}}</td><td> 90 Days:</td><td>{{countDetails.expiredData.quarter}}</td></tr>\n                </table>\n                </mat-card-content>\n            </mat-card>\n      </div>\n      <!-- <div class=\"col-md-4\">\n          <mat-card class=\"example-card smBx-yellow\">\n              <mat-card-header>\n                  <mat-card-title><h3><span class=\"glyphicon glyphicon-user\"></span> Tenants</h3></mat-card-title>\n                </mat-card-header>\n              <mat-card-content>\n                    <div class=\"row\">\n                      \n                    </div>\n                </mat-card-content>\n            </mat-card>\n      </div> -->\n    </div>\n</div>\n\n<div class=\"container box\">\n    <div class=\"row box\"> \n        <div class=\"col-md-12\"><mat-card class=\"example-card redHeadCard\">\n            <mat-card-header>\n              <mat-card-title><h3> <span class=\"glyphicon glyphicon-inbox\"></span>  Expire Today</h3></mat-card-title>\n              <mat-card-subtitle>Certificates expire today</mat-card-subtitle>\n            </mat-card-header>\n            <mat-card-content>\n              <mat-accordion>\n                <mat-expansion-panel *ngFor=\"let today of todaysData\">\n                  <mat-expansion-panel-header>\n                    <mat-panel-title>\n                        {{today.certificateName}}\n                    </mat-panel-title>\n                    <mat-panel-title>\n                      {{today.hostName}}\n                  </mat-panel-title>\n                  <mat-panel-title>\n                    {{today.certificateAuthorityName}}\n                </mat-panel-title>\n                <mat-panel-title>\n                  {{today.validTo}}\n              </mat-panel-title>\n                  </mat-expansion-panel-header>\n                  \n                  <table class=\"todayTable\">\n                    <tr><td>Certificate Name: </td><td> <b>{{today.certificateName}}</b></td> <td> Certificate Authority Name:</td><td> <b>{{today.certificateAuthorityName}}</b></td></tr>\n                      <tr><td>Tenant Name</td><td> <b>{{today.tenantName}}</b></td> <td> Host Name</td><td> <b>{{today.hostName}}</b></td> </tr>\n                      <tr><td>Certificate Type</td><td> <b>{{today.certificateType}}</b></td> <td> Certificate Status</td><td> <b>{{today.certificateStatus}}</b></td> </tr>\n                      <tr><td>Valid From</td><td> <b>{{today.validFrom}}</b></td> <td> Valid To</td><td> <b>{{today.validTo}}</b></td> </tr>\n                  </table>\n                  <br><br>\n                  <button mat-raised-button color=\"accent\">View</button>\n                </mat-expansion-panel>\n              </mat-accordion>\n            </mat-card-content>\n          </mat-card></div>\n      </div>\n</div>\n  <div class=\"container\">\n    <div class=\"row\">\n        <div class=\"col-md-6\"><mat-card class=\"example-card redHeadCard\">\n            <mat-card-header>\n              <mat-card-title><h3> <span class=\"glyphicon glyphicon-credit-card\"></span> Expire in 7 Days</h3></mat-card-title>\n              <mat-card-subtitle>Certificates expires in next 7 Days</mat-card-subtitle>\n            </mat-card-header>\n            <mat-card-content>\n              <mat-accordion>\n                <mat-expansion-panel *ngFor=\"let week of todaysData\">\n                  <mat-expansion-panel-header>\n                    <mat-panel-title>\n                        {{week.certificateName}}\n                    </mat-panel-title>\n                <mat-panel-title>\n                  {{week.validTo}}\n              </mat-panel-title>\n                  </mat-expansion-panel-header>\n                  <hr>\n                  <table class=\"todayTable\">\n                    <tr><td>Certificate Name: </td><td> <b>{{week.certificateName}}</b></td> <td> Certificate Authority Name:</td><td> <b>{{week.certificateAuthorityName}}</b></td></tr>\n                    <tr><td>Tenant Name</td><td> <b>{{week.tenantName}}</b></td> <td> Host Name</td><td> <b>{{week.hostName}}</b></td> </tr>\n                    <tr><td>Certificate Type</td><td> <b>{{week.certificateType}}</b></td> <td> Certificate Status</td><td> <b>{{week.certificateStatus}}</b></td> </tr>\n                    <tr><td>Valid From</td><td> <b>{{week.validFrom}}</b></td> <td> Valid To</td><td> <b>{{week.validTo}}</b></td> </tr>\n                  </table>\n                  <br>\n                  <button mat-raised-button color=\"accent\">View</button>\n                </mat-expansion-panel>\n              </mat-accordion>\n            </mat-card-content>\n          </mat-card></div>\n          <div class=\"col-md-6\"><mat-card class=\"example-card redHeadCard\">\n              <mat-card-header>\n                <mat-card-title><h3><span class=\"glyphicon glyphicon-credit-card\"></span> Expire in 30 Days</h3></mat-card-title>\n                <mat-card-subtitle>Certificates expires in next 30 Days</mat-card-subtitle>\n              </mat-card-header>\n              <mat-card-content>\n                <mat-accordion>\n                  <mat-expansion-panel *ngFor=\"let month of monthData\">\n                    <mat-expansion-panel-header>\n                      <mat-panel-title>\n                          {{month.certificateName}}\n                      </mat-panel-title>\n                  <mat-panel-title>\n                    {{month.validTo}}\n                </mat-panel-title>\n                    </mat-expansion-panel-header>\n                    <hr>\n                    <table class=\"todayTable\">\n                      <tr><td>Certificate Name: </td><td> <b>{{month.certificateName}}</b></td> <td> Certificate Authority Name:</td><td> <b>{{month.certificateAuthorityName}}</b></td></tr>\n                    <tr><td>Tenant Name</td><td> <b>{{month.tenantName}}</b></td> <td> Host Name</td><td> <b>{{month.hostName}}</b></td> </tr>\n                    <tr><td>Certificate Type</td><td> <b>{{month.certificateType}}</b></td> <td> Certificate Status</td><td> <b>{{month.certificateStatus}}</b></td> </tr>\n                    <tr><td>Valid From</td><td> <b>{{month.validFrom}}</b></td> <td> Valid To</td><td> <b>{{month.validTo}}</b></td> </tr>\n                    </table>\n                    <br><br>\n                    <button mat-raised-button color=\"accent\">View</button>\n                  </mat-expansion-panel>\n                </mat-accordion>\n              </mat-card-content>\n            </mat-card></div>\n    </div>\n   \n  </div>\n  <br><br>"

/***/ }),

/***/ "./src/app/dashboard/dashboard.component.ts":
/*!**************************************************!*\
  !*** ./src/app/dashboard/dashboard.component.ts ***!
  \**************************************************/
/*! exports provided: DashboardComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "DashboardComponent", function() { return DashboardComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _shared_services_common_common_service__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! ../shared/services/common/common.service */ "./src/app/shared/services/common/common.service.ts");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};


var DashboardComponent = /** @class */ (function () {
    function DashboardComponent(commonService) {
        this.commonService = commonService;
        // todaysData = new Array();
        // weekData = new Array();
        // monthData = new Array();
        this.todaysData = [{ "certificateId": 1, "hostId": 1, "certificateAuthorityId": 1, "certificateAuthorityName": "Digicert", "certificateName": "Certificate-A", "tenantId": 1, "tenantName": "Google", "hostName": "Prod Server", "certificateType": "SSL", "certificateStatus": "Active", "validFrom": "2019-01-01T00:00:00.000+0000", "validTo": "2019-08-05T00:00:00.000+0000", "renewalDate": null, "renewalStatus": null, "contact1": null, "contact1Type": null, "contact2": null, "contact2Type": null, "contact3": null, "contact3Type": null }];
        this.weekData = [{ "certificateId": 1, "hostId": 1, "certificateAuthorityId": 1, "certificateAuthorityName": "Digicert", "certificateName": "Certificate-A", "tenantId": 1, "tenantName": "Google", "hostName": "Prod Server", "certificateType": "SSL", "certificateStatus": "Active", "validFrom": "2019-01-01T00:00:00.000+0000", "validTo": "2019-08-05T00:00:00.000+0000", "renewalDate": null, "renewalStatus": null, "contact1": null, "contact1Type": null, "contact2": null, "contact2Type": null, "contact3": null, "contact3Type": null }];
        this.monthData = [{ "certificateId": 1, "hostId": 1, "certificateAuthorityId": 1, "certificateAuthorityName": "Digicert", "certificateName": "Certificate-A", "tenantId": 1, "tenantName": "Google", "hostName": "Prod Server", "certificateType": "SSL", "certificateStatus": "Active", "validFrom": "2019-01-01T00:00:00.000+0000", "validTo": "2019-08-05T00:00:00.000+0000", "renewalDate": null, "renewalStatus": null, "contact1": null, "contact1Type": null, "contact2": null, "contact2Type": null, "contact3": null, "contact3Type": null }];
        this.countDetails = {
            'totalCertificates': 3,
            'totalActiveCertificates': 2,
            'totalExpiredCertificates': 1,
            'expiredData': {
                'today': 1,
                'week': 1,
                'month': 1,
                'quarter': 2
            },
            'renewedData': {
                'today': 0,
                'week': 0,
                'month': 1,
                'quarter': 1
            }
        };
    }
    DashboardComponent.prototype.ngOnInit = function () {
        this.getCounts();
        this.getTodaysData();
        this.getWeekData();
        this.getMonthData();
    };
    DashboardComponent.prototype.getCounts = function () {
        var _this = this;
        this.commonService.getRequest('getCertificatesCount').subscribe(function (paramName) {
            console.log(paramName);
            _this.countDetails = JSON.parse(JSON.stringify(paramName));
        });
    };
    DashboardComponent.prototype.getTodaysData = function () {
        var _this = this;
        this.commonService.getRequest('getExpiredCertificatesByDays/1').subscribe(function (res) {
            _this.todaysData = JSON.parse(JSON.stringify(res));
            console.log(_this.todaysData);
        });
    };
    DashboardComponent.prototype.getWeekData = function () {
        var _this = this;
        this.commonService.getRequest('getExpiredCertificatesByDays/7').subscribe(function (res) {
            _this.weekData = JSON.parse(JSON.stringify(res));
            console.log(_this.todaysData);
        });
    };
    DashboardComponent.prototype.getMonthData = function () {
        var _this = this;
        this.commonService.getRequest('getExpiredCertificatesByDays/30').subscribe(function (res) {
            _this.monthData = JSON.parse(JSON.stringify(res));
            console.log(_this.todaysData);
        });
    };
    DashboardComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'app-dashboard',
            template: __webpack_require__(/*! ./dashboard.component.html */ "./src/app/dashboard/dashboard.component.html"),
            styles: [__webpack_require__(/*! ./dashboard.component.css */ "./src/app/dashboard/dashboard.component.css")]
        }),
        __metadata("design:paramtypes", [_shared_services_common_common_service__WEBPACK_IMPORTED_MODULE_1__["CommonService"]])
    ], DashboardComponent);
    return DashboardComponent;
}());



/***/ }),

/***/ "./src/app/dashboard/dashboard.module.ts":
/*!***********************************************!*\
  !*** ./src/app/dashboard/dashboard.module.ts ***!
  \***********************************************/
/*! exports provided: DashboardModule */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "DashboardModule", function() { return DashboardModule; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _angular_common__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/common */ "./node_modules/@angular/common/fesm5/common.js");
/* harmony import */ var _dashboard_component__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! ./dashboard.component */ "./src/app/dashboard/dashboard.component.ts");
/* harmony import */ var _angular_router__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! @angular/router */ "./node_modules/@angular/router/fesm5/router.js");
/* harmony import */ var _shared_shared_module__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(/*! ../shared/shared.module */ "./src/app/shared/shared.module.ts");
/* harmony import */ var _shared_material_material_module__WEBPACK_IMPORTED_MODULE_5__ = __webpack_require__(/*! ../shared/material/material.module */ "./src/app/shared/material/material.module.ts");
/* harmony import */ var _angular_material_button__WEBPACK_IMPORTED_MODULE_6__ = __webpack_require__(/*! @angular/material/button */ "./node_modules/@angular/material/esm5/button.es5.js");
/* harmony import */ var _shared_services_common_common_service__WEBPACK_IMPORTED_MODULE_7__ = __webpack_require__(/*! ../shared/services/common/common.service */ "./src/app/shared/services/common/common.service.ts");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};








var adminRoutes = [
    { path: '', component: _dashboard_component__WEBPACK_IMPORTED_MODULE_2__["DashboardComponent"] }
];
var DashboardModule = /** @class */ (function () {
    function DashboardModule() {
    }
    DashboardModule = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["NgModule"])({
            imports: [
                _angular_common__WEBPACK_IMPORTED_MODULE_1__["CommonModule"],
                _shared_shared_module__WEBPACK_IMPORTED_MODULE_4__["SharedModule"],
                _angular_material_button__WEBPACK_IMPORTED_MODULE_6__["MatButtonModule"],
                _shared_material_material_module__WEBPACK_IMPORTED_MODULE_5__["MaterialModule"],
                _angular_router__WEBPACK_IMPORTED_MODULE_3__["RouterModule"].forChild(adminRoutes)
            ],
            providers: [_shared_services_common_common_service__WEBPACK_IMPORTED_MODULE_7__["CommonService"]],
            declarations: [_dashboard_component__WEBPACK_IMPORTED_MODULE_2__["DashboardComponent"]]
        })
    ], DashboardModule);
    return DashboardModule;
}());



/***/ })

}]);
//# sourceMappingURL=dashboard-dashboard-module.js.map
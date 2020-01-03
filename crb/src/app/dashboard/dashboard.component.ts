import { Component, OnInit } from '@angular/core';
import { CommonService } from '../shared/services/common/common.service';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent implements OnInit {

  constructor(readonly commonService: CommonService) { }

  // todaysData = new Array();
  // weekData = new Array();
  // monthData = new Array();

  todaysData = [{"certificateId":1,"hostId":1,"certificateAuthorityId":1,"certificateAuthorityName":"Digicert","certificateName":"Certificate-A","tenantId":1,"tenantName":"Google","hostName":"Prod Server","certificateType":"SSL","certificateStatus":"Active","validFrom":"2019-01-01T00:00:00.000+0000","validTo":"2019-08-05T00:00:00.000+0000","renewalDate":null,"renewalStatus":null,"contact1":null,"contact1Type":null,"contact2":null,"contact2Type":null,"contact3":null,"contact3Type":null}];
  weekData = [{"certificateId":1,"hostId":1,"certificateAuthorityId":1,"certificateAuthorityName":"Digicert","certificateName":"Certificate-A","tenantId":1,"tenantName":"Google","hostName":"Prod Server","certificateType":"SSL","certificateStatus":"Active","validFrom":"2019-01-01T00:00:00.000+0000","validTo":"2019-08-05T00:00:00.000+0000","renewalDate":null,"renewalStatus":null,"contact1":null,"contact1Type":null,"contact2":null,"contact2Type":null,"contact3":null,"contact3Type":null}];
  monthData = [{"certificateId":1,"hostId":1,"certificateAuthorityId":1,"certificateAuthorityName":"Digicert","certificateName":"Certificate-A","tenantId":1,"tenantName":"Google","hostName":"Prod Server","certificateType":"SSL","certificateStatus":"Active","validFrom":"2019-01-01T00:00:00.000+0000","validTo":"2019-08-05T00:00:00.000+0000","renewalDate":null,"renewalStatus":null,"contact1":null,"contact1Type":null,"contact2":null,"contact2Type":null,"contact3":null,"contact3Type":null}];
  
  countDetails = {
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
  ngOnInit() {
    this.getCounts();
    this.getTodaysData();
    this.getWeekData();
    this.getMonthData();
  }
  getCounts() {
    this.commonService.getRequest('getCertificatesCount').subscribe(paramName => {
            console.log(paramName);
            this.countDetails = JSON.parse(JSON.stringify(paramName));
        });
  }

  getTodaysData() {
    this.commonService.getRequest('getExpiredCertificatesByDays/1').subscribe(res => {
      this.todaysData = JSON.parse(JSON.stringify(res));
      console.log(this.todaysData);
  });
  }

  getWeekData() {
    this.commonService.getRequest('getExpiredCertificatesByDays/7').subscribe(res => {
      this.weekData = JSON.parse(JSON.stringify(res));
      console.log(this.todaysData);
  });
  }
  getMonthData() {
    this.commonService.getRequest('getExpiredCertificatesByDays/30').subscribe(res => {
      this.monthData = JSON.parse(JSON.stringify(res));
      console.log(this.todaysData);
  });
  }
}

import { Injectable } from '@angular/core';
import { ApiService } from './api.service';
import { HttpClient } from '@angular/common/http';
import { environment } from 'src/environments/environment';
declare var $: any;

@Injectable()
export class CommonService {
 /* for listeners */

  data;
  constructor(readonly apiService: ApiService , readonly http: HttpClient) { }

  /*************************************************************************************
     * Function to alert the notification
     * msg parameter is mandatory
     * from , type and align are not mandatory (position for notification)
   **************************************************************************************/
  public showNotification(msg, type = 'success' , from =  'top', align = 'right'): void {
        $.notify({ icon: 'notifications', message: msg },
         {
          type, timer: 500,
          placement: {
              from,
              align
          }
      });
  }

  private getUrl(path: string) {
    const apiBaseUrl = environment.apiUrl;
    return apiBaseUrl + path;
  }


  postRequest(url , data) {
    console.log(data);
    this.http.get(this.getUrl(url));
    // return this.apiService.post( url, data).map(
    //   (response: Response) => {
    //     this.data = response.json();
    //     return this.data;
    //    }
    //   );
  }


  postJsonRequest(url , data) {
    // return this.apiService.postJson( url, data).map(
    //   (response: Response) => {
    //     this.data = response.json();
    //     return this.data;
    //    }
    //   );
  }
  
  getRequest(url) {
    return this.http.get(this.getUrl(url));
    // return this.apiService.get(url).map(
    //   (response: Response) => {
    //     this.data = response.json();
    //     return this.data;
    //    }
    //   );
  }


}


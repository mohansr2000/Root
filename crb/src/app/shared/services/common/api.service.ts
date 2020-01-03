import { Injectable } from '@angular/core';
import { Http, HttpModule , RequestOptions , Response } from '@angular/http';
import { HttpParams, HttpClient } from '@angular/common/http';

import { environment } from '../../../../environments/environment';
import { Observable } from 'rxjs';


@Injectable()
export class ApiService {

  constructor(readonly http: HttpClient) { }

  headers;

  /**************************************************************************
   *   Function to call get method apis....
   ***************************************************************************/
  get(url: string, params: object = {}, headers: object = {}): Observable<any> {
    this.headers = new Headers();
    return this.http.get(this.getUrl(url) );
  }

  /**************************************************************************
   * Function to call Post method apis
   ***************************************************************************/
  post1(url: string, body: any | null, headers: object = {}): Observable<any> {
    this.headers = new Headers();
    return this.http.post(this.getUrl(url), body);
  }

  /**************************************************************************
   * Function to call Post method with multipart apis
   ***************************************************************************/

  post(url: string, body: any | null, headers: object = {}): Observable<any> {
    this.headers = new Headers();
    this.headers.set('Content-Type', 'multipart/form-data');

    return this.http.post(this.getUrl(url), body);
  }


  /**************************************************************************
   * Function to call Post method apis
   ***************************************************************************/
  postJson(url: string, body: any | null, headers: object = {}): Observable <any> {
    this.headers = new Headers();
    this.headers.append('Content-Type', 'application/json');
    return this.http.post(this.getUrl(url), JSON.stringify(body), {headers: this.headers});
  }

  /**************************************************************************
   * Function to call Put method apis
   ***************************************************************************/
  put(url: string, body: any | null, headers: object = {}): Observable<any> {
    this.headers = new Headers();
    return this.http.put(this.getUrl(url), body);
  }

  /**************************************************************************
   * Function to call Patch method apis
   ***************************************************************************/
  patch(url: string, body: any | null, headers: object = {}): Observable<any> {
    return this.http.patch(this.getUrl(url), body, this.RequestOptions(headers));
  }

  /**************************************************************************
   * Function to call Delete method apis
   ***************************************************************************/
  delete(url: string, headers: object = {}): Observable<any> {
    return this.http.delete(this.getUrl(url), this.RequestOptions(headers));
  }

  /**************************************************************************
   * Function to download
   ***************************************************************************/
  download(url: string, params: object = {}): Observable<any> {
    const headers = { 'Accept': '*/*' };
    return this.http.get(this.getUrl(url), this.RequestOptions(headers, params, true));
  }

  /**************************************************************************
   * Function to Prepare a Http params
   ***************************************************************************/
  private getHttpParams(params: object = {}): HttpParams {
    return Object.getOwnPropertyNames(params)
      .reduce((param, key) => param.set(key, params[key]), new HttpParams);
  }

  /**************************************************************************
   * Function to Preapre RequestOptins
   ***************************************************************************/
  private RequestOptions(headers: object = {}, params: object = {}, download = false) {
    this.headers = new Headers();
    this.headers.append('Content-Type', 'application/json');

    return  {
      headers: this.headers,
      params: this.getHttpParams(params),
      withCredentials: true
    };
  }

  private getUrl(path: string) {
    const apiBaseUrl = environment.apiUrl;
    return apiBaseUrl + path;
  }

}

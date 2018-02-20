import { Injectable } from '@angular/core';
import { Http } from '@angular/http';
import 'rxjs/add/operator/toPromise';
import { Item } from './modelItems';
import 'rxjs/add/operator/toPromise';
import { SpecifiedItem } from './modelForSpecifiedItem';
import { LodowkaComponent } from './lodowka.component';
import { Headers } from '@angular/http';
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/catch';


@Injectable()

export class DataService{

    private urlGet = 'Components/';
    private urlPut = 'Components/put/';
    private headers = new Headers({'Content-Type': 'application/json'});


    constructor(private http: Http)  { }

     getItems(urlParameter): Promise<SpecifiedItem[]> {
    return this.http.get(this.urlGet+urlParameter)
    .toPromise()
    .then (response => response.json() as SpecifiedItem[] )
    .catch(this.handleError);
  }

  
  update (item:SpecifiedItem){
    const url = `${this.urlPut}${item.idItem}`;
    if (item.parameters==undefined)
      item.parameters=null;

    return this.http.put(url, item, {headers: this.headers})
        .map(success => success.status)
        .catch(this.handleError);
  
  }



   private handleError(error: any): Promise<any> {
    console.error('Error', error); // for demo purposes only
    return Promise.reject(error.message || error);
  }

}




import { Component } from '@angular/core';
import { DataService } from './dataService';
import { Item } from './modelItems';
import { SpecifiedItem } from './modelForSpecifiedItem';


@Component({
  selector: 'menu-component',
  templateUrl: './menu.component.html',
  styleUrls: ['./menu.component.css', './css/fontello.css'],
  providers: [DataService]

})
export class MenuComponent {


  statusCode: number;
  itemList: SpecifiedItem[];
  constructor (private dataService:DataService){}

  getItems():void
  {
    this.dataService.getItems('getall').then(output => this.itemList = output)
    

  }

    ngOnInit(): void {
     this.getItems();
  }

}

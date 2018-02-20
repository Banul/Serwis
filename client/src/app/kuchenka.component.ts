import { Component } from '@angular/core';
import { DataService } from './dataService';
import { Item } from './modelItems';
import { SpecifiedItem } from './modelForSpecifiedItem';

@Component({

  selector: 'kuchenka-component',
  templateUrl: './item.component.html',
  providers: [DataService],
  styleUrls: ['./item.component.css']


})

export class KuchenkaComponent {

  pressedItem : SpecifiedItem;
  itemList: SpecifiedItem[];
  constructor (private dataService:DataService){}

   getItems():void
  {
    this.dataService.getItems('kuchenka').then(output => this.itemList = output)

  }

  update(item:SpecifiedItem):void
  {

    this.dataService.update(item)
    .subscribe(
        response => {
          this.changeData(item);
            
        }

    )

  }

    ngOnInit(): void {
     this.getItems();
  }

    showDetails(item:SpecifiedItem) : void {
      this.pressedItem = item;
    }

    changeData(item:SpecifiedItem):void{
      
     if (item.status=="zepsuty")
      {
        item.status="sprawny";
      }
      else
        {
          item.status="zepsuty";
        }
      
    }

}
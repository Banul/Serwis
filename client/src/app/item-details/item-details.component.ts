import { Component, Input } from '@angular/core';
import { SpecifiedItem } from '../modelForSpecifiedItem';

@Component({
  selector: 'lodowka-szczegoly',
  templateUrl: './item-details.component.html',
  styleUrls: ['./item-details.component.css']
})
export class LodowkaSzczegolyComponent {

 @Input() item: SpecifiedItem;

}

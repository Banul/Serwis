import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { AppComponent } from './app.component';
import { DataService } from './dataService';
import { HttpModule } from '@angular/http';
import { MenuComponent } from './menu.component';
import { RouterModule }   from '@angular/router';
import { LodowkaComponent } from './lodowka.component';
import { PralkaComponent } from './pralka.component';
import { TelewizorComponent } from './telewizor.component';
import { KuchenkaComponent } from './kuchenka.component';
import { KomputerComponent } from './komputer.component';
import { LodowkaSzczegolyComponent } from './item-details/item-details.component'; 



@NgModule({
  declarations: [
    AppComponent,
    MenuComponent,
    LodowkaComponent,
    PralkaComponent,
    TelewizorComponent,
    KuchenkaComponent,
    KomputerComponent,
    LodowkaSzczegolyComponent
    ],
  imports: [
    BrowserModule,
    BrowserModule,
    FormsModule,
    HttpModule,
    RouterModule.forRoot([
  {
    path: 'menustrony',
    component: MenuComponent
  },
   {
        path: 'lodowka',
        component: LodowkaComponent
   },

   {
     path: 'telewizor',
     component : TelewizorComponent
   },

   {
      path: 'pralka',
      component: PralkaComponent
   },
    {
      path: 'kuchenka',
      component: KuchenkaComponent
    },
    {
      path: 'komputer',
      component: KomputerComponent
    },
    
      {
         path: '',
         redirectTo: '/menustrony',
         pathMatch: 'full'
},

])
  ],

  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

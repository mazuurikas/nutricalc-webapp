import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';

import {NutricalcMainComponent} from './app.component';

@NgModule({
  declarations: [
    NutricalcMainComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [NutricalcMainComponent]
})
export class NutricalcAppModule {
}

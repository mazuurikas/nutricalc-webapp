import {enableProdMode} from '@angular/core';
import {platformBrowserDynamic} from '@angular/platform-browser-dynamic';

import {NutricalcAppModule} from './app.module';
import {environment} from '../environments/environment';

if (environment.production) {
  enableProdMode();
}

platformBrowserDynamic().bootstrapModule(NutricalcAppModule)
  .catch(err => console.log(err));

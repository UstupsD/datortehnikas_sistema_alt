import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule, routingComponents } from './app-routing.module';
import { AppComponent } from './app.component';
import { TechComponent } from './tech/tech.component';
import { UserComponent } from './user/user.component';
import { RequestComponent } from './request/request.component';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule, NgModel } from '@angular/forms';

@NgModule({
  declarations: [
    AppComponent,
    TechComponent,
    UserComponent,
    RequestComponent,
    routingComponents,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    NgModel
  ],
  exports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    NgModel
  ],
  providers: [],
  entryComponents: [TechComponent],
  bootstrap: [AppComponent]

})
export class AppModule { }

import { VerticalComponent } from './vertical/vertical.component';
import { HeaderComponent } from './header/header.component';
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';

import { AppComponent } from './app.component';
import { RouterRoutingModule } from './router-routing.module';
import { HomeComponent } from './home/home.component';
import { ReactiveFormsModule } from '@angular/forms';
import { RequestService } from './service/request.service';
import { HttpClientModule } from '@angular/common/http';
import { CommunicatorService } from './service/communicator.service';


@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    HeaderComponent,
    VerticalComponent
  ],
  imports: [
    BrowserModule,
    RouterRoutingModule,
    ReactiveFormsModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [RequestService, CommunicatorService],
  bootstrap: [AppComponent]
})
export class AppModule { }

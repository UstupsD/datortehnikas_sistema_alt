import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { RequestComponent } from './request/request.component';
import { AddTechComponent } from './tech-add/tech-add.component';
import { TechComponent } from './tech/tech.component';
import { UserComponent } from './user/user.component';


const routes: Routes = [
  {
    path: 'tech',
    component: TechComponent
  },
  {
    path: 'tech/add',
    component: AddTechComponent
  },
  {
    path: 'user',
    component: UserComponent
  },
  {
    path: 'request',
    component: RequestComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
export const routingComponents = [TechComponent]
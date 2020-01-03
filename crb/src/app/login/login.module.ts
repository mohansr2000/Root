import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { LoginPageComponent } from './login-page/login-page.component';
import { RouterModule, Routes } from '@angular/router';

const loginRoutes: Routes = [{
  path: '' , component: LoginPageComponent
}];

@NgModule({
  imports: [
    CommonModule ,
    RouterModule.forChild(loginRoutes)
  ],
  declarations: [LoginPageComponent]
})
export class LoginModule { }

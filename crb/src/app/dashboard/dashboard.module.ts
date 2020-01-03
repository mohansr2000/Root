import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { DashboardComponent } from './dashboard.component';
import { RouterModule, Routes } from '@angular/router';
import { SharedModule } from '../shared/shared.module';
import { MaterialModule } from '../shared/material/material.module';
import {MatButtonModule} from '@angular/material/button';
import { CommonService } from '../shared/services/common/common.service';


const adminRoutes: Routes = [
  { path: '' , component: DashboardComponent }
];

@NgModule({
  imports: [
    CommonModule,
    SharedModule,
    MatButtonModule,
    MaterialModule,
    RouterModule.forChild(adminRoutes)
  ],
  providers: [ CommonService ],
  declarations: [DashboardComponent]
})
export class DashboardModule { }

import { CommonModule } from '@angular/common';
import { NgModule } from '@angular/core';
import { MatCardModule } from '@angular/material/card';
import { MatSortModule } from '@angular/material/sort';
import { MatTableModule} from '@angular/material/table';
import { MatToolbarModule } from '@angular/material/toolbar';
import {MatFormFieldModule} from '@angular/material/form-field';

import { AlunosRoutingModule } from './alunos-routing.module';
import { AlunosComponent } from './alunos/alunos.component';
import { AlunosService } from './service/alunos.service';

@NgModule({
  declarations: [
    AlunosComponent
  ],
  imports: [
    CommonModule,
    AlunosRoutingModule,
    MatTableModule,
    MatCardModule,
    MatSortModule,
    MatToolbarModule,
    MatFormFieldModule,
  ],
  providers:[
    AlunosService
  ]
})
export class AlunosModule { }

import { Component, OnDestroy, OnInit } from '@angular/core';
import { Subscription } from 'rxjs';
import { Alunos } from '../model/alunos';
import { AlunosService } from '../service/alunos.service';

@Component({
  selector: 'app-alunos',
  templateUrl: './alunos.component.html',
  styleUrls: ['./alunos.component.css']
})
export class AlunosComponent implements OnInit, OnDestroy{

  aluno: Alunos[] = [];

  readonly subscriptions = new Subscription();

  constructor(
    private alunoService: AlunosService,
  ) { }

  ngOnInit(): void {
    this.listAlunos();
  }

  ngOnDestroy(): void {
    this.subscriptions.unsubscribe();
  }

  private listAlunos(): void{
    const sub = this.alunoService.listAlunos().subscribe((alunos => {
      this.aluno = alunos;
    }));
    this.subscriptions.add(sub);
  }

}

import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Alunos } from '../model/alunos';

@Injectable({
  providedIn: 'root'
})
export class AlunosService {

  constructor( private http:HttpClient
    ) { }

    listAlunos(): Observable<Alunos[]>{
      const url = 'api/alunos';
      return this.http.get<Alunos[]>(url);
    }
}

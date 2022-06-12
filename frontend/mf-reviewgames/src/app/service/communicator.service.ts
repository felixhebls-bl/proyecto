import { BehaviorSubject } from 'rxjs';
import { Injectable, OnInit } from '@angular/core';


@Injectable()
export class CommunicatorService implements OnInit {

  header = new BehaviorSubject<string>('');

  public headerObservable = this.header.asObservable();

  constructor(
  ) { }

  ngOnInit() {
  }

  enviarValor(valor: string) {
    this.header.next(valor);
  }


}


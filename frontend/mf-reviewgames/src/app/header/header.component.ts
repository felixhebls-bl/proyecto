import { CommunicatorService } from './../service/communicator.service';
import { Component, OnInit } from '@angular/core';
import { BehaviorSubject, Subject } from 'rxjs';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {



  constructor(private communicator: CommunicatorService) { }

  ngOnInit(): void {

  }

  opcion(valor: string) {
    this.communicator.enviarValor(valor);
  }

}

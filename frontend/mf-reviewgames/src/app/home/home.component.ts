import { CommunicatorService } from './../service/communicator.service';
import { Comentario } from './../models/comentario';
import { Votacion } from './../models/votacion';
import { Component, OnDestroy, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Videojuego } from '../models/videojuego';
import { RequestService } from '../service/request.service';
import { Subscription } from 'rxjs';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit, OnDestroy {

  listaVideoJuegos:Videojuego[]=[];

  listaComentario:Comentario[]=[];

  listaVotacion:Votacion[]=[];

  listaFiltrada:Videojuego[]=[];

  valorIntroducido: string = "";

  selected: boolean = false;

  videojuegoSelected!: Videojuego;

  usuario: string | null = null;

  comentarioTable = false;

  videojuegosTable = false;

  votacionTable = false;

  subscriptionHeader: Subscription = new Subscription();

  constructor(private communicator: CommunicatorService,
    private router: Router) {

    }
  ngOnDestroy(): void {
    this.subscriptionHeader.unsubscribe();
  }

  ngOnInit(): void {

    this.subscriptionHeader = this.communicator.headerObservable.subscribe(res => {
      if (res === 'videojuego') {
        this.comentarioTable = false;

        this.videojuegosTable = true;

        this.votacionTable = false;
      } else if (res === 'comentario') {
        this.comentarioTable = true;

        this.videojuegosTable = false;

        this.votacionTable = false;
      } else if (res === 'votacion') {
        this.comentarioTable = false;

        this.videojuegosTable = false;

        this.votacionTable = true;
      }
    });


    this.listaVideoJuegos = [
      {
        idVideojuego: 1,
        nombre: 'Tetris',
        descripcion: 'Tetris es un videojuego de lógica originalmente diseñado y programado por Alekséi Pázhitnov en la Unión Soviética. Fue lanzado el 6 de junio de 1984, ​ mientras trabajaba para el Centro de Computación Dorodnitsyn de la Academia de Ciencias de la Unión Soviética en Moscú, RSFS de Rusia.​',
        plataforma: 'PC',
        imagen: ''
      },
            {
        idVideojuego: 2,
        descripcion: 'Pong',
        nombre: 'Pong fue un videojuego de la primera generación de videoconsolas publicado por Atari, creado por Nolan Bushnell y lanzado el 29 de noviembre de 1972.​ Pong está basado en el deporte de tenis de mesa.',
        plataforma: 'Arcade',
        imagen: ''
      },
            {
        idVideojuego: 3,
        descripcion: 'Super Mario',
        nombre: 'Super Mario Bros es un videojuego de plataformas, diseñado por Shigeru Miyamoto, lanzado el 13 de septiembre de 1985 y producido por la empresa japonesa Nintendo, para la consola Nintendo Entertainment System (NES). El juego describe las aventuras de los hermanos Mario y Luigi, personajes que ya protagonizaron el arcade Mario Bros. de 1983. En esta ocasión ambos deben rescatar a la Princesa Peach del Reino Champiñón que fue secuestrada por el rey de los Koopas, Bowser. A través de ocho diferentes mundos, los jugadores pueden controlar a alguno de los dos hermanos y deben enfrentarse finalmente tras los niveles correspondientes de cada mundo a los monstruos de cada castillo para rescatar a la Princesa Peach.',
        plataforma: 'Nintendo',
        imagen: ''
      }
    ];

        this.listaComentario = [
      {
        idComentario: 1,
        descripcion: 'Juegazo todo un clasico',
        idVideojuego: 3
      },
            {
        idComentario: 2,
        descripcion: 'Todo jugador de Nintendo que se precie debería probarlo!!',
        idVideojuego: 3
      },
            {
        idComentario: 1,
        descripcion: 'Juego totalmente atemporal, siempre estará con nosotros!!',
        idVideojuego: 1
      }
    ];

        this.listaVotacion = [
      {
        idVotacion: 1,
        voto: 1,
        idVideojuego: 3
      },
            {
        idVotacion: 2,
        voto: 1,
        idVideojuego: 1
      },
            {
        idVotacion: 3,
        voto: 1,
        idVideojuego: 2
      }
    ];
    setTimeout(() => {
      this.usuario = localStorage.getItem('usuario');
    });
  }

  buscador() {
    setTimeout(() => {
      this.listaFiltrada = [];
      this.listaVideoJuegos.forEach(el => {

        if (el.nombre.toLowerCase().includes(this.valorIntroducido.toLowerCase())) {
          this.listaFiltrada.push(el);
        }

      });
    });

  }
}

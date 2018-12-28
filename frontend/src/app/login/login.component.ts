import { Component, OnInit } from '@angular/core';
import {AuthService } from '../services/auth/auth.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent implements OnInit {

  user: Object;
  email: String;
  password: String;
  constructor() { 

  }

  ngOnInit() {
  }

  userLogin() {
    this.user = {name: this.email, password: this.password};
  }

}

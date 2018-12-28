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
  data: any;

  constructor(private auth: AuthService) { 

  }

  ngOnInit() {
  }

  userLogin() {
    this.user = {name: this.email, password: this.password};
    this.auth.userLogin(this.user)
    .subscribe((val) => {
      this.data = val;
      if(this.data.message='success') {
        console.log('ok');
      }
    });
  }

}

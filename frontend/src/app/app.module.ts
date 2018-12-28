import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BlogCreateComponent } from './blog-create/blog-create.component';
import { BlogShowComponent } from './blog-show/blog-show.component';
import { BlogComponent } from './blog/blog.component';
import { BlogEditComponent } from './blog-edit/blog-edit.component';
import { NavComponent } from './nav/nav.component';
import { LoginComponent } from './login/login.component';
import { SignupComponent } from './signup/signup.component';
import { HomeComponent } from './home/home.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';

import { BlogService } from './services/blog/blog.service';
import { AuthService } from './services/auth/auth.service';


const appRoutes: Routes = [
  { path: '', component: HomeComponent },
  { path: 'blogs', component: BlogComponent },
  { path: 'register', component: SignupComponent },
  { path: 'signin', component: LoginComponent },
  { path: '**', component: PageNotFoundComponent }
];

@NgModule({
  declarations: [
    AppComponent,
    BlogCreateComponent,
    BlogShowComponent,
    BlogComponent,
    BlogEditComponent,
    NavComponent,
    LoginComponent,
    SignupComponent,
    HomeComponent,
    PageNotFoundComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,
    AppRoutingModule,
    RouterModule.forRoot(appRoutes),
  ],
  providers: [
    BlogService,
    AuthService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }

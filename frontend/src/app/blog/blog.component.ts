import { Component, OnInit } from '@angular/core';
//import { BlogService } from '../services/blog/blog.service';

@Component({
  selector: 'app-blog',
  templateUrl: './blog.component.html',
  styleUrls: ['./blog.component.scss']
})
export class BlogComponent implements OnInit {
  blog: any;

  constructor() { 

  }

  ngOnInit() {
  }

}

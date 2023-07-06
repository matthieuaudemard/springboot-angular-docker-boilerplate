import {Component, OnInit} from '@angular/core';
import {HttpClient} from "@angular/common/http";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent implements OnInit {
  title = 'frontend';

  hellostr: string = "";

  constructor(private httpClient: HttpClient) {}

  ngOnInit(): void {
    this.httpClient.get("http://localhost:8080/api/greetings").subscribe((data: any) => this.hellostr = data.message);
  }
}

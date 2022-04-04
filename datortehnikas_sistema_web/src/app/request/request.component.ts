import { HttpErrorResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Request } from './request';
import { requestService } from './requestService';

@Component({
  selector: 'app-request',
  templateUrl: './request.component.html',
  styleUrls: ['./request.component.css']
})
export class RequestComponent implements OnInit {
  public request: Request[];
  constructor(private requestService: requestService) { }
  ngOnInit(): void {
    this.getRequest();
  }
  public getRequest(): void {
    this.requestService.getRequest().subscribe(
      (response: Request[]) => {
        this.request = response;
      },
      (error: HttpErrorResponse) => {
        alert(error.message);
      }
    )
  }
  public onOpenModal(request: Request, mode: string): void {
    const button = document.createElement('button');
    button.type = 'button';
    button.style.display = 'none';
  }
}

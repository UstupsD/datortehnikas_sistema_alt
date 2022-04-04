import { HttpErrorResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { User } from './user';
import { userService } from './userService';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {
  public user: User[];
  constructor(private userService: userService) { }
  ngOnInit(): void {
    this.getUser();
  }
  public getUser(): void {
    this.userService.getUser().subscribe(
      (response: User[]) => {
        this.user = response;
      },
      (error: HttpErrorResponse) => {
        alert(error.message);
      }
    )
  }
  public onOpenModal(user: User, mode: string): void {
    const button = document.createElement('button');
    button.type = 'button';
    button.style.display = 'none';
  }
}

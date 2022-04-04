import { HttpErrorResponse } from '@angular/common/http';
import { NONE_TYPE } from '@angular/compiler';
import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, NgForm, Validators } from '@angular/forms';
import { Tech } from './tech';
import { techService } from './techService';

@Component({
  selector: 'app-tech',
  templateUrl: './tech.component.html',
  styleUrls: ['./tech.component.css']
})
export class TechComponent implements OnInit {
  public editTech: Tech;
  tech:any;
  constructor(private techService: techService) { }
  ngOnInit(): void {
    this.getTech();
  }
  public getTech(): void {
    this.techService.getTech().subscribe(
      (response: Tech[]) => {
        this.tech = response;
      },
      (error: HttpErrorResponse) => {
        alert(error.message);
      }
    )
    }
    public deleteTech(id:number){
      let resp=this.techService.deleteTech(id);
      resp.subscribe((data)=>this.tech=data);
     }
}

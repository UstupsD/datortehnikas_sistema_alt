import { Component, OnInit } from '@angular/core';
import { NgModel, FormsModule } from '@angular/forms';
import { techService } from 'src/app/tech/techService';
@Component({
  selector: 'app-tech-add',
  templateUrl: './tech-add.component.html',
  styleUrls: ['./tech-add.component.css']
})
export class AddTechComponent implements OnInit {
  tech = {
    id: 0,
    techName: '',
    description: '',
    availability: true,
    imageUrl: ''
  };
  submitted = false;
  constructor(private techService: techService) { }
  ngOnInit(): void {
  }
  saveTech(): void {
    const tech = {
      id: this.tech.id,
      techName: this.tech.techName,
      description: this.tech.description,
      availability: this.tech.availability,
      imageUrl: this.tech.imageUrl,
    };
    this.techService.addTech(tech)
      .subscribe(
        response => {
          console.log(response);
          this.submitted = true;
        },
        error => {
          console.log(error);
        });
  }
  newTech(): void {
    this.submitted = false;
    this.tech = {
      id: 0,
      techName: '',
      description: '',
      availability: true,
      imageUrl: ''
    };
  }
}

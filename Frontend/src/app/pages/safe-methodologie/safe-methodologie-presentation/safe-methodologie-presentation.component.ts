import { Component, OnInit } from '@angular/core';
import { DemoService } from '../../../@core/Services/demo.service';
import { error } from 'console';

@Component({
  selector: 'ngx-safe-methodologie-presentation',
  templateUrl: './safe-methodologie-presentation.component.html',
  styleUrls: ['./safe-methodologie-presentation.component.scss']
})
export class SafeMethodologiePresentationComponent implements OnInit {
  
  id ="669019f2b2b147200accaa7e"
  demo : any ;
  constructor(private demoS: DemoService){

  }
  ngOnInit(): void {
    this.getDemoById(this.id);
  }
  getDemoById(id : string){
    this.demoS.getById(id).subscribe(
      (data)=>{
        this.demo = data;
        console.log(this.demo)
      },
      (error)=>{
        console.error("error fetching");
      }
    );
  }


}

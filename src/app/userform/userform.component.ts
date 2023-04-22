import { Component } from '@angular/core';
import { User } from '../user';
import { UserserviceService } from '../userservice.service';
import { SharedService } from '../sharedservice';

@Component({
  selector: 'app-userform',
  templateUrl: './userform.component.html',
  styleUrls: ['./userform.component.css']
})
export class UserformComponent {
  user:User;
  
  constructor(private userservice:UserserviceService, private sharedService:SharedService){
    this.user = new User(); 
  }

  insertUser(){
    this.userservice.setUser(this.user)
    .subscribe(user => alert(user.name + ' has been added to database'));
    this.sharedService.callMethod();
    this.resetUser();
  }

  resetUser(){
    this.user.name='';
    this.user.age=0;
    this.user.salary=0;
    this.sharedService.callMethod();
  }

}

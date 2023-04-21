import { Component } from '@angular/core';
import { User } from '../user';
import { UserserviceService } from '../userservice.service';

@Component({
  selector: 'app-userform',
  templateUrl: './userform.component.html',
  styleUrls: ['./userform.component.css']
})
export class UserformComponent {
  user:User;
  
  constructor(private userservice:UserserviceService){
    this.user = new User(); 
  }

  insertUser(){
    this.userservice.setUser(this.user)
    .subscribe(user => alert('User has been added to database'));
  }

  resetUser(){
    this.user.name='';
    this.user.age=0;
    this.user.salary=0;

  }

}

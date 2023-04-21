import { Component, OnInit } from '@angular/core';
import { User } from '../user';
import { UserserviceService } from '../userservice.service';

@Component({
  selector: 'app-userlist',
  templateUrl: './userlist.component.html',
  styleUrls: ['./userlist.component.css']
})
export class UserlistComponent implements OnInit{
  user:User[];
  updateForm:boolean=false;
  updateUser:User = new User();
  constructor(private userService:UserserviceService){
    this.user=[];
  }
  ngOnInit(): void {
    this.userService.getUsers()
    .subscribe((data:User[])=>{
      this.user=data;
    })
  }

  delete(id:number){
    this.userService.deleteUser(id)
    .subscribe();
    alert('User deleted');
    this.userService.getUsers()
    .subscribe((data:User[])=>{
      this.user=data;
    })

  }

 update(user:User){
  this.userService.updateUser(user)
  .subscribe(user => alert('User has been updated'));
  this.userService.getUsers()
    .subscribe((data:User[])=>{
      this.user=data;
    })
    this.updateForm=!this.updateForm;
 }

 updateCheck(){
  this.updateForm = !this.updateForm;
 }

}

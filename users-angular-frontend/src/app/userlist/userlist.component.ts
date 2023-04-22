import { Component, OnInit } from '@angular/core';
import { User } from '../user';
import { UserserviceService } from '../userservice.service';
import { SharedService } from '../sharedservice';

@Component({
  selector: 'app-userlist',
  templateUrl: './userlist.component.html',
  styleUrls: ['./userlist.component.css']
})
export class UserlistComponent implements OnInit{
  user:User[];
  updateForm:boolean=false;
  updateUser:User = new User();
  constructor(private userService:UserserviceService, private sharedService:SharedService){
    this.user=[];
    this.sharedService.methodCall$.subscribe(() => {
    this.getAll()
  })
  }

  ngOnInit(): void {
    this.getAll();
  }

  getAll(){
    this.userService.getUsers()
    .subscribe((data:User[])=>{
      this.user=data;
    })
  }
  delete(id:number){
    this.userService.deleteUser(id)
    .subscribe();
    this.getAll();

  }

 update(user:User){
  this.userService.updateUser(user)
  .subscribe(user => alert('User has been updated'));
  this.getAll();
    this.updateForm=!this.updateForm;
 }

 updateCheck(user:User){
  this.updateForm = !this.updateForm;
  this.updateUser=user;
 }

}

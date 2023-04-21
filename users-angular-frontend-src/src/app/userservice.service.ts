import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http'
import { User } from './user';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UserserviceService {
  private baseUrl="http://localhost:8080/user";

  constructor(private http:HttpClient) { }

  getUsers():Observable<User[]>{
    return this.http.get<User[]>(`${this.baseUrl}`);
  }

  setUser(user:User): Observable<User>{
    return this.http.post<User>(`${this.baseUrl}`,user);
  }

  deleteUser(id: number): Observable<unknown>{
    const url = `${this.baseUrl}/${id}`;
    return this.http.delete(url);
  }

  updateUser(user: User): Observable<User> {
    return this.http.put<User>(`${this.baseUrl}`, user);
  }
}

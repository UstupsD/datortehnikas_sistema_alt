import { Injectable } from "@angular/core";
import { Observable } from "rxjs";
import { HttpClient } from '@angular/common/http';
import { User } from "./user";
import { environment } from "src/environments/environment";

@Injectable ({
    providedIn: 'root'
})
export class userService {
    private url = environment.baseUrl;
    constructor(private http: HttpClient) { }
        
    public getUser(): Observable<User[]>{
        return this.http.get<User[]>(`${this.url}/user/all`);
    }

    public addUser(user: User): Observable<User>{
        return this.http.post<User>(`${this.url}/user/add`, user);
    }

    public updateUser(user: User): Observable<User>{
        return this.http.put<User>(`${this.url}/user/update`, user);
    }

    public deleteUser(userId: number): Observable<void>{
        return this.http.delete<void>(`${this.url}/user/delete/${userId}`);
    }
}
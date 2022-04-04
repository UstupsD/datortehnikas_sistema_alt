import { Injectable } from "@angular/core";
import { Observable } from "rxjs";
import { HttpClient } from '@angular/common/http';
import { Tech } from "./tech";
import { environment } from "src/environments/environment";

@Injectable ({
    providedIn: 'root'
})
export class techService {
    private url = environment.baseUrl;
    constructor(private http: HttpClient) { }
        
    public getTech(): Observable<Tech[]>{
        return this.http.get<Tech[]>(`${this.url}/tech/all`);
    }

    public addTech(tech: Tech): Observable<Tech>{
        return this.http.post<Tech>(`${this.url}/tech/add`, tech);
    }

    public updateTech(tech: Tech): Observable<Tech>{
        return this.http.put<Tech>(`${this.url}/tech/update$`, tech);
    }

    public deleteTech(techId: number): Observable<void>{
        return this.http.delete<void>(`${this.url}/tech/delete/${techId}`);
    }
    
}
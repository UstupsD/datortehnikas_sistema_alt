import { Injectable } from "@angular/core";
import { Observable } from "rxjs";
import { HttpClient } from '@angular/common/http';
import { Request } from "./request";
import { environment } from "src/environments/environment";

@Injectable ({
    providedIn: 'root'
})
export class requestService {
    private url = environment.baseUrl;
    constructor(private http: HttpClient) { }
        
    public getRequest(): Observable<Request[]>{
        return this.http.get<Request[]>(`${this.url}/request/all`);
    }

    public addRequest(request: Request): Observable<Request>{
        return this.http.post<Request>(`${this.url}/request/add`, request);
    }

    public updateRequest(request: Request): Observable<Request>{
        return this.http.put<Request>(`${this.url}/request/update`, request);
    }

    public deleteRequest(requestId: number): Observable<void>{
        return this.http.delete<void>(`${this.url}/request/delete/${requestId}`);
    }
}
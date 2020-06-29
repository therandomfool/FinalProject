import { State } from './state';
import { Feature } from './feature';

export class Campsite {
  id: number;
  name: string;
  location: string;
  latitude: number;
  longitude: number;
  state: State;
  features: Feature[];
  pictureUrl: string;
  remark: string;



  constructor(id?: number, name?: string, location?: string, latitude?: number,
              longitude?: number, state?: State, features?: Feature[], pictureUrl?: string, remark?: string){
      this.id = id;
		  this.name = name;
		  this.location = location;
		  this.latitude = latitude;
		  this.longitude = longitude;
		  this.state = state;
		  this.features = features;
      this.pictureUrl = pictureUrl;
      this.remark = remark;
  }

}

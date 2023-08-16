import { Component, Input } from '@angular/core';

@Component({
  selector: 'ov-rating',
  templateUrl: './rating.component.html',
  styleUrls: ['./rating.component.scss']
})
export class RatingComponent {
  @Input() rate: number;
  @Input() count: number;

}

import { Component, Input } from '@angular/core';

@Component({
  selector: 'ov-square-image',
  templateUrl: './square-image.component.html',
  styleUrls: ['./square-image.component.scss']
})
export class SquareImageComponent {
  @Input() src: string;

}

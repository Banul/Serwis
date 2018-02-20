import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { LodowkaSzczegolyComponent } from './lodowka-szczegoly.component';

describe('LodowkaSzczegolyComponent', () => {
  let component: LodowkaSzczegolyComponent;
  let fixture: ComponentFixture<LodowkaSzczegolyComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ LodowkaSzczegolyComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(LodowkaSzczegolyComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should be created', () => {
    expect(component).toBeTruthy();
  });
});

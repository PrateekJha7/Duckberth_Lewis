import java.util.*;
class DuckBerth
{
Scanner s=new Scanner(System.in);
double resource,resource1,x,y;
int wicleft,n,i,intrptn,score1,score2,ovleft,overs,target;
void read()
{
System.out.println("enter the overs");
overs=s.nextInt();
System.out.println("enter the score of team 1:");
score1=s.nextInt();
System.out.println("enter the score of team 2 at interruption:");
score2=s.nextInt();
 System.out.println("enter the overs left:");
ovleft=s.nextInt();

if(score2==0)
{
    wicleft=10;
}
else{
System.out.println("enter the wickets left");
wicleft=s.nextInt();
}
}
void display()
{
if(ovleft==50&&wicleft==10)
{
resource=100;
}
else if(ovleft==50&&wicleft==9)
{
resource=93.4;
}
else if(ovleft==50&&wicleft==8)
{
resource=85.1;
}
else if(ovleft==50&&wicleft==7)
{
resource=74.9;
}
else if(ovleft==50&&wicleft==6)
{
resource=62.7;
}
else if(ovleft==50&&wicleft==5)
{
resource=49.0;
}
else if(ovleft==50&&wicleft==4)
{
resource=34.9;
}
else if(ovleft==50&&wicleft==3)
{
resource=22.0;
}
else if(ovleft==50&&wicleft==2)
{
resource=11.9;
}
else if(ovleft==50&&wicleft==1)
{
resource=4.7;
}
if(ovleft==49&&wicleft==10)
{
resource=99.1;
}
else if(ovleft==49&&wicleft==9)
{
resource=92.6;
}
else if(ovleft==49&&wicleft==8)
{
resource=84.5;
}
else if(ovleft==49&&wicleft==7)
{
resource=74.4;
}
else if(ovleft==49&&wicleft==6)
{
resource=62.5;
}
else if(ovleft==49&&wicleft==5)
{
resource=48.9;
}
else if(ovleft==49&&wicleft==4)
{
resource=34.9;
}
else if(ovleft==49&&wicleft==3)
{
resource=22.0;
}
else if(ovleft==49&&wicleft==2)
{
resource=11.9;
}
else if(ovleft==49&&wicleft==1)
{
resource=4.7;
}
if(ovleft==48&&wicleft==10)
{
resource=98.1;
}
else if(ovleft==48&&wicleft==9)
{
resource=91.7;
}
else if(ovleft==48&&wicleft==8)
{
resource=83.8;
}
else if(ovleft==48&&wicleft==7)
{
resource=74.0;
}
else if(ovleft==48&&wicleft==6)
{
resource=62.2;
}
else if(ovleft==48&&wicleft==5)
{
resource=48.8;
}
else if(ovleft==48&&wicleft==4)
{
resource=34.9;
}
else if(ovleft==48&&wicleft==3)
{
resource=22.0;
}
else if(ovleft==48&&wicleft==2)
{
resource=11.9;
}
else if(ovleft==48&&wicleft==1)
{
resource=4.7;
}
if(ovleft==47&&wicleft==10)
{
resource=97.1;
}
else if(ovleft==47&&wicleft==9)
{
resource=90.9;
}
else if(ovleft==47&&wicleft==8)
{
resource=83.2;
}
else if(ovleft==47&&wicleft==7)
{
resource=73.5;
}
else if(ovleft==47&&wicleft==6)
{
resource=61.9;
}
else if(ovleft==47&&wicleft==5)
{
resource=48.6;
}
else if(ovleft==47&&wicleft==4)
{
resource=34.9;
}
else if(ovleft==47&&wicleft==3)
{
resource=22.0;
}
else if(ovleft==47&&wicleft==2)
{
resource=11.9;
}
else if(ovleft==47&&wicleft==1)
{
resource=4.7;
}
if(ovleft==46&&wicleft==10)
{
resource=96.1;
}
else if(ovleft==46&&wicleft==9)
{
resource=90.0;
}
else if(ovleft==46&&wicleft==8)
{
resource=82.5;
}
else if(ovleft==46&&wicleft==7)
{
resource=73.0;
}
else if(ovleft==46&&wicleft==6)
{
resource=61.6;
}
else if(ovleft==46&&wicleft==5)
{
resource=48.5;
}
else if(ovleft==46&&wicleft==4)
{
resource=34.8;
}
else if(ovleft==46&&wicleft==3)
{
resource=22.0;
}
else if(ovleft==46&&wicleft==2)
{
resource=11.9;
}
else if(ovleft==46&&wicleft==1)
{
resource=4.7;
}
if(ovleft==45&&wicleft==10)
{
resource=95.0;
}
else if(ovleft==45&&wicleft==9)
{
resource=89.1;
}
else if(ovleft==45&&wicleft==8)
{
resource=81.8;
}
else if(ovleft==45&&wicleft==7)
{
resource=72.5;
}
else if(ovleft==45&&wicleft==6)
{
resource=61.3;
}
else if(ovleft==45&&wicleft==5)
{
resource=48.4;
}
else if(ovleft==45&&wicleft==4)
{
resource=34.8;
}
else if(ovleft==45&&wicleft==3)
{
resource=22.0;
}
else if(ovleft==45&&wicleft==2)
{
resource=11.9;
}
else if(ovleft==45&&wicleft==1)
{
resource=4.7;
}
if(ovleft==44&&wicleft==10)
{
resource=93.9;
}
else if(ovleft==44&&wicleft==9)
{
resource=88.2;
}
else if(ovleft==44&&wicleft==8)
{
resource=81.0;
}
else if(ovleft==44&&wicleft==7)
{
resource=72.0;
}
else if(ovleft==44&&wicleft==6)
{
resource=61.0;
}
else if(ovleft==44&&wicleft==5)
{
resource=48.3;
}
else if(ovleft==44&&wicleft==4)
{
resource=34.8;
}
else if(ovleft==44&&wicleft==3)
{
resource=22.0;
}
else if(ovleft==44&&wicleft==2)
{
resource=11.9;
}
else if(ovleft==44&&wicleft==1)
{
resource=4.7;
}
if(ovleft==43&&wicleft==10)
{
resource=92.8;
}
else if(ovleft==43&&wicleft==9)
{
resource=87.3;
}
else if(ovleft==43&&wicleft==8)
{
resource=80.3;
}
else if(ovleft==43&&wicleft==7)
{
resource=71.4;
}
else if(ovleft==43&&wicleft==6)
{
resource=60.7;
}
else if(ovleft==43&&wicleft==5)
{
resource=48.1;
}
else if(ovleft==43&&wicleft==4)
{
resource=34.7;
}
else if(ovleft==43&&wicleft==3)
{
resource=22.0;
}
else if(ovleft==43&&wicleft==2)
{
resource=11.9;
}
else if(ovleft==43&&wicleft==1)
{
resource=4.7;
}
if(ovleft==42&&wicleft==10)
{
resource=91.7;
}
else if(ovleft==42&&wicleft==9)
{
resource=86.3;
}
else if(ovleft==42&&wicleft==8)
{
resource=79.5;
}
else if(ovleft==42&&wicleft==7)
{
resource=70.9;
}
else if(ovleft==42&&wicleft==6)
{
resource=60.3;
}
else if(ovleft==42&&wicleft==5)
{
resource=47.9;
}
else if(ovleft==42&&wicleft==4)
{
resource=34.7;
}
else if(ovleft==42&&wicleft==3)
{
resource=22.0;
}
else if(ovleft==42&&wicleft==2)
{
resource=11.9;
}
else if(ovleft==42&&wicleft==1)
{
resource=4.7;
}
if(ovleft==41&&wicleft==10)
{
resource=90.5;
}
else if(ovleft==41&&wicleft==9)
{
resource=85.3;
}
else if(ovleft==41&&wicleft==8)
{
resource=78.7;
}
else if(ovleft==41&&wicleft==7)
{
resource=70.3;
}
else if(ovleft==41&&wicleft==6)
{
resource=59.9;
}
else if(ovleft==41&&wicleft==5)
{
resource=47.8;
}
else if(ovleft==41&&wicleft==4)
{
resource=34.6;
}
else if(ovleft==41&&wicleft==3)
{
resource=22.0;
}
else if(ovleft==41&&wicleft==2)
{
resource=11.9;
}
else if(ovleft==41&&wicleft==1)
{
resource=4.7;
}
if(ovleft==40&&wicleft==10)
{
resource=89.3;
}
else if(ovleft==40&&wicleft==9)
{
resource=84.2;
}
else if(ovleft==40&&wicleft==8)
{
resource=77.8;
}
else if(ovleft==40&&wicleft==7)
{
resource=69.6;
}
else if(ovleft==40&&wicleft==6)
{
resource=59.5;
}
else if(ovleft==40&&wicleft==5)
{
resource=47.6;
}
else if(ovleft==40&&wicleft==4)
{
resource=34.6;
}
else if(ovleft==40&&wicleft==3)
{
resource=22.0;
}
else if(ovleft==40&&wicleft==2)
{
resource=11.9;
}
else if(ovleft==40&&wicleft==1)
{
resource=4.7;
}
if(ovleft==39&&wicleft==10)
{
resource=88.0;
}
else if(ovleft==39&&wicleft==9)
{
resource=83.1;
}
else if(ovleft==39&&wicleft==8)
{
resource=76.9;
}
else if(ovleft==3&&wicleft==7)
{
resource=69.0;
}
else if(ovleft==39&&wicleft==6)
{
resource=59.1;
}
else if(ovleft==39&&wicleft==5)
{
resource=47.4;
}
else if(ovleft==39&&wicleft==4)
{
resource=34.5;
}
else if(ovleft==39&&wicleft==3)
{
resource=22.0;
}
else if(ovleft==39&&wicleft==2)
{
resource=11.9;
}
else if(ovleft==39&&wicleft==1)
{
resource=4.7;
}
if(ovleft==38&&wicleft==10)
{
resource=86.7;
}
else if(ovleft==38&&wicleft==9)
{
resource=82.0;
}
else if(ovleft==38&&wicleft==8)
{
resource=76.0;
}
else if(ovleft==38&&wicleft==7)
{
resource=68.3;
}
else if(ovleft==38&&wicleft==6)
{
resource=58.7;
}
else if(ovleft==38&&wicleft==5)
{
resource=47.1;
}
else if(ovleft==38&&wicleft==4)
{
resource=34.5;
}
else if(ovleft==38&&wicleft==3)
{
resource=21.9;
}
else if(ovleft==38&&wicleft==2)
{
resource=11.9;
}
else if(ovleft==38&&wicleft==1)
{
resource=4.7;
}
if(ovleft==37&&wicleft==10)
{
resource=85.4;
}
else if(ovleft==37&&wicleft==9)
{
resource=80.9;
}
else if(ovleft==37&&wicleft==8)
{
resource=75.0;
}
else if(ovleft==37&&wicleft==7)
{
resource=67.6;
}
else if(ovleft==37&&wicleft==6)
{
resource=58.2;
}
else if(ovleft==37&&wicleft==5)
{
resource=46.9;
}
else if(ovleft==37&&wicleft==4)
{
resource=34.4;
}
else if(ovleft==37&&wicleft==3)
{
resource=21.9;
}
else if(ovleft==37&&wicleft==2)
{
resource=11.9;
}
else if(ovleft==37&&wicleft==1)
{
resource=4.7;
}
if(ovleft==36&&wicleft==10)
{
resource=84.1;
}
else if(ovleft==36&&wicleft==9)
{
resource=79.7;
}
else if(ovleft==36&&wicleft==8)
{
resource=74.1;
}
else if(ovleft==36&&wicleft==7)
{
resource=66.8;
}
else if(ovleft==36&&wicleft==6)
{
resource=57.7;
}
else if(ovleft==36&&wicleft==5)
{
resource=46.6;
}
else if(ovleft==36&&wicleft==4)
{
resource=34.3;
}
else if(ovleft==36&&wicleft==3)
{
resource=21.9;
}
else if(ovleft==36&&wicleft==2)
{
resource=11.9;
}
else if(ovleft==36&&wicleft==1)
{
resource=4.7;
}
if(ovleft==35&&wicleft==10)
{
resource=82.7;
}
else if(ovleft==35&&wicleft==9)
{
resource=78.5;
}
else if(ovleft==35&&wicleft==8)
{
resource=73.0;
}
else if(ovleft==35&&wicleft==7)
{
resource=66.0;
}
else if(ovleft==35&&wicleft==6)
{
resource=57.2;
}
else if(ovleft==35&&wicleft==5)
{
resource=46.4;
}
else if(ovleft==35&&wicleft==4)
{
resource=34.2;
}
else if(ovleft==35&&wicleft==3)
{
resource=21.9;
}
else if(ovleft==35&&wicleft==2)
{
resource=11.9;
}
else if(ovleft==35&&wicleft==1)
{
resource=4.7;
}
if(ovleft==34&&wicleft==10)
{
resource=81.3;
}
else if(ovleft==34&&wicleft==9)
{
resource=77.2;
}
else if(ovleft==34&&wicleft==8)
{
resource=72.0;
}
else if(ovleft==34&&wicleft==7)
{
resource=65.2;
}
else if(ovleft==34&&wicleft==6)
{
resource=56.6;
}
else if(ovleft==34&&wicleft==5)
{
resource=46.1;
}
else if(ovleft==34&&wicleft==4)
{
resource=34.1;
}
else if(ovleft==34&&wicleft==3)
{
resource=21.9;
}
else if(ovleft==34&&wicleft==2)
{
resource=11.9;
}
else if(ovleft==34&&wicleft==1)
{
resource=4.7;
}
if(ovleft==33&&wicleft==10)
{
resource=79.8;
}
else if(ovleft==33&&wicleft==9)
{
resource=75.9;
}
else if(ovleft==33&&wicleft==8)
{
resource=70.9;
}
else if(ovleft==33&&wicleft==7)
{
resource=64.4;
}
else if(ovleft==33&&wicleft==6)
{
resource=56.0;
}
else if(ovleft==33&&wicleft==5)
{
resource=45.8;
}
else if(ovleft==33&&wicleft==4)
{
resource=34.0;
}
else if(ovleft==33&&wicleft==3)
{
resource=21.9;
}
else if(ovleft==33&&wicleft==2)
{
resource=11.9;
}
else if(ovleft==33&&wicleft==1)
{
resource=4.7;
}
if(ovleft==32&&wicleft==10)
{
resource=78.3;
}
else if(ovleft==32&&wicleft==9)
{
resource=74.6;
}
else if(ovleft==32&&wicleft==8)
{
resource=69.7;
}
else if(ovleft==32&&wicleft==7)
{
resource=63.5;
}
else if(ovleft==32&&wicleft==6)
{
resource=55.4;
}
else if(ovleft==32&&wicleft==5)
{
resource=45.4;
}
else if(ovleft==32&&wicleft==4)
{
resource=33.9;
}
else if(ovleft==32&&wicleft==3)
{
resource=21.9;
}
else if(ovleft==32&&wicleft==2)
{
resource=11.9;
}
else if(ovleft==32&&wicleft==1)
{
resource=4.7;
}
if(ovleft==31&&wicleft==10)
{
resource=76.7;
}
else if(ovleft==31&&wicleft==9)
{
resource=73.2;
}
else if(ovleft==31&&wicleft==8)
{
resource=68.6;
}
else if(ovleft==31&&wicleft==7)
{
resource=62.2;
}
else if(ovleft==31&&wicleft==6)
{
resource=54.8;
}
else if(ovleft==31&&wicleft==5)
{
resource=45.1;
}
else if(ovleft==31&&wicleft==4)
{
resource=33.7;
}
else if(ovleft==31&&wicleft==3)
{
resource=21.9;
}
else if(ovleft==31&&wicleft==2)
{
resource=11.9;
}
else if(ovleft==31&&wicleft==1)
{
resource=4.7;
}
if(ovleft==30&&wicleft==10)
{
resource=75.1;
}
if(ovleft==30&&wicleft==9)
{
resource=71.8;
}
else if(ovleft==30&&wicleft==8)
{
resource=67.3;
}
if(ovleft==30&&wicleft==7)
{
resource=61.6;
}
else if(ovleft==30&&wicleft==6)
{
resource=54.1;
}
if(ovleft==30&&wicleft==5)
{
resource=44.7;
}
else if(ovleft==30&&wicleft==4)
{
resource=33.6;
}
if(ovleft==30&&wicleft==3)
{
resource=21.8;
}
else if(ovleft==30&&wicleft==2)
{
resource=11.9;
}
if(ovleft==30&&wicleft==1)
{
resource=4.7;
}


if(ovleft==29&&wicleft==10)
{
resource=73.5;
}
else if(ovleft==29&&wicleft==9)
{
resource=70.3;
}
else if(ovleft==29&&wicleft==8)
{
resource=66.1;
}
else if(ovleft==29&&wicleft==7)
{
resource=60.5;
}
else if(ovleft==29&&wicleft==6)
{
resource=53.4;
}
else if(ovleft==29&&wicleft==5)
{
resource=44.2;
}
else if(ovleft==29&&wicleft==4)
{
resource=33.4;
}
else if(ovleft==29&&wicleft==3)
{
resource=21.8;
}
else if(ovleft==29&&wicleft==2)
{
resource=11.9;
}
else if(ovleft==29&&wicleft==1)
{
resource=4.7;
}
if(ovleft==28&&wicleft==10)
{
resource=71.8;
}
else if(ovleft==28&&wicleft==9)
{
resource=68.8;
}
else if(ovleft==28&&wicleft==8)
{
resource=64.8;
}
else if(ovleft==28&&wicleft==7)
{
resource=59.5;
}
else if(ovleft==28&&wicleft==6)
{
resource=52.6;
}
else if(ovleft==28&&wicleft==5)
{
resource=43.8;
}
else if(ovleft==28&&wicleft==4)
{
resource=33.2;
}
else if(ovleft==28&&wicleft==3)
{
resource=21.8;
}
else if(ovleft==28&&wicleft==2)
{
resource=11.9;
}
else if(ovleft==28&&wicleft==1)
{
resource=4.7;
}
if(ovleft==27&&wicleft==10)
{
resource=70.1;
}
else if(ovleft==27&&wicleft==9)
{
resource=67.2;
}
else if(ovleft==27&&wicleft==8)
{
resource=63.4;
}
else if(ovleft==27&&wicleft==7)
{
resource=58.4;
}
else if(ovleft==27&&wicleft==6)
{
resource=51.8;
}
else if(ovleft==27&&wicleft==5)
{
resource=43.3;
}
else if(ovleft==27&&wicleft==4)
{
resource=33.0;
}
else if(ovleft==27&&wicleft==3)
{
resource=21.7;
}
else if(ovleft==27&&wicleft==2)
{
resource=11.9;
}
else if(ovleft==27&&wicleft==1)
{
resource=4.7;
}
if(ovleft==26&&wicleft==10)
{
resource=68.3;
}
else if(ovleft==26&&wicleft==9)
{
resource=65.6;
}
else if(ovleft==26&&wicleft==8)
{
resource=62.0;
}
else if(ovleft==26&&wicleft==7)
{
resource=57.2;
}
else if(ovleft==26&&wicleft==6)
{
resource=50.9;
}
else if(ovleft==26&&wicleft==5)
{
resource=42.8;
}
else if(ovleft==26&&wicleft==4)
{
resource=32.8;
}
else if(ovleft==26&&wicleft==3)
{
resource=21.7;
}
else if(ovleft==26&&wicleft==2)
{
resource=11.9;
}
else if(ovleft==26&&wicleft==1)
{
resource=4.7;
}
if(ovleft==25&&wicleft==10)
{
resource=66.5;
}
else if(ovleft==25&&wicleft==9)
{
resource=63.9;
}
else if(ovleft==25&&wicleft==8)
{
resource=60.5;
}
else if(ovleft==25&&wicleft==7)
{
resource=56.0;
}
else if(ovleft==25&&wicleft==6)
{
resource=50.0;
}
else if(ovleft==25&&wicleft==5)
{
resource=42.2;
}
else if(ovleft==25&&wicleft==4)
{
resource=32.6;
}
else if(ovleft==25&&wicleft==3)
{
resource=21.6;
}
else if(ovleft==25&&wicleft==2)
{
resource=11.9;
}
else if(ovleft==25&&wicleft==1)
{
resource=4.7;
}
if(ovleft==24&&wicleft==10)
{
resource=64.6;
}
else if(ovleft==24&&wicleft==9)
{
resource=62.2;
}
else if(ovleft==24&&wicleft==8)
{
resource=59.0;
}
else if(ovleft==24&&wicleft==7)
{
resource=54.7;
}
else if(ovleft==24&&wicleft==6)
{
resource=49.0;
}
else if(ovleft==24&&wicleft==5)
{
resource=41.6;
}
else if(ovleft==24&&wicleft==4)
{
resource=32.3;
}
else if(ovleft==24&&wicleft==3)
{
resource=21.6;
}
else if(ovleft==24&&wicleft==2)
{
resource=11.9;
}
else if(ovleft==24&&wicleft==1)
{
resource=4.7;
}
if(ovleft==23&&wicleft==10)
{
resource=62.7;
}
else if(ovleft==23&&wicleft==9)
{
resource=60.4;
}
else if(ovleft==23&&wicleft==8)
{
resource=57.4;
}
else if(ovleft==23&&wicleft==7)
{
resource=53.4;
}
else if(ovleft==23&&wicleft==6)
{
resource=48.0;
}
else if(ovleft==23&&wicleft==5)
{
resource=40.9;
}
else if(ovleft==23&&wicleft==4)
{
resource=32.0;
}
else if(ovleft==23&&wicleft==3)
{
resource=21.5;
}
else if(ovleft==23&&wicleft==2)
{
resource=11.9;
}
else if(ovleft==23&&wicleft==1)
{
resource=4.7;
}
if(ovleft==22&&wicleft==10)
{
resource=60.7;
}
else if(ovleft==22&&wicleft==9)
{
resource=58.6;
}
else if(ovleft==22&&wicleft==8)
{
resource=55.8;
}
else if(ovleft==22&&wicleft==7)
{
resource=52.0;
}
else if(ovleft==22&&wicleft==6)
{
resource=47.0;
}
else if(ovleft==22&&wicleft==5)
{
resource=40.2;
}
else if(ovleft==22&&wicleft==4)
{
resource=31.6;
}
else if(ovleft==22&&wicleft==3)
{
resource=21.4;
}
else if(ovleft==22&&wicleft==2)
{
resource=11.9;
}
else if(ovleft==22&&wicleft==1)
{
resource=4.7;
}
if(ovleft==21&&wicleft==10)
{
resource=58.7;
}
else if(ovleft==21&&wicleft==9)
{
resource=56.7;
}
else if(ovleft==21&&wicleft==8)
{
resource=54.1;
}
else if(ovleft==21&&wicleft==7)
{
resource=50.6;
}
else if(ovleft==21&&wicleft==6)
{
resource=45.8;
}
else if(ovleft==21&&wicleft==5)
{
resource=39.4;
}
else if(ovleft==21&&wicleft==4)
{
resource=31.2;
}
else if(ovleft==21&&wicleft==3)
{
resource=21.3;
}
else if(ovleft==21&&wicleft==2)
{
resource=11.9;
}
else if(ovleft==21&&wicleft==1)
{
resource=4.7;
}


if(ovleft==20&&wicleft==10)
{
resource=56.6;
}
if(ovleft==20&&wicleft==9)
{
resource=54.8;
}
else if(ovleft==20&&wicleft==8)
{
resource=52.4;
}
if(ovleft==20&&wicleft==7)
{
resource=49.1;
}
else if(ovleft==20&&wicleft==6)
{
resource=44.6;
}
if(ovleft==20&&wicleft==5)
{
resource=38.6;
}
else if(ovleft==20&&wicleft==4)
{
resource=30.8;
}
if(ovleft==20&&wicleft==3)
{
resource=21.2;
}
else if(ovleft==20&&wicleft==2)
{
resource=11.9;
}
if(ovleft==20&&wicleft==1)
{
resource=4.7;
}

if(ovleft==19&&wicleft==10)
{
resource=54.4;
}
if(ovleft==19&&wicleft==9)
{
resource=52.8;
}
else if(ovleft==19&&wicleft==8)
{									
resource=50.5;
}
else if(ovleft==19&&wicleft==7)
{									
resource=47.5;
}																	
else if(ovleft==19&&wicleft==6)
{
resource=43.4;
}
else if(ovleft==19&&wicleft==5)
{									
resource=37.7;
}
else if(ovleft==19&&wicleft==4)
{
resource=30.3;
}
else if(ovleft==19&&wicleft==3)
{									
resource=21.1;
}
else if(ovleft==19&&wicleft==2)
{
resource=11.9;
}
else if(ovleft==19&&wicleft==1)
{									
resource=4.7;
}

if(ovleft==18&&wicleft==10)
{
resource=52.2;
}
if(ovleft==18&&wicleft==9)
{
resource=50.7;
}
else if(ovleft==18&&wicleft==8)
{									
resource=48.6;
}
else if(ovleft==18&&wicleft==7)
{									
resource=45.9;
}																	
else if(ovleft==18&&wicleft==6)
{
resource=42.0;
}
else if(ovleft==18&&wicleft==5)
{									
resource=36.8;
}
else if(ovleft==18&&wicleft==4)
{
resource=29.8;
}
else if(ovleft==18&&wicleft==3)
{									
resource=20.9;
}
else if(ovleft==18&&wicleft==2)
{
resource=11.9;
}
else if(ovleft==18&&wicleft==1)
{									
resource=4.7;
}

if(ovleft==17&&wicleft==10)
{
resource=49.9;
}
if(ovleft==17&&wicleft==9)
{
resource=48.5;
}
else if(ovleft==17&&wicleft==8)
{									
resource=46.7;
}
else if(ovleft==17&&wicleft==7)
{									
resource=44.1;
}																	
else if(ovleft==17&&wicleft==6)
{
resource=40.6;
}
else if(ovleft==17&&wicleft==5)
{									
resource=35.8;
}
else if(ovleft==17&&wicleft==4)
{
resource=29.2;
}
else if(ovleft==17&&wicleft==3)
{									
resource=20.7;
}
else if(ovleft==17&&wicleft==2)
{
resource=11.9;
}
else if(ovleft==17&&wicleft==1)
{									
resource=4.7;
}
if(ovleft==16&&wicleft==10)
{
resource=47.6;
}
if(ovleft==16&&wicleft==9)
{
resource=46.3;
}
else if(ovleft==16&&wicleft==8)
{									
resource=44.7;
}
else if(ovleft==16&&wicleft==7)
{									
resource=42.3;
}																	
else if(ovleft==16&&wicleft==6)
{
resource=39.1;
}
else if(ovleft==16&&wicleft==5)
{									
resource=34.7;
}
else if(ovleft==16&&wicleft==4)
{
resource=28.5;
}
else if(ovleft==16&&wicleft==3)
{									
resource=20.5;
}
else if(ovleft==16&&wicleft==2)
{
resource=11.8;
}
else if(ovleft==16&&wicleft==1)
{									
resource=4.7;
}
if(ovleft==15&&wicleft==10)
{
resource=45.2;
}
if(ovleft==15&&wicleft==9)
{
resource=44.1;
}
else if(ovleft==15&&wicleft==8)
{									
resource=42.6;
}
else if(ovleft==15&&wicleft==7)
{									
resource=40.5;
}																	
else if(ovleft==15&&wicleft==6)
{
resource=37.6;
}
else if(ovleft==15&&wicleft==5)
{									
resource=33.5;
}
else if(ovleft==15&&wicleft==4)
{
resource=27.8;
}
else if(ovleft==15&&wicleft==3)
{									
resource=20.2;
}
else if(ovleft==15&&wicleft==2)
{
resource=11.8;
}
else if(ovleft==15&&wicleft==1)
{									
resource=4.7;
}
if(ovleft==14&&wicleft==10)
{
resource=42.7;
}
if(ovleft==14&&wicleft==9)
{
resource=41.7;
}
else if(ovleft==14&&wicleft==8)
{									
resource=40.4;
}
else if(ovleft==14&&wicleft==7)
{									
resource=38.5;
}																	
else if(ovleft==14&&wicleft==6)
{
resource=35.9;
}
else if(ovleft==14&&wicleft==5)
{									
resource=32.2;
}
else if(ovleft==14&&wicleft==4)
{
resource=27.0;
}
else if(ovleft==14&&wicleft==3)
{									
resource=19.9;
}
else if(ovleft==14&&wicleft==2)
{
resource=11.8;
}
else if(ovleft==14&&wicleft==1)
{									
resource=4.7;
}
if(ovleft==13&&wicleft==10)
{
resource=40.2;
}
else if(ovleft==13&&wicleft==9)
{									
resource=39.3;
}
else if(ovleft==13&&wicleft==8)
{									
resource=38.1;
}																	
else if(ovleft==13&&wicleft==7)
{
resource=36.5;
}
else if(ovleft==13&&wicleft==6)
{									
resource=34.2;
}
else if(ovleft==13&&wicleft==5)
{
resource=30.8;
}
else if(ovleft==13&&wicleft==4)
{									
resource=26.1;
}
else if(ovleft==13&&wicleft==3)
{
resource=19.5;
}
else if(ovleft==13&&wicleft==2)
{
resource=11.4;
}
else if(ovleft==13&&wicleft==1)
{									
resource=4.7;
}
if(ovleft==12&&wicleft==10)
{
resource=37.6;
}
if(ovleft==12&&wicleft==9)
{
resource=36.8;
}
else if(ovleft==12&&wicleft==8)
{									
resource=35.8;
}
else if(ovleft==12&&wicleft==7)
{									
resource=34.3;
}																	
else if(ovleft==12&&wicleft==6)
{
resource=32.3;
}
else if(ovleft==12&&wicleft==5)
{									
resource=29.4;
}
else if(ovleft==12&&wicleft==4)
{
resource=25.1;
}
else if(ovleft==12&&wicleft==3)
{									
resource=19.0;
}
else if(ovleft==12&&wicleft==2)
{
resource=11.6;
}
else if(ovleft==12&&wicleft==1)
{									
resource=4.7;
}
if(ovleft==11&&wicleft==10)
{
resource=34.9;
}
if(ovleft==11&&wicleft==9)
{
resource=34.2;
}
else if(ovleft==11&&wicleft==8)
{									
resource=33.4;
}
else if(ovleft==11&&wicleft==7)
{									
resource=32.1;
}																	
else if(ovleft==11&&wicleft==6)
{
resource=30.4;
}
else if(ovleft==11&&wicleft==5)
{									
resource=27.8;
}
else if(ovleft==11&&wicleft==4)
{
resource=24.0;
}
else if(ovleft==11&&wicleft==3)
{									
resource=18.5;
}
else if(ovleft==11&&wicleft==2)
{
resource=11.5;
}
else if(ovleft==11&&wicleft==1)
{									
resource=4.7;
}



if(ovleft==10&&wicleft==10)
{
resource=32.1;
}
if(ovleft==10&&wicleft==9)
{
resource=31.6;
}
else if(ovleft==10&&wicleft==8)
{									
resource=30.8;
}
else if(ovleft==10&&wicleft==7)
{									
resource=29.8;
}																	
else if(ovleft==10&&wicleft==6)
{
resource=28.3;
}
else if(ovleft==10&&wicleft==5)
{									
resource=26.1;
}
else if(ovleft==10&&wicleft==4)
{
resource=22.8;
}
else if(ovleft==10&&wicleft==3)
{									
resource=17.9;
}
else if(ovleft==10&&wicleft==2)
{
resource=11.4;
}
else if(ovleft==10&&wicleft==1)
{									
resource=4.7;
}
if(ovleft==9&&wicleft==10)
{
resource=29.3;
}
else if(ovleft==9&&wicleft==9)
{
resource=28.9;
}
else if(ovleft==9&&wicleft==8)
{
resource=28.2;
}
else if(ovleft==9&&wicleft==7)
{
resource=27.4;
}
else if(ovleft==9&&wicleft==6)
{
resource=26.1;
}
else if(ovleft==9&&wicleft==5)
{
resource=24.2;
}
else if(ovleft==9&&wicleft==4)
{
resource=21.4;
}
else if(ovleft==9&&wicleft==3)
{
resource=17.1;
}
else if(ovleft==9&&wicleft==2)
{
resource=11.2;
}
else if(ovleft==9&&wicleft==1)
{
resource=4.7;
}
if(ovleft==8&&wicleft==10)
{
resource=26.4;
}
else if(ovleft==8&&wicleft==9)
{
resource=26.0;
}
else if(ovleft==8&&wicleft==8)
{
resource=25.5;
}
else if(ovleft==8&&wicleft==7)
{
resource=24.8;
}
else if(ovleft==8&&wicleft==6)
{
resource=23.8;
}
else if(ovleft==8&&wicleft==5)
{
resource=22.3;
}
else if(ovleft==8&&wicleft==4)
{
resource=19.9;
}
else if(ovleft==8&&wicleft==3)
{
resource=16.2;
}
else if(ovleft==8&&wicleft==2)
{
resource=10.9;
}
else if(ovleft==8&&wicleft==1)
{
resource=4.7;
}
if(ovleft==7&&wicleft==10)
{
resource=23.4;
}
else if(ovleft==7&&wicleft==9)
{
resource=23.1;
}
else if(ovleft==7&&wicleft==8)
{
resource=22.7;
}
else if(ovleft==7&&wicleft==7)
{
resource=22.2;
}
else if(ovleft==7&&wicleft==6)
{
resource=21.4;
}
else if(ovleft==7&&wicleft==5)
{
resource=20.1;
}
else if(ovleft==7&&wicleft==4)
{
resource=18.2;
}
else if(ovleft==7&&wicleft==3)
{
resource=15.2;
}
else if(ovleft==7&&wicleft==2)
{
resource=10.5;
}
else if(ovleft==7&&wicleft==1)
{
resource=4.7;
}
if(ovleft==6&&wicleft==10)
{
resource=20.3;
}
else if(ovleft==6&&wicleft==9)
{
resource=20.1;
}
else if(ovleft==6&&wicleft==8)
{
resource=19.8;
}
else if(ovleft==6&&wicleft==7)
{
resource=19.4;
}
else if(ovleft==6&&wicleft==6)
{
resource=18.8;
}
else if(ovleft==6&&wicleft==5)
{
resource=17.8;
}
else if(ovleft==6&&wicleft==4)
{
resource=16.4;
}
else if(ovleft==6&&wicleft==3)
{
resource=13.9;
}
else if(ovleft==6&&wicleft==2)
{
resource=10.1;
}
else if(ovleft==6&&wicleft==1)
{
resource=4.6;
}




if(ovleft==5&&wicleft==10)
{
resource=17.2;
}
else if(ovleft==5&&wicleft==9)
{
resource=17.0;
}
else if(ovleft==5&&wicleft==8)
{
resource=16.8;
}
else if(ovleft==5&&wicleft==7)
{
resource=16.5;
}
else if(ovleft==5&&wicleft==6)
{
resource=16.1;
}
else if(ovleft==5&&wicleft==5)
{
resource=15.4;
}
else if(ovleft==5&&wicleft==4)
{
resource=14.3;
}
else if(ovleft==5&&wicleft==3)
{
resource=12.5;
}
else if(ovleft==5&&wicleft==2)
{
resource=9.4;
}
else if(ovleft==5&&wicleft==1)
{
resource=4.6;
}
if(ovleft==4&&wicleft==10)
{
resource=13.9;
}
else if(ovleft==4&&wicleft==9)
{
resource=13.8;
}
else if(ovleft==4&&wicleft==8)
{
resource=13.7;
}
else if(ovleft==4&&wicleft==7)
{
resource=13.5;
}
else if(ovleft==4&&wicleft==6)
{
resource=13.2;
}
else if(ovleft==4&&wicleft==5)
{
resource=12.7;
}
else if(ovleft==4&&wicleft==4)
{
resource=12.0;
}
else if(ovleft==4&&wicleft==3)
{
resource=10.7;
}
else if(ovleft==4&&wicleft==2)
{
resource=8.4;
}
else if(ovleft==4&&wicleft==1)
{
resource=4.5;
}
if(ovleft==3&&wicleft==10)
{
resource=10.6;
}
else if(ovleft==3&&wicleft==9)
{
resource=10.5;
}
else if(ovleft==3&&wicleft==8)
{
resource=10.4;
}
else if(ovleft==3&&wicleft==7)
{
resource=10.3;
}
else if(ovleft==3&&wicleft==6)
{
resource=10.2;
}
else if(ovleft==3&&wicleft==5)
{
resource=9.9;
}
else if(ovleft==3&&wicleft==4)
{
resource=9.5;
}
else if(ovleft==3&&wicleft==3)
{
resource=8.7;
}
else if(ovleft==3&&wicleft==2)
{
resource=7.2;
}
else if(ovleft==3&&wicleft==1)
{
resource=4.2;
}
if(ovleft==2&&wicleft==10)
{
resource=7.2;
}
else if(ovleft==2&&wicleft==9)
{
resource=7.1;
}
else if(ovleft==2&&wicleft==8)
{
resource=7.1;
}
else if(ovleft==2&&wicleft==7)
{
resource=7.0;
}
else if(ovleft==2&&wicleft==6)
{
resource=7.0;
}
else if(ovleft==2&&wicleft==5)
{
resource=6.8;
}
else if(ovleft==2&&wicleft==4)
{
resource=6.6;
}
else if(ovleft==2&&wicleft==3)
{
resource=6.2;
}
else if(ovleft==2&&wicleft==2)
{
resource=5.5;
}
else if(ovleft==2&&wicleft==1)
{
resource=3.7;
}
if(ovleft==1&&wicleft==10)
{
resource=3.6;
}
else if(ovleft==1&&wicleft==9)
{
resource=3.6;
}
else if(ovleft==1&&wicleft==8)
{
resource=3.6;
}
else if(ovleft==1&&wicleft==7)
{
resource=3.6;
}
else if(ovleft==1&&wicleft==6)
{
resource=3.6;
}
else if(ovleft==1&&wicleft==5)
{
resource=3.5;
}
else if(ovleft==1&&wicleft==4)
{
resource=3.5;
}
else if(ovleft==1&&wicleft==3)
{
resource=3.4;
}
else if(ovleft==1&&wicleft==2)
{
resource=3.2;
}
else if(ovleft==1&&wicleft==1)
{
resource=2.5;
}
if(intrptn==1)
{
target=(int) (score1*(resource1/100)+1);
System.out.println("par score is "+target+" runs");
}
else
{
resource1=100-resource;
target=(int) (score1*(resource1/100));
System.out.println("par score is "+target+" runs");
}
if(score2>target)
{
x=score2-target;
System.out.println("result:team 2 wins by "+x+" runs");
}
else if(score2==target)
{
System.out.println("result:match tied");
}
else if(score2==0)
{
     System.out.println("Target for team 2 is "+target);
}
else
{
y=target-score2;
System.out.println("result:team 1 wins by "+y+" runs");
}
}
public static void main(String[] args)
{
DuckBerth s1[]=new DuckBerth[100];
Scanner s=new Scanner(System.in);
System.out.println("enter the num of matches");
int n=s.nextInt();
//System.out.println("enter the num of interruption");
//int intrptn=s.nextInt();
for(int i=0;i<n;i++)
{
s1[i]=new DuckBerth();
s1[i].read();
}
for(int i=0;i<n;i++)
{
s1[i].display();
}
}
}


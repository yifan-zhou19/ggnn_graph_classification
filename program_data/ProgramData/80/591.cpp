int main()
{int y1,y2,m1,m2,d1,d2,i,j,t,p,x1,x2,x3;
int e[13]={0,0,31,59,90,120,151,181,212,243,273,304,334};
   scanf("%d%d%d\n%d%d%d",&y1,&m1,&d1,&y2,&m2,&d2);

   if(y1<y2) {t=y1;y1=y2;y2=t;t=m1;m1=m2;m2=t;t=d1;d1=d2;d2=t;}
   for(i=y2,p=0;i<y1;i++)
   {if((i%4==0&&i%100!= 0) || (i%400==0))   p++;
   }
   x1=365*(y1-y2)+p;
    
   t=0;
    if(((y1%4==0&&y1%100!=0) || (y1%400==0))&&m1>2) t=1;
    x2=e[m1]+d1+t;

    t=0;
    if(((y2%4==0&&y2%100!=0) || (y2%400==0))&&m2>2) t=1;
    x3=e[m2]+d2+t;
   
   x1=x1+x2-x3;
   if(x1<0) x1=-x1;
   printf("%d\n",x1);

return 0;
}


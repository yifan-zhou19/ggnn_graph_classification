int main()
{
    int x[5];
int i,j;
for(x[0]=1;x[0]<=5;x[0]++)
{for(x[1]=1;x[1]<=5;x[1]++)
{if(x[1]==x[0])
continue;
for(x[2]=1;x[2]<=5;x[2]++)
{if(x[2]==x[0]||x[2]==x[1])
continue;
for(x[3]=1;x[3]<=5;x[3]++)
{if(x[3]==x[0]||x[3]==x[1]||x[3]==x[2])
continue;
for(x[4]=1;x[4]<=5;x[4]++)
{if(x[4]==x[0]||x[4]==x[1]||x[4]==x[2]||x[4]==x[3])
continue;
i=(x[4]!=2&&x[4]!=3)+(x[0]<=2&&x[4]==1||x[0]>2&&x[4]!=1)+(x[1]<=2&&x[1]==2||x[1]>2&&x[1]!=2)+(x[2]<=2&&x[0]==5||x[2]>2&&x[0]!=5)+(x[3]<=2&&x[2]!=1||x[3]>2&&x[2]==1)+(x[4]<=2&&x[3]==1||x[4]>2&&x[3]!=1);
if(i==6)
{cout<<x[0]<<" "<<x[1]<<" "<<x[2]<<" "<<x[3]<<" "<<x[4];}
}
}
}
                          }    
}
    
    
    
return 0;
    }
int main()
{
	int a,b,c,i;                                                      //????;a,b,c????????,i?????
	int words[3],rank[3];                                             //??????,word[3]?????????????,rank[3]?a,b,c???????????
	char person[3]={'A','B','C'};                                     //????????????'A''B''C''
	for(a=0;a<=2;a++)
	{
		for(b=0;b<=2;b++)
		{
			if(b==a)continue;
	        c=3-a-b;                                                  //????????0,1,2?????????????????????a,b,c??
			words[0]=(b>a)+(c==b);
			words[1]=(a>b)+(a>c);
			words[2]=(c>b)+(b>a);                                     //????????words[3]??
			rank[a]=0;
			rank[b]=1;
			rank[c]=2;                                                //?????????????
			if(words[rank[0]]>words[rank[1]]>words[rank[2]])          //??????????????0???????????2???????
			{
				for(i=0;i<=2;i++)
				{
					cout<<person[rank[i]];                            //??????????????????
				}
					
			}
		}
			
	}
	return 0;
}
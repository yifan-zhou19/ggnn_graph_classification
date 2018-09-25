package <missing>;

public class GlobalMembers
{
	public static int exp(int a)
	{
		  int def1;
		  int expo = 1;
		  for (def1 = 1;def1 <= a;def1++)
		  {
		  expo = expo * 10;
		  }
		  return expo;
	}
	public static int Main()
	{
		  int n;
		  int i;
		  int j;
		  int comp;
		  int idlenth;
		  int sw = 0;
		  int test = 0;
		  int advnum = 0;
		  int arradv = 1;
		  int arrdis;
		  int cache;
		  int bubble;
		  int maxage;
		  int maxid;
		  int maxnum;
		  int maxright;
		  int print;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  int[] age = new int[n + 1];
		  int[] adv = new int[n + 1];
		  int[] ord = new int[n + 1];
		  int[] alrscan = new int[n + 1];
		  int[] numord = new int[n + 1];
		  int[] right = new int[n + 1];
		  System.in.read();
		  int[] id = new int[n + 1];
		  for (i = 1;i <= n;i++)
		  {
				ord[i] = numord[i] = i;
				alrscan[i] = 0;
				right[i] = 0;
		  }
		  for (i = 1;i <= n;i++)
		  {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  id[i] = Integer.parseInt(tempVar2);
		  }
		  String tempVar3 = ConsoleInput.scanfRead(" ");
		  if (tempVar3 != null)
		  {
			  age[i] = Integer.parseInt(tempVar3);
		  }
		  }
		  for (i = 1;i <= n;i++)
		  {
						   if (age[i] >= 60)
						   {
								  adv[i] = 1;
								  right[i] += age[i] * 1000;
								  right[i] += 1000000;
								  advnum++;
						   }
						   else
						   {
						   adv[i] = 0;
						   }
		  }
		  for (i = 1;i <= n;i++)
		  {

						   right[i] += n - i + 1;
						   alrscan[i] = 0;
		  }
		  for (i = 1;i <= n;i++)
		  {
						   maxright = 0;
						   for (j = 1;j <= n;j++)
						   {
									 if (right[j] > maxright && alrscan[j] == 0)
									 {
										 maxright = right[j];
									 maxnum = j;
									 }
						   }
						   ord[i] = maxnum;
						   alrscan[maxnum] = 1;
		  }
		  for (idlenth = 1;test != n;idlenth++)
		  {
						  test = 0;
						  for (j = 1;j <= n;j++)
						  {
						  if (id[j] < exp(idlenth - 1))
						  {
						  test++;
						  }
						  }
		  }
		  idlenth--;
		  for (i = 1;i <= n;i++)
		  {
						   for (j = 1;j <= idlenth;j++)
						   {

								   if (id[ord[i]] < exp(idlenth - j - 1))
								   {
								   System.out.print("0");
								   }
						   }
						   System.out.printf("%d\n",id[ord[i]]);
						   //printf("%d %d %d\n",id[ord[i]],numord[ord[i]],right[ord[i]]);
		  }
		  /*arrdis=advnum+1;
		  for(i=1;i<=n;i++)
		  {
		                   if(adv[i]==1)
		                   {
		                            ord[arradv]=i;
		                            arradv++;
		                   }
		                   else
		                   {
		                            ord[arrdis]=i;
		                            arrdis++;
		                   }
		  }
		  //printf("adv=%d,dis=%d",arradv,arrdis);
		  for(bubble=advnum;bubble>=1;bubble--);
		  {
		        for(i=1;i<bubble;i++)
		        {
		                   if(age[ord[i+1]]>age[ord[i]])
		                   {
		                            cache=ord[i+1];
		                            ord[i+1]=ord[i];
		                            ord[i]=cache;
		                   }
		        }
		  }
		  for(bubble=n;bubble>=advnum+1;bubble--);
		  {
		        for(i=advnum+1;i<bubble;i++)
		        {
		                   if(id[ord[i+1]]>id[ord[i]])
		                   {
		                            cache=ord[i+1];
		                            ord[i+1]=ord[i];
		                            ord[i]=cache;
		                   }
		        }
		  }                      
		  for(idlenth=1;test!=n;idlenth++)
		  {
		                  test=0;
		                  for(j=1;j<=n;j++)
		                  if(id[j]<exp(idlenth-1))
		                  test++;
		  }
		  idlenth--;
		  for(i=1;i<=n;i++)
		  {
		                   for(j=1;j<=idlenth;j++)
		                   {
		                                          
		                           if(id[ord[i]]<exp(idlenth-j-1))
		                           printf("0");
		                   }
		                   printf("%d\n",id[ord[i]]);
		  }*/
		  System.in.read();
		  System.in.read();
		  return 0;
	}



}


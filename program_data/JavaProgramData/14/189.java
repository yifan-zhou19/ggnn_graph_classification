package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct score
	//	{
	//		   int ID;
	//		   int c;
	//		   int m;
	//		   };
			   int n;
			   int k;
			   int t;
			   int r;
			   int j;
			   String tempVar = ConsoleInput.scanfRead();
			   if (tempVar != null)
			   {
				   n = Integer.parseInt(tempVar);
			   }
			   int[] sum = new int[100000];
			   score[] s = tangible.Arrays.initializeWithDefaultscoreInstances(100000);
			   for (int i = 1;i <= n;i++)
			   {
							String tempVar2 = ConsoleInput.scanfRead();
							if (tempVar2 != null)
							{
								s[i].ID = tempVar2;
							}
							String tempVar3 = ConsoleInput.scanfRead(" ");
							if (tempVar3 != null)
							{
								s[i].c = tempVar3;
							}
							String tempVar4 = ConsoleInput.scanfRead(" ");
							if (tempVar4 != null)
							{
								s[i].m = tempVar4;
							}
							sum[i] = s[i].c + s[i].m;
			   }
							for (j = 1;j <= 3;j++)
							{
											 for (k = j;k <= n;k++)
											 {
																if (sum[k] > sum[j])
																{
																	t = sum[j];
																			 sum[j] = sum[k];
																			 sum[k] = t;
																			 r = s[j].ID;
																			 s[j].ID = s[k].ID;
																			 s[k].ID = r;
																}
											 }
							}
																			 for (int u = 1;u <= 3;u++)
																			 {
																					 System.out.printf("%d %d\n",s[u].ID,sum[u]);
																			 }
																					 System.in.read();
																					 System.in.read();
	}
}


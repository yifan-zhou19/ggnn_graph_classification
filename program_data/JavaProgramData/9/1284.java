package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		char[][] str = new char[100][100]; //ID

		int[] s1 = new int[100];
		int[] sz = new int[100];
		int[] t = new int[100];
		int n;
		int i;
		int p;
		int k;

	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }


		 int j = 0;



		 for (i = 0;i < n;i++)
		 {
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 str[i] = tempVar2.charAt(0);
			 }
			 String tempVar3 = ConsoleInput.scanfRead(" ");
			 if (tempVar3 != null)
			 {
				 sz[i] = Integer.parseInt(tempVar3);
			 }


						 if (sz[i] >= 60) //panduannianling
						 {
								t[j] = i; //cunrulingyishuzu
							   s1[j] = sz[i];
							   j++;
						 } //gongyou 'j' ren
		 }

				for (k = 1;k <= j;k++) //paixu
				{
										  for (p = 0;p < j - k;p++)
										  {
															if (s1[p] < s1[p + 1]) //congdadaoxiao
															{
																			 int e;
																			 int f;
																			 e = s1[p + 1];
																			 s1[p + 1] = s1[p];
																			 s1[p] = e;
																			 f = t[p + 1];
																			 t[p + 1] = t[p];
																			 t[p] = f;

															}
										  }

				}
							  for (p = 0;p < j;p++)
							  {
														  System.out.printf("%s\n",str[t[p]]);

							  }

	  for (i = 0;i < n;i++)
	  {
					  if (sz[i] < 60)
					  {
					  System.out.printf("%s\n",str[i]);
					  }
	  }



	   return 0;
	}


}


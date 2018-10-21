package <missing>;

public class GlobalMembers
{
	public static int Main()

	{
		int[] n = new int[10000];
		int[][] sudu = new int[10000][2];
		int i;
		int j;
		int l;
		int x;
		i = 0;
		int m;
		int z;
		int[] zhongjian = new int[2];
		int[] yinzi = new int[1000];
		int wei;
		int weik;
		int tou;
		int touk;

		do
		{

		   String tempVar = ConsoleInput.scanfRead();
		   if (tempVar != null)
		   {
			   n[i] = Integer.parseInt(tempVar);
		   }
		   if (n[i] == 0)
		   {
		   break;
		   }

		   else
		   {
			 for (j = 0;j < n[i];j++)
			 {
			   String tempVar2 = ConsoleInput.scanfRead();
			   if (tempVar2 != null)
			   {
				   sudu[j][0] = Integer.parseInt(tempVar2);
			   }
			 }
			 for (j = 0;j < n[i];j++)
			 {
			   String tempVar3 = ConsoleInput.scanfRead();
			   if (tempVar3 != null)
			   {
				   sudu[j][1] = Integer.parseInt(tempVar3);
			   }
			 }
		   }


			  for (l = 0;l < n[i];l++)
			  {
				  for (j = 0;j < n[i] - 1;j++)
				  {
						if (sudu[j][0] > sudu[j + 1][0])
						{
							  zhongjian[0] = sudu[j + 1][0];
							  sudu[j + 1][0] = sudu[j][0];
							  sudu[j][0] = zhongjian[0];

						}
						else
						{
							;
						}
				  }
			  }

			 for (l = 0;l < n[i];l++)
			 {
				 for (j = 0;j < n[i] - 1;j++)
				 {
					   if (sudu[j][1] > sudu[j + 1][1])
					   {
							 zhongjian[0] = sudu[j + 1][1];
							 sudu[j + 1][1] = sudu[j][1];
							 sudu[j][1] = zhongjian[0];

					   }
					   else
					   {
						   ;
					   }
				 }
			 }

			 yinzi[i] = 0;
			 m = n[i] - 1;
			 wei = 0;
			 weik = 0;
			 tou = m;
			 touk = m;
			 x = 0;


			do
			{
				 if (sudu[tou][0] > sudu[touk][1])
				 {
					yinzi[i] = yinzi[i] + 200;
					x++;
					tou--;
					touk--;
				 }
				 else if (sudu[tou][0] < sudu[touk][1])
				 {
					yinzi[i] = yinzi[i] - 200;
					x++;
					wei++;
					touk--;
				 }
				 else
				 {

						while (sudu[wei][0] > sudu[weik][1])
						{
							  wei++;
							  weik++;
							  yinzi[i] = yinzi[i] + 200;
							  x++;
						}


					 if (sudu[wei][0] == sudu[touk][1])
					 {
						 wei++;
						 touk--;
						 x++;
					 }
					 else
					 {
						 wei++;
						 touk--;
						 yinzi[i] = yinzi[i] - 200;
						 x++;
					 }
				 }

			} while (x < n[i]);


		i++;
		} while (n[i - 1] != 0);

		z = i;
		   for (i = 0;i < z;i++)
		   {
		System.out.printf("%d\n",yinzi[i]);
		   }


		System.in.read();
		System.in.read();
	}

}


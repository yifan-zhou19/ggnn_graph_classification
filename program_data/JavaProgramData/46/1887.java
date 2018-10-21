package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int i; //??????????total?????????total=hang*lie?
		  int j;
		  int k;
		  int hang;
		  int lie;
		  int[][] a = new int[100][100];
		  int total;
		  int sum = 0;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			hang = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			lie = Integer.parseInt(tempVar2);
		}
		total = hang * lie;
		for (i = 0;i <= hang - 1;i++)
		{
			for (j = 0;j <= lie-1;j++)
			{
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  a[i][j] = Integer.parseInt(tempVar3);
		  }
			}
		}


		for (k = 1;k <= 10000;k++)
		{
		  for (j = k - 1;j <= lie - k;j++)
		  {
			  System.out.printf("%d\n",a[k - 1][j]);
			  sum = sum + 1;
			if (sum == total)
			{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
				goto end;
			}
		  }

		  for (i = k;i <= hang - k;i++)
		  {
			System.out.printf("%d\n",a[i][lie - k]);
		   sum = sum + 1;
			if (sum == total)
			{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
				goto end;
			}
		  }
		  for (j = lie - k - 1;j >= k - 1;j--)

		  {
			   System.out.printf("%d\n",a[hang - k][j]);
		   sum = sum + 1;
			if (sum == total)
			{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
				goto end;
			}
		  }


		  for (i = hang - k - 1;i >= k;i--)

		  {
			 System.out.printf("%d\n",a[i][k - 1]);
			sum = sum + 1;
			if (sum == total)
			{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
				goto end;
			}
		  }

		}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		 end:
		 ;
		return 0;
	}
}


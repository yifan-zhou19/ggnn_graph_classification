package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int q;
		int m;
		int n;
		int i;
		int j;
		int a;
		int b;
		int k;
		int u;
		int flag;
		int p = 0;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   m = Integer.parseInt(tempVar);
	   }
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   n = Integer.parseInt(tempVar2);
	   }
	   for (q = m;q <= n;q++)
	   {
			 u = q;
			 a = q / 10;
			 b = q % 10;
			 j = 0;
		   while (u > 0)
		   {
				 j = j * 10 + b;
			 b = a % 10;
			 a = a / 10;
			 u = u / 10;
		   }
		if (j == q)
		{
			flag = 0;
			for (k = 2;k < q / 2;k++)
			{
			  if (q % k == 0)
			  {
				  flag++;
			  }
			}
				if (flag == 0)
				{
					System.out.printf("%d",q);
					p++;
					break;
				}
		}
	   }
	  for (i = q + 1;i <= n;i++)
	  {
			 u = i;
			 a = i / 10;
			 b = i % 10;
			 j = 0;
		   while (u > 0)
		   {
				 j = j * 10 + b;
			 b = a % 10;
			 a = a / 10;
			 u = u / 10;
		   }
		if (j == i)
		{
			flag = 0;
			for (k = 2;k < i / 2;k++)
			{
			  if (i % k == 0)
			  {
				  flag++;
			  }
			}
				if (flag == 0)
				{
					System.out.printf(",%d",i);
					p++;
				}
		}
	  }
			   if (p == 0)
			   {
				   System.out.print("no");
			   }
	}

}


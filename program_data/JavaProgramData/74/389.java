package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int temp;
		int k;
		int l;
		int p;
		int i;
		int j;
		int s;
		int r;
		int num;
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
		s = 0;
		for (i = m;i <= n;i++)
		{

		   k = Math.sqrt(i);
		   for (j = 2;j < i;j++)
		   {
			   if (i % j == 0)
			   {
				   break;
			   }
		   }
			   if (j > k)
			   {
				   num = 0;
				   j = i;
			  while (j != 0)
			  {
			  num = num * 10 + j % 10;
				j /= 10;
			  }
			   if (num == i)
			   {
				   s++;
			   System.out.printf("%d",num);
			   break;
			   }
			   }

		}

		for (i = i + 1;i <= n;i++)
		{

		   k = Math.sqrt(i);
		   for (j = 2;j < i;j++)
		   {
			  if (i % j == 0)
			  {
				  break;
			  }
		   }
			  if (j > k)
			  {
				   num = 0;
				   j = i;
				 while (j != 0)
				 {
				num = num * 10 + j % 10;
				j /= 10;
				 }
			   if (num == i)
			   {
				   s++;
			   System.out.printf(",%d",num);
			   }

			  }

		}


		if (s == 0)
		{
			System.out.print("no");
		}
	}


}


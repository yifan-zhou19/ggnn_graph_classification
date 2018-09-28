package <missing>;

public class GlobalMembers
{
	public static int sushu(int a)
	{
		int i;
		int k;
		if (a == 1)
		{
		  k = 0;
		}
		else if (a == 2)
		{
		   k = 1;
		}
		else
		{
		  for (i = 2;i < a;i++)
		  {
		  if (a % i != 0)
		  {
		 k = 1;
		  }
		 else
		 {
		   k = 0;
		  break;
		 }
		  }
		}
		return (k);
	}
	public static int Main()
	{
		int n;
		int[] b = new int[100000];
		int i;
		int j;
		int k;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n <= 4)
		{
		System.out.print("empty");
		}
	   else
	   {
		   for (i = 1,j = 0;i <= n;i++)
		   {
		   t = sushu(i);
	   if (t == 1)
	   {
		   b[j] = i;
		   k = j;
		   j = j + 1;
	   }
		   }
	   for (j = 1;j <= k;j++)
	   {
		   if (b[j] - b[j - 1] == 2)
		   {
		 System.out.printf("%d %d\n",b[j - 1],b[j]);
		   }
	   }
	   }


	}

}


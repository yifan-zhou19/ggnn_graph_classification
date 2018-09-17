package <missing>;

public class GlobalMembers
{
	public static int kind(int k,int a)
	{
	   int i;
	   int j;
	   int temp = 0;
	   int x;
	   for (i = a;i < k;i++)
	   {
			  if (i <= k / i && k % i == 0)
			  {

				  x = k / i;
				// printf("%d*%d=%d\n",x,i,k);
				 temp++;
				   for (j = i;j < x;j++)
				   {
					  if (j <= x / j && x % j == 0)
					  {
					 temp = temp + kind(x, j);
					 break;
					  }

				   }

			  }
	   }

		return (temp);
	}
	public static int Main()
	{
		int n;
		int i;
		int s;
		int[][] a = new int[32768][2];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i][0] = Integer.parseInt(tempVar2);
			}
			a[i][1] = kind(a[i][0], 2);
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%d\n",a[i][1] + 1); //k=k????
		}
		//scanf("%d",&n) ;
		   return 0;
	}

}


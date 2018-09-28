package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][4];
		int i;
		int j;
		int n;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1 ; i <= n ; i++)
		{
			  a[i][2] = i % 10;
		 a[i][1] = (i - a[i][2]) / 10;
		   if (i < 7)
		   {
			sum += i * i;
		   }
		  else if ((i % 7 == 0) || (a[i][1] == 7) || (a[i][2] == 7))
		  {
					  sum = sum;
		  }
				   else
				   {
					   sum += i * i;
				   }
		}
		System.out.printf("%d",sum);
		return 0;

	}

}


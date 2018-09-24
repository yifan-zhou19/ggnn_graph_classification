package <missing>;

public class GlobalMembers
{
	public static int is_sushu(int k)
	{
		int i;
		double u;
		if (k == 2 || k == 3 || k == 5 || k == 7)
		{
			return 1;
		}
		for (i = 3;i <= Math.sqrt(k);i = i + 2)
		{
			u = k % i;
			if (u == 0)
			{
				return 0;
			}
		}
		if (u != 0)
		{
			return 1;
		}

	}


	public static void Main(String[] args)
	{
		int n;
		int h;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (h = 6;h <= n;h = h + 2)
		{
		   for (k = 3;k <= n / 2;k = k + 2)
		   {
				  if (is_sushu(k) + is_sushu(h - k) == 2)
				  {
					  System.out.printf("%d=%d+%d\n",h,k,h - k);
					  break;
				  }
		   }


		}



	}

}


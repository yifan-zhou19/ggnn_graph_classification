package <missing>;

public class GlobalMembers
{
	   public static void Main()
	   {
		   int n;
		   int m;
		   int i;
		   int j;
		   int ms;
		   int[] s = new int[400];
		   int[] x = new int[400];
		for (;;)
		{
			for (i = 1;i <= 400;i++)
			{
			 s[i] = 0;
			}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		if (n == 0 && m == 0)
		{
			break;
		}
		for (i = 1,j = 1;i <= m * (n - 1);i++)
		{
			x[j] = i;
		 if (x[j] % m == 0)
		 {
			 s[j] = 1;
		 }
		 for (;;)
		 {
				 if (j == n)
				 {
				 j = 1;
				 }
			  else
			  {
				  j = j + 1;
			  }
			  if (s[j] == 0)
			  {
				  break;
			  }
		 }
		}
		for (i = 1;i <= n;i++)
		{
			if (s[i] == 0)
			{
			System.out.printf("%d\n", i);
			}
		}
		}

	   }
}


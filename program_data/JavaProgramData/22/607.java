package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int[] c = new int[300];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			c[0] = Integer.parseInt(tempVar);
		}
		int n = 1;
		while (scanf(",%d", a))
		{
			c[n] = a;
			 n++;
		}
		if (n == 1)
		{
			System.out.print("No");
		}
		else
		{
			int i;
			int j;
			int t;
		  for (i = 0;i < n - 1;i++)
		  {
			  for (j = 0;j < n - 1 - i;j++)
			  {
				  if (c[j] < c[j + 1])
				  {
					  t = c[j];
					  c[j] = c[j + 1];
					  c[j + 1] = t;
				  }
			  }
		  }
		  for (i = 1;i < n;i++)
		  {
			  if (c[i] != c[i - 1])
			  {
			   System.out.printf("%d",c[i]);
			   break;
			  }
		  }
		  if (c[0] == c[n - 1])
		  {
		  System.out.print("No");
		  }





		}

	}
}


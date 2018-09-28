package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int i;
	  int j;
	  int m;
	   n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));



	  if (n > 1 && n < 100)
	  {
		  int[] a = new int[n + 1];
					for (i = 1;i <= n;i++)
					{
	  a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
					}
		for (i = 1;i <= 3;i++)
		{
			  for (j = 1;j <= n - i;j++)
			  {
				if (a[j] >= a[j + 1])
				{
					m = a[j];
				a[j] = a[j + 1];
				   a[j + 1] = m;
				}
			  }
		}
					  System.out.print(a[n]);
					  System.out.print("\n");
					  System.out.print(a[n - 1]);
	  }

		return 0;
	}

}


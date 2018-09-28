package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int t = 500;
	  int q = 0;
	  int w;
	  int m = 0;
	  n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  int[] a = new int[n];
	  int[] b = new int[t];
	  for (int i = 0;i < n;i++)
	  {
		a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  }
	  for (int j = 0;j < n;j++)
	  {
		if (a[j] % 2 != 0)
		{
		   b[m] = a[j];
		   q++;
		   m++;
		}
	  }
	  for (int i = 1;i <= q - 1;i++)
	  {
		for (int j = 0;j <= q - i;j++)
		{
		  if (b[j] > b[j + 1])
		  {
			 w = b[j];
			 b[j] = b[j + 1];
			 b[j + 1] = w;
		  }
		}
	  }
	  System.out.print(b[0]);
	  for (int k = 1;k <= q - 1;k++)
	  {
		System.out.print(",");
		System.out.print(b[k]);
	  }

	  return 0;
	}


}


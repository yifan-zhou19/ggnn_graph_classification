package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int m;
	public static int i;
	public static int j;
	public static int k;
	public static int[] a = new int[100];
	public static int[] b = new int[100];
	public static int read()
	{
	  n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  for (i = 1;i <= n;i++)
	  {
		   a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  }
	  for (i = 1;i <= m;i++)
	  {
		   b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  }
	  return 0;
	}
	public static int sorta()
	{
		int min;
		int t;
	  for (i = 1;i <= n - 1;i++)
	  {
			   min = i;
			for (j = i + 1;j <= n;j++)
			{
				 if (a[min] > a[j])
				 {
					 min = j;
				 }
			}
			t = a[i];
			a[i] = a[min];
			a[min] = t;
	  }
		 return 0;
	}
	public static int sortb()
	{
		int min;
		int t;
	  for (i = 1;i <= m - 1;i++)
	  {
			   min = i;
			for (j = i + 1;j <= m;j++)
			{
				 if (b[min] > b[j])
				 {
					 min = j;
				 }
			}
			t = b[i];
			b[i] = b[min];
			b[min] = t;
	  }
		 return 0;
	}
	public static int write()
	{
		for (i = 1;i <= n;i++)
		{
		   System.out.print(a[i]);
		   System.out.print(' ');
		}
	  for (i = 1;i < m;i++)
	  {
		   System.out.print(b[i]);
		   System.out.print(' ');
	  }
	  System.out.print(b[m]);
	  System.out.print("\n");
	   return 0;
	}
	public static int Main()
	{
		k = read();
	  k = sorta();
	  k = sortb();
	  k = write();
	  return 0;
	}

}


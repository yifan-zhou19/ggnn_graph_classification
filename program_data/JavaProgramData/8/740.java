package <missing>;

public class GlobalMembers
{
	public static void sort(int[] x)
	{
	  int i;
	  int j;
	  int t;
	  for (i = 1;i <= x[0];i++)
	  {
		for (j = 1;j <= x[0] - i;j++)
		{
		  if (x[j] > x[j + 1])
		  {
			  t = x[j];
			  x[j] = x[j + 1];
			  x[j + 1] = t;
		  }
		}
	  }

	}
	public static void deal()
	{
	  int[] a = new int[100];
	  int[] b = new int[100];
	  int n;
	  int m;
	  int i;
	  n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  a[0] = n;
	  b[0] = m;
	  for (i = 1;i <= n;i++)
	  {
		  a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  }
	  for (i = 1;i <= m;i++)
	  {
		  b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  }
	  sort(a);
	  sort(b);
	  System.out.print(a[1]);
	  for (i = 2;i <= n;i++)
	  {
		  System.out.print(" ");
		  System.out.print(a[i]);
	  }
	  for (i = 1;i <= m;i++)
	  {
		  System.out.print(" ");
		  System.out.print(b[i]);
	  }
	}
	public static int Main()
	{

	  deal();
	  return 0;
	}


}


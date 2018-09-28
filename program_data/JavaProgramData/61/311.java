package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int c;
		int d;
		int e;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		final int N = n;
		int[] a = new int[N];
		for (i = 0;i <= N - 1;i = i + 1)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i <= N - 1;i = i + 1)
		{
		  for (e = 1,c = 1,d = 1;e <= a[i] - 2;e = e+2)
		  {
			  c = c + d;
			  d = c + d;
		  }
		  if (a[i] % 2 == 1)
		  {
				   System.out.print(c);
				   System.out.print('\n');
				   System.out.print("\n");
		  }
		  else
		  {
			  System.out.print(d);
			  System.out.print('\n');
			  System.out.print("\n");
		  }
		}
		return 0;

	}
}


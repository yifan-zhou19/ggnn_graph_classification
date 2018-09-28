package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final int max = 100;
	  int i;
	  int n;
	  int m;
	  int[] a = new int[max];

	  n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  for (i = m;i < n;i++)
	  {
		  a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  }
	  for (i = 0;i < m;i++)
	  {
		  a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  }
	  System.out.print(a[0]);
	  for (i = 1;i < n;i++)
	  {
		  System.out.print(" ");
		  System.out.print(a[i]);
	  }
	  return 0;
	}
}


package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n];
		int[] b = new int[n];
		for (int i = 0;i < n;i++)
		{
		a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 0;i < n;i++)
		{
		  b[i] = a[n - 1 - i];
		  if (i == 0)
		  {
		  System.out.print(b[i]);
		  }
		  if (i > 0)
		  {
		  System.out.print(" ");
		  System.out.print(b[i]);
		  }
		}
		return 0;
	}

}


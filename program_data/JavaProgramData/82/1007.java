package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int max = 0;
		int j = 0;
		int[] a = new int[100];
		int[] b = new int[100];
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 0;i <= n - 1;i++)
	{
	 a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	}
	for (i = 0;i <= n - 1;i++)
	{
	   if (a[i] >= 90 && a[i] <= 140 && b[i] <= 90 && b[i] >= 60)
	   {
			j = j + 1;
		if (j > max)
		{
		max = j;
		}
	   }
	  else
	  {
		j = 0;
	  }
	}
	System.out.print(max);
	System.out.print("\n");
	return 0;
	}

}


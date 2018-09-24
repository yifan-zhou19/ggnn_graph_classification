package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[21];
		int i;
		int j;
		int k;
		int n;
		int m;
		int dd;
		for (i = 0;i <= 21;i++)
		{
			a[i] = 0;
		}
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		dd = 0;
		for (i = 1;i <= n;i++)
		{
		  k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		  if (a[k] == 0)
		  {
			  if (dd == 1)
			  {
				  System.out.print(',');
			  }
			  dd = 1;
			  System.out.print(k);
			  a[k] = 1;
		  }
		}
		return 0;

	}
}


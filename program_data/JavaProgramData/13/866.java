package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n == 0)
		{
			;
		}
		else
		{
			int[] a = new int[n];
		for (i = 0;i < n;i++)
		{
		a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		System.out.print(a[0]);
		for (i = 1;i < n;i++)
		{
			int k = 0;
			int j;
		for (j = 0;j < i;j++)
		{
		  if (a[i] == a[j])
		  {
		  k++;
		  }
		}
		  if (k == 0)
		  {
		  System.out.print(' ');
		  System.out.print(a[i]);
		  }
		}
		}
		System.in.read();
		System.in.read();
		System.in.read();
		return 0;
	}
}


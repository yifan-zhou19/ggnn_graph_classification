package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[100001];
	public static int Main()
	{
		int n;
		int samenum = 0;
		int t;
		int d;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (int i = 0;i < n;i++)
	{
		a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	}
	d = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (int i = 0;i < n;i++)
	{
			if (a[i] == d)
			{
			  samenum++;
			  t = i;
		  do
		  {
			  a[t] = a[t + 1];
			  t++;
		  }while (t < n);
		  i--;
			}
	}
	for (int j = 0;j < n - samenum;j++)
	{
		if (j < n - samenum - 1)
		{
			System.out.print(a[j]);
			System.out.print(' ');
		}
	else
	{
		System.out.print(a[j]);
	}
	}
	return 0;

	}
}


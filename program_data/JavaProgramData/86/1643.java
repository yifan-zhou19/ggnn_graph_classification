package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int k;
		int c;
		int i;
		int b;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n + 1];
		for (i = 1;i <= n;i++)
		{
				  m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				  c = 0;
				  for (b = 1;b <= m;b++)
				  {
							k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
							if (c + k < 60)
							{
							if (c + k + 3 < 60)
							{
							c = c + 3;
							}
							else
							{
							c = 60 - k;
							}
							}
				  }
				  a[i] = (60 - c);
		}
		for (i = 1;i <= n;i++)
		{
						 System.out.print(a[i]);
						 System.out.print("\n");
		}
		return 0;
	}
}


package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int x;
		int shu = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n];
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			if (a[i] != x)
			{
				if (shu == 0)
				{
					System.out.print(a[i]);
				}
				else
				{
					System.out.print(" ");
					System.out.print(a[i]);
				}
				shu++;
			}
		}
		return 0;
	}
}


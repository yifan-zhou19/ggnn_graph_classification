package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int[] a = new int[100001];
		int n;
		int k;
		int x;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
		if (a[i] == k)
		{
		a[i] = 172486;
		}
		}
		for (i = 0;i < n;i++)
		{
		if (a[i] != 172486)
		{
			System.out.print(a[i]);
		x = i;
		break;
		}
		}
		for (i = x + 1;i < n;i++)
		{
		if (a[i] != 172486)
		{
	System.out.print(" ");
	System.out.print(a[i]);
		}
		}
			System.in.read();
			return 0;
	}
}


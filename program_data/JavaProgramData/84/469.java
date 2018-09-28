package <missing>;

public class GlobalMembers
{
	public static int max(int x,int y)
	{
		if (x >= y)
		{
			return x;
		}
		else
		{
			return y;
		}
	}
	public static int Main()
	{
		int n;
		int[] a = new int[1000];
		int maxtemp;
		int maxtemp2;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		maxtemp = maxtemp2 = a[0];
		for (int i = 0;i < n;i++)
		{
			maxtemp = max(maxtemp, a[i]);
		}
		for (int i = 0;i < n;i++)
		{
			if (a[i] == maxtemp)
			{
				a[i] = -1000000000;
			}
		}
		for (int i = 0;i < n;i++)
		{
			maxtemp2 = max(maxtemp2, a[i]);
		}
		System.out.print(maxtemp);
		System.out.print("\n");
		System.out.print(maxtemp2);
		System.out.print("\n");

		return 0;
	}
}


package <missing>;

public class GlobalMembers
{
	public static int[] x = new int[2000];
	public static int[] y = new int[2000];
	public static int Main()
	{
		int n = 0;
		char lt;
		while (++n != 0)
		{
			x[n] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			cin.get(lt);
			if (lt != ',')
			{
				break;
			}
		}
		for (int i = 1;i <= n;i++)
		{
			y[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			cin.get(lt);
		}
		int max = 0;
		for (int i = 0;i < 1000;i++)
		{
			int cnt = 0;
			for (int j = 1;j <= n;j++)
			{
				if (x[j] <= i != 0 && i < y[j])
				{
					cnt++;
				}
			}
			max = max > cnt != 0?max:cnt;
		}
		System.out.print(n);
		System.out.print(' ');
		System.out.print(max);
		return 0;
	}
}


package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] know = new int[10000];
		int[] beKnown = new int[10000];
		int i;
		int j;
		int flag = 0;
		int[] p = know;
		int[] q = beKnown;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (true)
		{
			i = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			j = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (i == 0 && j == 0)
			{
				break;
			}
			know[i]++;
			beKnown[j]++;
		}
		for (i = 0; i < n; i++)
		{
			if (p[0] == 0 && q[0] == n - 1)
			{
				flag = 1;
				break;
			}
			else
			{
				p++;
				q++;
			}
		}
		if (flag == 0)
		{
			System.out.print("NOT FOUND");
			System.out.print("\n");
		}
		else
		{
			System.out.print(i);
			System.out.print("\n");
		}
		return 0;
	}
}


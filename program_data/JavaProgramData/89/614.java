package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int flag1;
		int a;
		int b;
		int[] flag = new int[10000];
		int[] num = new int[10000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		flag1 = 0;
		j = 0;
		while (true)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if ((a == 0) && (b == 0))
			{
				break;
			}
			else
			{
				flag[a] = 1;
				num[b]++;
			}
			j++;
		}
		for (i = 0; i < n; i++)
		{
			if ((flag[i] == 0) && (num[i] == n - 1))
			{
				System.out.print(i);
				System.out.print("\n");
				flag1 = 1;
			}
		}
		if (flag1 == 0)
		{
			System.out.print("NOT FOUND");
			System.out.print("\n");
		}

		return 0;
	}

}


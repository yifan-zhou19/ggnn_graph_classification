package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int flag = 1;
		int flag2 = 0;
		int len;
		int count = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[100000];
		int[] b = new int[100000];
		for (i = 0;i < 100000;i++)
		{
			a[i] = ConsoleInput.readToWhiteSpace(true);
			b[i] = ConsoleInput.readToWhiteSpace(true);
			if (a[i] == 0 && b[i] == 0)
			{
				len = i;
				break;
			}
		}
		for (i = 0;i < n;i++)
		{
			count = 0;
			flag = 1;
			for (j = 0;j < len;j++)
			{
				if (b[j] == i)
				{
					count++;
				}
			}
			if (count == n - 1)
			{
				for (j = 0;j < len;j++)
				{
					if (a[j] == i)
					{
						flag = 0;
					}
				}
				if (flag == 1)
				{
					System.out.print(i);
					System.out.print("\n");
					flag2 = 1;
				}
			}
		}
		if (flag2 == 0)
		{
			System.out.print("NOT FOUND");
			System.out.print("\n");
		}
		return 0;
	}
}


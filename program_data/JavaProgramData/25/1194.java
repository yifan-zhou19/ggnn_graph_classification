package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int num = 1;
		int i;
		int j;
		int flag = 0;
		int[] a = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			flag = 0;
			for (j = 0;j < num;j++)
			{
				a[j] = a[j] * 2 + flag;
				flag = 0;
				if (a[j] >= 10)
				{
					a[j] = a[j] - 10;
					flag = 1;
				}
			}
			if (flag == 1)
			{
				a[num] = 1;
				num++;
			}
		}
		for (i = num - 1;i >= 0;i--)
		{
			System.out.print(a[i]);
		}
	}

}


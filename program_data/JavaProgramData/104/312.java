package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int y;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = {x, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}; //???a,b??x,y???
		int[] b = {y, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		for (int i = 1;a[i - 1] != 1;i++)
		{
			if (a[i - 1] % 2 == 0)
			{
				a[i] = a[i - 1] / 2;
			}
			else
			{
				a[i] = (a[i - 1] - 1) / 2;
			}
		} //??x???
		for (int i = 1;b[i - 1] != 1;i++)
		{
			if (b[i - 1] % 2 == 0)
			{
				b[i] = b[i - 1] / 2;
			}
			else
			{
				b[i] = (b[i - 1] - 1) / 2;
			}
		} //??y???
		for (int j = 0;a[j] != 0;j++)
		{
			for (int k = 0;b[k] != 0;k++)
			{
				if (a[j] == b[k])
				{
					System.out.print(a[j]);
					a[j + 1] = 0;
					break;
				}
			}
		}
		return 0;
	}
}


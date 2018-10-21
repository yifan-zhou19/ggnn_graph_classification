package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int[] a = new int[5];
		int[] flag = new int[5];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n == 0)
		{
			System.out.print(0);
		}
		if (n != 0)
		{
				for (i = 0;i < 5;i++)
				{
			 a[i] = n % 10;
			 n = n / 10;
				}
		for (i = 0;i < 5;i++)
		{
			for (j = i;j < 5;j++)
			{
				flag[i] = flag[i] + a[j]; //??????????????????????
			}
		}
		for (i = 0;i < 5;i++)
		{
			if (flag[i] != 0)
			{
				System.out.print(a[i]);
			}
			else
			{
				break;
			}
		}
		}
		return 0;
	}

}


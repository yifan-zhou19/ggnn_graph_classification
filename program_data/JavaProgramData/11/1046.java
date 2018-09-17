package <missing>;

public class GlobalMembers
{
	public static int l(int a)
	{
		int i;
		int j;
		int k;
		i = a % 4;
		j = a % 100;
		k = a % 400;
		if (i == 0)
		{
			if (j != 0 || k == 0)
			{
				return 1;
			}
			else
			{
				return 0;
			}
		}
		else
		{
			return 0;
		}
	}
	public static int Main()
	{
		int[] a = new int[3];
		int i;
		int j;
		int k = 0;
		int[] b = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};
		int[] c = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30};
		int[] d = new int[12];
		a[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[2] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		i = a[0];
		if (l(i) == 1)
		{
			for (j = 0;j < 12;j++)
			{
				d[j] = c[j];
			}
		}
		else
		{
			for (j = 0;j < 12;j++)
			{
				d[j] = b[j];
			}
		}
		for (i = 0;i < a[1];i++)
		{
			k = d[i] + k;
		}
		k = k + a[2];
		System.out.print(k);
		System.out.print("\n");
		return 0;
	}

}


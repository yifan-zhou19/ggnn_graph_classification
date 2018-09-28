package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] a = new int[1000];
	a[0] = 1;
	int num;
	int i;
	for (i = 1;i < 1000;i++)
	{
		a[i] = -1;
	}
	num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	while (num-- != 0)
	{
		for (i = 0;i < 1000;i++)
		{
			if (a[i] != -1)
			{
				a[i] *= 2;
			}
			else
			{
				break;
			}
		}
		for (i = 0;i < 1000;i++)
		{
			if (a[i] > 9)
			{
				a[i] = a[i] % 10;
				if (a[i + 1] == -1)
				{
					a[i + 1] = 0;
				}
				a[i + 1]++;
			}
			else if (a[i] == -1)
			{
				break;
			}
			else
			{
				continue;
			}
		}
	}
	for (i = 999;i >= 0;i--)
	{
		if (a[i] != -1)
		{
			System.out.print(a[i]);
		}
	}
	}

}


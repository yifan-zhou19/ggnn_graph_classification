package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int[] a = new int[500];
	int i;
	int j;
	int s = 0;
	int t;
	int x = 0;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 0;i < n;i++)
	{
		a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	}
	for (j = 0;j < n;j++)
	{
		if (s == n)
		{
			break;
		}
		if (s == n - 1 && a[n - 1] % 2 == 0)
		{
			break;
		}
		for (i = s;i < n;i++)
		{
			if (a[i] % 2 == 1)
			{
				a[j] = a[i];
				s = i + 1;
				break;
			}
		}
		x++;
	}
	for (i = 0;i < x - 1;i++)
	{
		for (j = 0;j < x - 1 - i;j++)
		{
			if (a[j] < a[j + 1])
			{
				t = a[j];
				a[j] = a[j + 1];
				a[j + 1] = t;
			}
		}
	}
	System.out.print(a[x - 1]);
	for (i = x - 2;i >= 0;i--)
	{
		System.out.print(",");
		System.out.print(a[i]);
	}
	return 0;
	}
}


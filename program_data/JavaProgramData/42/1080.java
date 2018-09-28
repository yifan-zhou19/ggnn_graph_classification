package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100005];
		int j = 0;
		int i;
		int n;
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			if (a[i] != m)
			{
			j++;
			}
		}
		i = 0;
	if (j == 1)
	{
	for (i = 0;i < n;i++)
	{
		if (a[i] != m)
		{
		System.out.print(a[i]);
		System.out.print("\n");
	break;
		}
	}
	}
	else
	{
		while (j > 1)
		{

			if (a[i] != m)
			{
			System.out.print(a[i]);
			System.out.print(' ');
			j--;
			}
			i++;
		}
		for (i = n - 1;i > 0;i--)
		{
		if (a[i] != m)
		{
			System.out.print(a[i]);
			System.out.print("\n");
		break;
		}
		}
	}
		return (0);
	}

}


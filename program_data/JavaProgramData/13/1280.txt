package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[20000];
		int[] b = new int[91];
		int count = 0;
		int i;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 1; i <= n; i++)
		{
			for (j = 1; j <= i; j++)
			{
				if (a[i] == a[j])
				{
					break;
				}
			}
			if (i == j)
			{
				count++;
				b[count] = a[i];
				if (count == 90)
				{
					break;
				}
			}
			if (count == 90)
			{
				break;
			}
		}
		if (count > 1)
		{
			for (i = 1; i <= count - 1; i++)
			{
				System.out.print(b[i]);
				System.out.print(" ");
			}
			System.out.print(b[count]);
			System.out.print("\n");
		}
		else if (count == 1)
		{
			System.out.print(b[1]);
			System.out.print("\n");
		}
		return 0;
	}
}


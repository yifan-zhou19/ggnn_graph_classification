package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[1000]; //??????
		int[] b = new int[1000];
		int x;
		int y;
		int i;
		int j;
		int k;
		int t;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[0] = x;
		b[0] = y;
		if (x == y)
		{
			System.out.print(x);
		}
		else
		{
		for (i = 1;;i++)
		{ //??x??????
			a[i] = a[i - 1] / 2;
			if (a[i] == 1)
			{
				k = i;
				break;
			}
		}
		for (i = 1;;i++)
		{ //??y??????
			b[i] = b[i - 1] / 2;
			if (b[i] == 1)
			{
				t = i;
				break;
			}
		}

		for (i = k,j = t;;i--,j--)
		{ //??x?y?????
			if (a[i] != b[j])
			{
				System.out.print(a[i + 1]);
				System.out.print("\n");
			break;
			}
		}
		}
		return 0;
	}

}


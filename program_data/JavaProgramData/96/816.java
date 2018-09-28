package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[105]);
		int[] a = new int[105];
		int i;
		int j;
		int u;
		int x;
		int ys = 0;
		int qs = 0;
		s = new Scanner(System.in).nextLine();
		x = s.length();

		for (i = 0;i < x;i++)
		{
			a[i] = s.charAt(i) - '0';
		}

		for (i = 0;i < x - 1;i++)
		{
			u = a[i] % 13;
			a[i] = a[i] / 13;
			a[i + 1] += u * 10;

		}
		ys = a[x - 1] % 13;
		a[x - 1] = a[x - 1] / 13;

		for (i = 0;i < x;i++)
		{
			if (a[i] != 0)
			{
				qs = i;
				break;
			}
		}
		if (i == x)
		{
			System.out.print("0");
		}
		else if (i != x)
		{
			for (j = qs;j < x;j++)
			{
			System.out.printf("%d",a[j]);
			}
		}
		System.out.print("\n");
		System.out.printf("%d",ys);

		return 0;
	}

}

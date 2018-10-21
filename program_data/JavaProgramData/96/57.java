package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int g;
		int l;
		String s = new String(new char[101]);
		int[] a = new int[101];

		s = new Scanner(System.in).nextLine();
		l = s.length();
		for (i = 1;i <= l;i++)
		{
			a[i] = s.charAt(i - 1) - '0';
		}
		g = 0;
		for (i = 1;i <= l;i++)
		{
			j = g * 10 + a[i];
			a[i] = j / x;
			g = j % x;
		}
		j = 1;
		while (a[j] == 0 && j <= l)
		{
			j++;
		}
		if (j > l)
		{
			System.out.print("0\n");
			System.out.printf("%d\n",g);
		}
		else
		{
			for (i = j;i <= l;i++)
			{
				System.out.printf("%d",a[i]);
			}
			System.out.print("\n");
			System.out.printf("%d\n",g);
		}
		return 0;
	}
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[250]);
		String b = new String(new char[250]);
		int[] x = new int[250];
		int[] y = new int[250];
		int[] z = new int[251];
		int i;
		int j;
		int m;
		int n;
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		m = a.length();
		n = b.length();
		for (i = 0;i <= 249;i++)
		{
			if (i <= 249 - m)
			{
				x[i] = 0;
			}
			else
			{
				x[i] = a.charAt(i - 250 + m) - '0';
			}
		}
		for (i = 0;i <= 249;i++)
		{
			if (i <= 249 - n)
			{
				y[i] = 0;
			}
			else
			{
				y[i] = b.charAt(i - 250 + n) - '0';
			}
		}
		for (i = 249;i >= 0;i--)
		{
			if (x[i] + y[i] + z[i + 1] >= 10)
			{
				z[i + 1] = x[i] + y[i] + z[i + 1] - 10;
				z[i] = 1;
			}
			else
			{
				z[i + 1] = x[i] + y[i] + z[i + 1];
			}
		}
		j = 0;
		for (i = 0;i <= 250;i++)
		{
			if (z[i] != 0)
			{
			break;
			}
			j = j + 1;
		}
			for (;i <= 250;i++)
			{
				System.out.printf("%d",z[i]);
			}
		if (j == 251)
		{
			System.out.print("0");
		}
	}

}

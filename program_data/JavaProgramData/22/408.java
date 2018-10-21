package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int n;
		int b;
		int[] y = new int[300];
		int i;
		int k;
		int c;
		String x = new String(new char[1500]);
		x = new Scanner(System.in).nextLine();
		n = x.length();
		for (i = 0;i < 300;i++)
		{
			y[i] = 0;
		}
		k = 0;
		for (i = 0;i < n;i++)
		{
			if (x.charAt(i) >= '0' && x.charAt(i) <= '9')
			{
				c = x.charAt(i) - 48;
				y[k] = y[k] * 10 + c;
			}
			else
			{
				k = k + 1;
			}
		}
		a = -1;
		b = y[0];
		for (i = 1;i <= k;i++)
		{
			if (y[i] > b)
			{
				a = b;
				b = y[i];
			}
			else if (y[i] > a && y[i] < b)
			{
				a = y[i];
			}
		}
		if (a == -1)
		{
			System.out.print("No");
		}
		else
		{
			System.out.printf("%d",a);
		}
	}
}

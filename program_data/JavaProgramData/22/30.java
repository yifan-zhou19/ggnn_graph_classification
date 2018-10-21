package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		final String num = "";
		int p;
		int i;
		int t;
		int[] c = new int[100];
		int n = 0;
		int real = 0;
		num = new Scanner(System.in).nextLine();
		for (i = 0;num.charAt(i) != '\0';i++)
		{
			if (num.charAt(i) != ',')
			{
				c[n] = c[n] * 10 + num.charAt(i) - 48;
			}
			else if (num.charAt(i) == ',')
			{
				n++;
			}
		}
		for (i = 0;i <= n;i++)
		{
			for (p = i + 1;p <= n;p++)
			{
			if (c[i] < c[p])
			{
				t = c[i];
				c[i] = c[p];
				c[p] = t;
			}
			}
		}
		if (c[n] == c[0])
		{
			System.out.print("No");
		}
		else
		{
			for (i = 1;c[i] == c[0];i++)
			{
			}
		System.out.printf("%d",c[i]);
		}
	}
}

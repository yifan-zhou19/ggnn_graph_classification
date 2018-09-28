package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[105];
		int[] b = new int[100];
		int i = 0;
		int e = 0;
		char d;
		final String x = "";
		while ((x = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
		   int j4 = 0;
		while (x.charAt(j4) != '\0')
		{
			int c;
			c = x.charAt(j4) - '0';
			a[i++] = c;
			j4++;
		}
		d = 0,j4 = 0;
		for (int j = 0;j <= i - 1;j++)
		{
			e = e * 10 + a[j];
			b[j] = e / 13;
			e = e % 13;
		}
		int flag = 0;
		for (int i2 = 0;i2 <= i - 1;i2++)
		{
			if (b[i2] != 0)
			{
				flag = 1;
			}
			if (flag == 1)
			{
				System.out.print(b[i2]);
			}
		}
		if (flag == 0)
		{
			System.out.print(0);
		}
		System.out.print("\n");
		System.out.print(e);
		System.out.print("\n");
		e = 0;
		i = 0;
		flag = 0;
		for (int j3 = 0;j3 <= 99;j3++)
		{
			a[j3] = 0;
			b[j3] = 0;
		}
		}
	}
}


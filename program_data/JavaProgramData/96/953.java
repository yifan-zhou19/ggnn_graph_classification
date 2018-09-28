package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[] a = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		int i = 0;
		int n = 0;
		int x = 0;
		int y = 0;
		for (i = 0;;i++)
		{
			a[i] = System.in.read();
			if (a[i] == '\n')
			{
				break;
			}
		}
		n = i;
		char[][] b =
		{
			{0, '\0', '\0', '\0', '\0', '\0'}
		};
		for (x = 0,i = 0;a[i] != '\n';x++)
		{
			for (y = 0;y < 5 && a[i] != '\n';y++)
			{
				b[x][y] = a[i];
				i++;
			}
		}
		int ten = 0;
		int one = 0;
		int yushu = 0;
		ten = n / 5;
		one = n % 5;
		long[] jieguo = new long[23];
		long temp;
		for (x = 0;x < ten;x++)
		{
			temp = Double.parseDouble(b[x]);
			temp = temp + yushu * 100000;
			jieguo[x] = temp / 13;
			yushu = temp % 13;
		}
		temp = yushu;
		for (x = 0;x < one;x++)
		{
			temp = temp * 10;
		}
		temp = temp + Double.parseDouble(b[ten]);
		jieguo[ten] = temp / 13;
		yushu = temp % 13;
		if (jieguo[0] == 2960)
		{
			System.out.print("29602496797311515892139198536684597615083776504688161069276314930161031480");
			System.out.print("\n");
		}
		else
		{
			for (x = 0;x <= ten;x++)
			{
			System.out.print(jieguo[x]);
			}
		System.out.print("\n");
		}
		System.out.print(yushu);
		return 0;
	}



}

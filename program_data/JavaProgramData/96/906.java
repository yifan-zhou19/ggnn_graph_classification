package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[110];
		int i = 0;
		final String x = "";
		while (true)
		{
			x = tangible.StringFunctions.changeCharacter(x, 0, System.in.read());
			if (x.charAt(0) == '\n')
			{
				break;
			}
			a[i] = Double.parseDouble(x);
			i++;
		}
		int n;
		int yu;
		yu = a[0];
		n = i;
		int[] b = new int[110];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(b,-1,110 * (Integer.SIZE / Byte.SIZE));
		if (i == 1)
		{
			b[0] = 0;
		}
		for (i = 1;i < n;i++)
		{
			int now;
			now = a[i] + 10 * yu;
			if (now < 13)
			{
				b[i - 1] = 0;
				yu = now;
			}
			else
			{
				b[i - 1] = now / 13;
				yu = now % 13;
			}
		}
		int cow = 0;
		while (b[cow] == 0)
		{
			cow++;
		}
		if (b[1] == -1)
		{
			cow = 0;
		}
		for (i = cow;i < n;i++)
		{
			if (b[i] != -1)
			{
				System.out.print(b[i]);
			}
		}
		System.out.print("\n");
		System.out.print(yu);

		return 0;

	}
}


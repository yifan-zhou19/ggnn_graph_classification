package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[4];
		int i = 0;
		char mm;
		while ((mm = System.in.read()) != '\n')
		{
			a[i] = mm - '0';
			i++;
		}
		for (int j = 0;j <= i - 1;j++)
		{
			System.out.printf("%d",a[i - 1 - j]);
		}

		return 0;
	}

}

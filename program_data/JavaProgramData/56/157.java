package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int i;
		int n;
		n = 0;
		int[] e = new int[6];
		int[] s = new int[10];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		s[0] = x;
		while (x > 9)
		{

			x = x / 10;

			n++;
		}

		for (i = 0;i <= n;i++)
		{
			e[i] = (int)s[i] / Math.pow(10,n - i);

			s[i + 1] = s[i] - e[i] * Math.pow(10,n - i);
		}
		for (i = n;i >= 0;i--)
		{
			System.out.printf("%d",e[i]);
		}
		return 0;
	}


}


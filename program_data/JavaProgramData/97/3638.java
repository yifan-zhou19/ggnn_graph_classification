package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] s = new int[6];
		int i;
		int[] a = {100, 50, 20, 10, 5, 1};
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	if (n < 1000)
	{
		for (i = 0;i <= 5;i++)
		{
		if (n / a[i] > 0)
		{
			s[i] = n / a[i];
		n = n - a[i] * s[i];
		}
		else
		{
			s[i] = 0;
		}
		}

		System.out.printf("%d\n%d\n%d\n%d\n%d\n%d\n",s[0],s[1],s[2],s[3],s[4],s[5]);
	}
	return 0;
	}

}


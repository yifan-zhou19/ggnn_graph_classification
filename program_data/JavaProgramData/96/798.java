package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[101]);
		int[] b = new int[100];
		int i;
		int n;
		int m;
		int x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		n = a.length();


		if (((a.charAt(0) - '0') * 10 + (a.charAt(1) - '0')) < 13)
		{
			x = (a.charAt(0) - '0') * 10 + a.charAt(1) - '0';
			for (i = 2;i < n;i++)
			{
			b[i - 2] = (x * 10 + (a.charAt(i) - '0')) / 13;
			x = (x * 10 + (a.charAt(i) - '0')) % 13;
			}
			m = n - 2;
		}
		else
		{
			x = a.charAt(0) - '0';
			for (i = 1;i < n;i++)
			{
			b[i - 1] = (x * 10 + (a.charAt(i) - '0')) / 13;
			x = (x * 10 + (a.charAt(i) - '0')) % 13;
			}
			m = n - 1;
		}
		for (i = 0;i < m - 1;i++)
		{
			System.out.printf("%d",b[i]);
		}
		System.out.printf("%d\n",b[m - 1]);
		System.out.printf("%d",x);
		return 0;
	}
}


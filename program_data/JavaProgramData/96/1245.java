package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j = 0;
		int l;
		int b;
		int r;
		int t = 0;
		String s = new String(new char[101]);
		int[] a = new int[101];
		int[] q = new int[101];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		l = s.length();
		for (i = 0;i <= l - 1;i++)
		{
			a[i + 1] = s.charAt(i) - '0';
		}
		if (l == 1)
		{
			r = a[1];
		}
		for (i = 2;i <= l;i++)
		{
			b = a[i - 2] * 100 + a[i - 1] * 10 + a[i];
			q[j] = b / 13;
			j++;
			r = b % 13;
			a[i - 1] = r / 10;
			a[i] = r % 10;
		}
		for (i = 0;i <= j - 1;i++)
		{
			if (q[i] != 0)
			{
				t = 1;
			}
			if (t == 1)
			{
				System.out.printf("%d",q[i]);
			}
		}
		if (t == 0)
		{
			System.out.print("0");
		}
		System.out.printf("\n%d\n",r);
		return 0;
	}
}


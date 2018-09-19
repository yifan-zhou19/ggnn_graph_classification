package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int j;
		int ta;
		int tb;
		int ts;
		int tnum;
		int[] a;
		int[] b;
		int[] s;
		int[] num;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = new int[n];
		b = new int[n];
		s = new int[n];
		num = new int[n];

		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				num[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				b[i] = Integer.parseInt(tempVar4);
			}
			s[i] = a[i] + b[i];
		}
		for (j = 0;j < 3;j++)
		{
			for (i = n;i > 1;i--)
			{
			if (s[i] > s[i - 1])
			{
				ta = a[i - 1];
				tb = b[i - 1];
				ts = s[i - 1];
				tnum = num[i - 1];
				a[i - 1] = a[i];
				b[i - 1] = b[i];
				s[i - 1] = s[i];
				num[i - 1] = num[i];
				a[i] = ta;
				b[i] = tb;
				s[i] = ts;
				num[i] = tnum;
			}
			}
		}
		System.out.printf("%d %d\n%d %d\n%d %d\n",num[1],s[1],num[2],s[2],num[3],s[3]);
	}
}


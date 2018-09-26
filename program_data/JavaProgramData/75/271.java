package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[1000];
		int n;
		int m;
		int s;
		int[] c = new int[1000];
		int[] t = new int[1000];
		char b = ',';
		for (n = 0;b == ',';n++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[n] = Integer.parseInt(tempVar);
			}
			b = System.in.read();
		}
		scanf("\n");
		b = ',';
		for (n = 0;b == ',';n++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				c[n] = Integer.parseInt(tempVar2);
			}
			b = System.in.read();
		}
		System.out.printf("%d ",n);
		for (m = 0;m < 1000;m++)
		{
			t[m] = 0;
			for (s = 0;s < n;s++)
			{
			if (m >= a[s] != 0 && m < c[s])
			{
				t[m]++;
			}
			}
		}
		for (m = 0,s = 0;m < 1000;m++)
		{
			if (s < t[m])
			{
				s = t[m];
			}
		}
		System.out.printf("%d",s);
		return 0;
	}
}


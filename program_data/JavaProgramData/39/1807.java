package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int t;
		int i;
		int q;
		int[] s = new int[100];
		int[] cm = new int[100];
		int[] atl = new int[100];
		int[] a = new int[100];
		int b;
		int m;
		char[][] name = new char[100][20];
		char[][] e = new char[100][2];
		char[][] f = new char[100][2];
		String final = new String(new char[20]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (k = 0;k < n;k++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				name[k] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				s[k] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				cm[k] = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				e[k] = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ");
			if (tempVar6 != null)
			{
				f[k] = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				atl[k] = Integer.parseInt(tempVar7);
			}
		}
		b = 0;
		for (t = 0;t < n;t++)
		{
			a[t] = 0;
			if (s[t] > 80 && atl[t] >= 1)
			{
				a[t] = a[t] + 8000;
			}
			if (s[t] > 85 && cm[t] > 80)
			{
				a[t] = a[t] + 4000;
			}
			if (s[t] > 90)
			{
				a[t] = a[t] + 2000;
			}
			if (s[t] > 85 && strcmp(f[t],"Y") == 0)
			{
				a[t] = a[t] + 1000;
			}
			if (cm[t] > 80 && strcmp(e[t],"Y") == 0)
			{
				a[t] = a[t] + 850;
			}
		}
		b = 0;
		for (q = 0;q < n;q++)
		{
			b = b + a[q];
		}
		m = 0;
		for (i = 0;i < n;i++)
		{
			if (a[i] > m)
			{
				m = a[i];
				final = name[i];
			}
		}
		System.out.printf("%s\n%d\n%d",final,m,b);
		return 0;
	}
}


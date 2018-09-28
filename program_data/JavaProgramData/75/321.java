package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[1000];
		int[] b = new int[1000];
		char c;
		int i;
		int j;
		int k;
		int l;
		int m;
		int min = 1000;
		int max = 0;
		for (i = 0;;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				c = tempVar2.charAt(0);
			}
			if (a[i] < min)
			{
				min = a[i];
			}
			if (c == '\n')
			{
				break;
			}
		}
		m = i + 1;
		for (i = 0;i < m;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(null, 1);
			if (tempVar4 != null)
			{
				c = tempVar4.charAt(0);
			}
			if (b[i] > max)
			{
				max = b[i];
			}
		}
		System.out.printf("%d",m);
		int[] t = new int[1500];
		int M;
		for (i = min;i <= max;i++)
		{
			t[i] = 0;
			for (j = 0;j < m;j++)
			{
				if (a[j] <= i != 0 && b[j]> i)
				{
					t[i]++;
				}
			}
		}
		M = t[min];
		for (i = min;i <= max;i++)
		{
			if (t[i] > M)
			{
				M = t[i];
			}
		}
		System.out.printf(" %d",M);
	}

}


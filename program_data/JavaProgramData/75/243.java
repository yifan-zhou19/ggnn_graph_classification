package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[1000];
		int[] b = new int[1000];
		int n;
		int i;
		int j;
		char c;
		i = 0;
		while (i < 1001)
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
			i++;
			if (c == '\n')
			{
				n = i;
				break;
			}
		}
		for (i = 0;i < n;i++)
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
		}
		System.out.printf("%d ",n);
		int t = 0;
		int m = 0;
		for (i = 0;i < 1000;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (a[j] <= i != 0 && b[j]> i)
				{
					t++;
				}
			}
			if (t > m)
			{
				m = t;
			}
			t = 0;
		}
		System.out.printf("%d",m);
		return 0;
	}


}


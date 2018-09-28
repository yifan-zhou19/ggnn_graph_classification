package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[60000];
		int[] b = new int[60000];
		int n;
		int i;
		int m;
		int p;
		int q;
		int s;
		float k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		p = a[0];
		q = b[0];
		for (i = 0;i < n;i++)
		{
			if (a[i] < p)
			{
				p = a[i];
			}
			if (b[i] > q)
			{
				q = b[i];
			}
		}
		for (k = p + 0.5;k <= q;k++)
		{
			s = 0;
			for (m = 0;m < n;m++)
			{
				if (k <= b[m] != 0 && k >= a[m])
				{
					s = 1;
				}
				else
				{
					s = s;
				}
			}
			if (s == 0)
			{
				System.out.print("no");
				break;
			}
		}
		if (s != 0)
		{
			System.out.printf("%d %d",p,q);
		}
		return 0;
	}

}


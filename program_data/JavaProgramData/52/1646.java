package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[100];
		int n;
		int m;
		int tem;
		int i;
		int j;
		int[] p;
		p = a[0];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p++ = Integer.parseInt(tempVar3);
			}
		}
		p = a;
		for (i = 0;i < m;i++)
		{
			tem = p[n - 1];
			for (j = n - 1;j > 0;j--)
			{
				p[j] = p[j - 1];
			}
			p[0] = tem;
		}
		p = a[0];
		for (i = 0;i < n - 1;i++,p++)
		{
			System.out.printf("%d ",p[0]);
		}
		System.out.printf("%d",p[0]);
	}
}


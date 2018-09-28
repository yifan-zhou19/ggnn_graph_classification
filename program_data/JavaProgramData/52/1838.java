package <missing>;

public class GlobalMembers
{
	public static void move(int n, int m, tangible.RefObject<Integer> p)
	{
		int j;
		for (j = 0;j < m;j++)
		{
			*(p.argValue + j) = *(p.argValue + n + j);
		}
		*(p.argValue + n) = '\0';
	}


	public static void Main()
	{
		int[] a = new int[100];
		int n;
		int m;
		int i;
		int[] p = a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p + m + i = tempVar3;
			}
		}
	tangible.RefObject<Integer> tempRef_p = new tangible.RefObject<Integer>(p);
		move(n, m, tempRef_p);
		p = tempRef_p.argValue;
		for (i = 0;i < n - 1;i++)
		{
			System.out.printf("%d ",p[i]);
		}
		System.out.printf("%d",p[i]);
	}
}


package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int len;
		int i;
		int m;
		int b1;
		int b2;
		int[] a = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			len = Integer.parseInt(tempVar);
		}
		for (i = 0;i < len;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[i] = Integer.parseInt(tempVar2);
		}
		}
		b1 = a[0];
		b2 = a[1];
		for (i = 0;i < len;i++)
		{
			if (b1 < a[i])
			{
			b1 = a[i];
			m = i;
			}
		}
		for (i = 0;i < len;i++)
		{
			if (i != m && b2 < a[i])
			{
			b2 = a[i];
			}
		}
		System.out.printf("%d\n%d",b1,b2);
	}

}


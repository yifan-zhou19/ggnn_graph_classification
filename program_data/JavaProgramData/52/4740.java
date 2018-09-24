package <missing>;

public class GlobalMembers
{
	public static int move(tangible.RefObject<Integer> p, int x)
	{
		int i;
		int temp;
		temp = (p.argValue + x - 1);
		for (i = x - 1;i > 0;i--)
		{
			*(p.argValue + i) = *(p.argValue + i - 1);
		}
		p.argValue = temp;
	}
	public static int Main()
	{
		int[] a = new int[100];
		int n;
		int m;
		int i;
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
				a + i = tempVar3;
			}
		}
		while (m-- != 0)
		{
	tangible.RefObject<Integer> tempRef_a = new tangible.RefObject<Integer>(a);
		move(tempRef_a, n);
		a = tempRef_a.argValue;
		}
		for (i = 0;i < n - 1;i++)
		{
			System.out.printf("%d ",a[i]);
		}
		System.out.printf("%d",a[i]);

	}

}


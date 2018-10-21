package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int n;
		int[] a = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] p = a;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p++ = Integer.parseInt(tempVar2);
			}
		}
		int[] q = a;
		p--;
		int[] end = p;
		while (q <= p)
		{
			int temp = p[0];
			p[0] = q;
			q[0] = temp;
			q++;
			p--;
		}
		p = a;
		System.out.printf("%d",p[+]);
		for (;p <= end;p++)
		{
			System.out.printf(" %d",p[0]);
		}
	}
}


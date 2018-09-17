package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int b;
		int i;
		int t1;
		int t2;
		int[] p = new int[12];
		int[] q = new int[12];

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}

		if (!(a == b))
		{
			for (i = 0;i < 12;i++)
			{
			if (a / ((int)Math.pow(2,i)) == 0)
			{
				t1 = i;
				break;
			}
			}
		for (i = 0;i < 12;i++)
		{
			if (b / ((int)Math.pow(2,i)) == 0)
			{
				t2 = i;
				break;
			}
		}
		p[t1] = a;
		q[t2] = b;
		for (i = t1;i >= 0;i--)
		{
			p[i - 1] = p[i] / 2;
		}
		for (i = t2;i >= 0;i--)
		{
			q[i - 1] = q[i] / 2;
		}
		for (i = 0;i < 12;i++)
		{
			if (q[i] != p[i])
			{
				System.out.printf("%d",p[i - 1]);
				break;
			}
		}
		}
		if (a == b)
		{
			System.out.printf("%d",a);
		}
	}

}


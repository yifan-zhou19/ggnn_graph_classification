package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int la;
		int lb;
		int max;
		String a = new String(new char[260]);
		String b = new String(new char[260]);
		int[] a2 = new int[260];
		int[] b2 = new int[260];
		int[] c = new int[260];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		la = a.length();
		lb = b.length();
		for (i = 0;i < la;i++)
		{
			a2[i] = a.charAt(la - i - 1) - '0';
		}
		for (i = 0;i < lb;i++)
		{
			b2[i] = b.charAt(lb - i - 1) - '0';
		}
		if (la > lb)
		{
			max = la;
		}
		else
		{
			max = lb;
		}

		for (i = 0;i < max;i++)
		{

				if (a2[i] + b2[i] + c[i] >= 10)
				{
					c[i] = (c[i] + a2[i] + b2[i]) % 10;
				c[i + 1]++;
				}
				else
				{
					c[i] = (c[i] + a2[i] + b2[i]) % 10;
				}
			if (a2[max - 1] + b2[max - 1] + c[max - 1] >= 10)
			{
			max++;
			}
		}
		while (c[max - 1] == 0 && max > 1)
		{
			max--;
		}

		for (i = max - 1;i >= 0;i--)
		{
			System.out.printf("%d",c[i]);

		}
	}

}


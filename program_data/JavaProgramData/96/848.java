package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		int l;
		int i;
		int r = 0;
		int m;
		int[] q = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		l = a.length();
		if (l == 1)
		{
			System.out.print("0\n");
			System.out.printf("%d",(int)(a.charAt(0) - '0'));
		}
		else if (l == 2)
		{
			m = (int)(a.charAt(0) - '0') * 10 + (int)(a.charAt(1) - '0');
			System.out.printf("%d\n%d",m / 13,m % 13);
		}
		else
		{
			for (i = 0;i < l;i++)
			{
			q[i] = (r * 10 + (int)(a.charAt(i) - '0')) / 13;
			r = (r * 10 + (int)(a.charAt(i) - '0')) % 13;
			}
		for (i = 0;i < l;i++)
		{
			if (i == 0 || (i == 1 && q[i] == 0))
			{
				continue;
			}
			else
			{
				if (i < l - 1)
				{
					System.out.printf("%d",q[i]);
				}
				else if (i = l - 1)
				{
					System.out.printf("%d\n",q[i]);
				}
			}
		}
		System.out.printf("%d",r);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		return 0;
	}


}


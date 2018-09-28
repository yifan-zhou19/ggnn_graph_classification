package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[1001];
		int[] b = new int[1001];
		int i;
		int j;
		int t;
		int[] k = new int[1001];
		int flag;
		String c = new String(new char[2002]);
		for (i = 0,t = 0;;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				c = tangible.StringFunctions.changeCharacter(c, i, tempVar2);
			}
			t++;
			if (c.charAt(i) != ',')
			{
				break;
			}
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b[0] = Integer.parseInt(tempVar3);
		}
		for (i = 1;i <= t - 1;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead(",");
			if (tempVar4 != null)
			{
				b[i] = Integer.parseInt(tempVar4);
			}
		}
		for (i = 0;i <= 1000;i++)
		{
			for (j = 0;j <= t - 1;j++)
			{
				if (a[j] <= i != 0 && b[j] >= i + 1)
				{
					k[i]++;
				}
			}
		}
		for (i = 0;i <= 999;i++)
		{
			for (j = 0;j <= 999 - i;j++)
			{
				if (k[j] < k[j + 1])
				{
					flag = k[j];
					k[j] = k[j + 1];
					k[j + 1] = flag;
				}
			}
		}
		System.out.printf("%d %d",t,k[0]);
		return 0;
	}

}


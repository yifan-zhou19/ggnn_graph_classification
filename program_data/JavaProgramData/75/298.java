package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[1001];
		int[] b = new int[1001];
		int i;
		int j;
		int min = 10000;
		int max = 0;
		int len;
		int[] d = new int[1000];
		int t = 0;
		String c = new String(new char[1000]);
		for (i = 1;i <= 1000;i++)
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
			if (c.charAt(i) == '\n')
			{
				break;
			}
		}
		for (i = 1;i <= 1000;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(null, 1);
			if (tempVar4 != null)
			{
				c = tangible.StringFunctions.changeCharacter(c, i, tempVar4);
			}
			if (c.charAt(i) == '\n')
			{
				break;
			}
		}
		len = i;
		System.out.printf("%d ",len);
		for (i = 1;i <= len;i++)
		{
			if (a[i] <= min)
			{
				min = a[i];
			}
			if (b[i] >= max)
			{
				max = b[i];
			}
		}
		for (i = min;i <= max;i++)
		{
			for (j = 1;j <= len;j++)
			{
				if (i >= a[j] != 0 && i < b[j])
				{
					d[i]++;
				}
			}
		}
		for (i = min;i <= max;i++)
		{
			if (d[i] >= t)
			{
				t = d[i];
			}
		}
		System.out.printf("%d",t);
		return 0;
	}
}


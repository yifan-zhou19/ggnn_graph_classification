package <missing>;

public class GlobalMembers
{
	public static int[] t = new int[1005];
	public static int[] p = new int[2010];
	public static void Main(String[] args)
	{
		int i;
		int j;
		int max;
		int c;
		int n = 0;
		char x;
		while (true)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				p[n] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				x = tempVar2.charAt(0);
			}
			n++;
			if (x != ',')
			{
				break;
			}

		}
		c = n;
		for (i = n;i <= 2 * n - 2;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(null, 1);
			if (tempVar4 != null)
			{
				x = tempVar4.charAt(0);
			}
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			p[i] = Integer.parseInt(tempVar5);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(t,0,1005);
		for (i = 0;i < c;i++)
		{
			for (j = p[i];j < p[i + c];j++)
			{
				t[j]++;
			}
		}
		max = 0;
		for (i = 0;i <= 1000;i++)
		{
			if (max < t[i])
			{
				max = t[i];
			}
		}
		System.out.printf("%d %d",c,max);
	}


}


package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int s;
		int h;
		int[] w = new int[100];
		int max = new int(int,int);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				w[i] = Integer.parseInt(tempVar2);
			}
		}
		s = w[0];
		for (i = 1;i < n;i++)
		{
			s = max(s, w[i]);
		}
		for (i = 0;i < n;i++)
		{
			if (w[i] == s)
			{
				w[i] = -100000;
			}
		}
		h = w[0];
		for (i = 1;i < n;i++)
		{
			h = max(h, w[i]);
		}
		System.out.printf("%d\n%d",s,h);
	}
	public static int max(int x,int y)
	{
		int z;
		z = x > y != 0?x:y;
		return (z);
	}
}


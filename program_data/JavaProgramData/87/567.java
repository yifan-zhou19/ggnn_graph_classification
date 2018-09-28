package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int j;
		int e;
		int f;
		int g = 0;
		int h = 0;
		int i = 0;
		int total = 0;
		int n = 1000;
		for (i = 0;i < n;i++)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			c = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			j = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			e = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ");
		if (tempVar6 != null)
		{
			f = Integer.parseInt(tempVar6);
		}
		if (a != 0)
		{
		i = f - c + 60;
		h = e - b + 60 - 1;
		g = j - a + 12 - 1;
		h = 60 * h;
		g = 3600 * g;
		total = g + h + i;
		System.out.printf("%d\n", total);
		}
		if (a = 0)
		{
		 break;
		}
		}
		 return 0;
	}

}


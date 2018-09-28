package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] p;
		int n;
		int i;
		int t;
		int x;
		int y;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		p = new int[n];
		for (i = 0;i < n;i++)
		{
			p[i] = 0;
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			x = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			y = Integer.parseInt(tempVar3);
		}
		while (x != 0 || y != 0)
		{
			if (x != y)
			{
				p[x]--;
			p[y]++;
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				x = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				y = Integer.parseInt(tempVar5);
			}
		}
		t = 1;
		for (i = 0;i < n;i++)
		{
			if (p[i] == n - 1)
			{
			System.out.printf("%d",i);
			t = 0;
			break;
			}
		}
		if (t != 0)
		{
			System.out.print("NOT FOUND");
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(p);
	}

}


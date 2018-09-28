package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int m;
		int n;
		int i;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p[5];
		int[] p = new int[5];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *t;
		int t;
		for (i = 0;i < 5;i++)
		{
		p[i] = a[i];
		}
		for (i = 0;i < 5;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				p[i] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				p[i] + 1 = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				p[i] + 2 = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				p[i] + 3 = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				p[i] + 4 = Integer.parseInt(tempVar5);
			}
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			n = Integer.parseInt(tempVar6);
		}
		String tempVar7 = ConsoleInput.scanfRead(" ");
		if (tempVar7 != null)
		{
			m = Integer.parseInt(tempVar7);
		}
		if (n < 5 && m < 5)
		{
			t = p[n];
			p[n] = p[m];
			p[m] = t;
			for (i = 0;i < 5;i++)
			{
				System.out.printf("%d %d %d %d %d",p[i],*(p[i] + 1),*(p[i] + 2),*(p[i] + 3),*(p[i] + 4));
				if (i < 4)
				{
					System.out.print("\n");
				}
			}
		}
		else
		{
			System.out.print("error");
		}
		return 0;
	}
}


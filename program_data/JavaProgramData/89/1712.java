package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] know = new int[10000];
		int[] beknown = new int[10000];
		int n = 0;
		int i;
		int x;
		int y;
		int flag;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		x = y = 1;
		t = 0;
		while (x + y != 0)
		{
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
			know[x]++;
			beknown[y]++;
		}
		flag = 0;
		for (i = 0;i < n;i++)
		{
			if ((know[i] == 0) && (beknown[i] == n - 1))
			{
				flag = 1;
				t = i;
			}
		}
		if (flag == 1)
		{
			System.out.printf("%d",t);
		}
		else
		{
			System.out.print("NOT FOUND");
		}

	}

}


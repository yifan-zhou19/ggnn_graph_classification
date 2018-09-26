package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int h;
		int b;
		int c;
		int j;
		int k;
		int[] a = new int[1000];
		b = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			h = Integer.parseInt(tempVar2);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (j = 1;j <= n;j++)
		{
			for (k = j + 1;k <= n;k++)
			{
				if (a[j] + a[k] == h)
				{
					System.out.print("yes");
					b = 1;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					goto A;
				}
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		A:
		if (b == 0)
		{
			System.out.print("no");
		}
		return 0;
	}
}


package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] sz = new int[1000];
		int i;
		int m;
		int n;
		int k;
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(sz[i]) = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			a = k - sz[i];
			for (m = 0;m < n;m++)
			{
			if (sz[m] == a && m != i)
			{
				System.out.print("yes");
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
				goto L;
			}
			}
		}
			System.out.print("no");
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			L:
		return 0;
	}



}


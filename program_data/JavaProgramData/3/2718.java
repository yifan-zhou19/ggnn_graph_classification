package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int K;
		int i;
		int j;
		int[] a = new int[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			K = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if ((a[i] + a[j]) == K)
				{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
				goto first;
				}
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		goto third;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		first:
		System.out.print("yes");
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		goto second;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		third:
		System.out.print("no");
		return 0;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		second:
		return 0;
	}
}


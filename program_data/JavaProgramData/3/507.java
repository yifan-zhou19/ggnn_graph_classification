package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int k;
		int i;
		int j;
		int[] a = new int[10000];
		int s;
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
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			s = 0;
			for (j = 0;j < n - i;j++)
			{
				s = a[i] + a[j];
				if (s == k)
				{
					System.out.print("yes\n");
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					goto mq;
				}
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	mq:
		if (s != k)
		{
			System.out.print("no\n");
		}


	}
}


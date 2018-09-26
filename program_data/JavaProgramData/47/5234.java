package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int tem;
		int[] p1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		p1 = new int[n];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p1[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n / 2;i++)
		{
			tem = p1[i];
			p1[i] = p1[n - 1 - i];
			p1[n - 1 - i] = tem;
		}
		System.out.printf("%d",p1[0]);
		for (i = 1;i < n;i++)
		{
			System.out.printf(" %d",p1[i]);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(p1);
		return 0;
	}

}


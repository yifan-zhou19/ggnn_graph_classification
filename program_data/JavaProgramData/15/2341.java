package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int i;
		int j;
		int s = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a = Integer.parseInt(tempVar2);
				}
				if (a == 0)
				{
					break;
				}
			}
			for (j++;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a = Integer.parseInt(tempVar3);
				}
				if (a == 255)
				{
					s++;
				}
				else
				{
					break;
				}
			}
			for (j++;j < n;j++)
			{
				String tempVar4 = ConsoleInput.scanfRead();
				if (tempVar4 != null)
				{
					a = Integer.parseInt(tempVar4);
				}
			}
		}
		System.out.printf("%d",s);
	}
}


package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int[] b = new int[100];
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		for (i = a;i > 0;i--)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(b[i - 1]) = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < a;i++)
		{
			switch (a - 1 - i)
			{
			case 0:
				System.out.printf("%d",b[i]);
				break;
			default:
				System.out.printf("%d ",b[i]);
				break;
			}
		}
		return 0;
	}
}


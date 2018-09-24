package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//int hs(int a);
	public static int Main()
	{
		int n;
		int[] b = new int[20002];
		int i;
		int j;
		int pd;
		int js;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b[i] = Integer.parseInt(tempVar2);
			}
		}
		js = n;
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j < i;j++)
			{
				if (b[j] == b[i])
				{
					js--;
					break;
				}
			}
		}
		pd = 1;
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j < i;j++)
			{
				if (b[j] == b[i])
				{
					pd = 0;
				}
			}
			if (pd == 1 && js != 1)
			{
				System.out.printf("%d ",b[i]);
				js--;
			}
			else if (pd == 1 && js == 1)
			{
				System.out.printf("%d",b[i]);
				break;
			}
			pd = 1;
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			n = Integer.parseInt(tempVar3);
		}
		return 0;
	}

}


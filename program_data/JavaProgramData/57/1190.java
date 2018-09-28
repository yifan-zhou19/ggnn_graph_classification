package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int x;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct m
	//	{
	//		char vol[34];
	//	}
	//	a[52];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(a[i].vol) = tempVar2;
			}
		}
		for (i = 0;i < n;i++)
		{
			x = String.valueOf(a[i].vol).length();
			if (a[i].vol[x - 1] == 'r' || a[i].vol[x - 1] == 'y')
			{
				a[i].vol[x - 2] = '\0';
			}
			else
			{
				a[i].vol[x - 3] = '\0';
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.println(a[i].vol);
		}
		return 0;
	}


}


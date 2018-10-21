package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int k;
	int l;
	int ha;
	int li;
	int x;
	int s;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < n;i++)
	{
		s = 0;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			ha = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			li = Integer.parseInt(tempVar3);
		}
		for (l = 0;l < ha;l++)
		{
			for (k = 0;k < li;k++)
			{
				String tempVar4 = ConsoleInput.scanfRead();
				if (tempVar4 != null)
				{
					x = Integer.parseInt(tempVar4);
				}
				if (l == 0 || l == (ha - 1) || (k == 0 && l != 0 && l != (ha - 1)) || (k == (li - 1) && l != 0 && l != (ha - 1)))
				{
					s = s + x;
				}
			}
		}
	System.out.printf("%d\n",s);
	}
	return 0;
	}

}


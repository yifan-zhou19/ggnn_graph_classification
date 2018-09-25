package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int feiwu;
		int x;
		int l;
		int s;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n * n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				feiwu = Integer.parseInt(tempVar2);
			}
			if (feiwu == 0)
			{
				x = i + 1;
				break;
			}
		}
		for (i++;i < n * n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				feiwu = Integer.parseInt(tempVar3);
			}
			if (feiwu != 0)
			{
				l = i;
				break;
			}
		}
		s = l - x + 1;
		for (i++;i < n * n;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				feiwu = Integer.parseInt(tempVar4);
			}
			if (feiwu == 0)
			{
				s++;
			}
		}
		System.out.printf("%d",(l - x - 1) * (s - 2 * (l - x + 1)) / 2);
		return 0;
	}

}


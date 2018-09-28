package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct a
	//	{
	//		int x,y;
	//	}
	//	as[100];
		int n;
		int i;
		int j;
		int k;
		int m;
		int[] b = new int[100];
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
				as[i].x = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				as[i].y = tempVar3;
			}
		}
		j = 0;
		b[j] = 0;
		for (i = 0;i < n;i++)
		{
			if (((as[i].x >= 90) && (as[i].x <= 140)) && ((as[i].y >= 60) && (as[i].y <= 90)))
			{
				b[j] = b[j] + 1;
			}
			else
			{
				j = j + 1;
				b[j] = 0;
			}
		}
		k = j;
		for (j = 0;j <= k;j++)
		{
			m = 0;
			for (i = 0;i <= k;i++)
			{
				if (b[j] < b[i])
				{
					m = 1;
				}
			}
			if (m == 0)
			{
				System.out.printf("%d",b[j]);
				break;
			}
		}
		return 0;
	}
}


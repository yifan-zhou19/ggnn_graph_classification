package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int x = 0;
		int c = 0;
		int[] num = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct xueya
	//	{
	//		int a;
	//		int b;
	//	}
	//	xy[100];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				xy[i].a = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				xy[i].b = tempVar3;
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			if (90 <= xy[i].a && xy[i].a <= 140 && 60 <= xy[i].b && xy[i].b <= 90)
			{
				x++;
			}
			else
			{
				num[c] = x;
				c++;
				x = 0;
			}
		}

			if (90 <= xy[n - 1].a && xy[n - 1].a <= 140 && 60 <= xy[n - 1].b && xy[n - 1].b <= 90)
			{
				x++;
				num[c] = x;
				c++;
			}
			else
			{
				num[c] = x;
				c++;
				x = 0;
			}

		int d;
		for (i = 0;i < c - 1;i++)
		{
			for (i = 0;i < c - 1;i++)
			{
				if (num[i] > num[i + 1])
				{
				d = num[i + 1];
				num[i + 1] = num[i];
				num[i] = d;
				}
			}
		}
		System.out.printf("%d\n",num[c - 1]);
	return 0;
	}


}


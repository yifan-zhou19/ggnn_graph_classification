package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct press
	//	{
	//		int a,b;
	//	}
	//	press[100];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(press[i].a) = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(press[i].b) = tempVar3;
			}
		}
		int normal = 0;
		int max = 0;
		for (i = 0;i < n;i++)
		{
			if (press[i].a >= 90 && press[i].a <= 140 && press[i].b >= 60 && press[i].b <= 90)
			{
				normal++;
			}
			else
			{
				if (normal > max)
				{
					max = normal;
				}
				normal = 0;
			}
		}
		if (normal > max)
		{
			max = normal;
		}
		System.out.printf("%d",max);
		return 0;
	}
}


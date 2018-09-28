package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int nu;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			nu = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct aaa
	//	{
	//		int x,y;
	//	}
	//	time[100];
		int i;
		int h = 0;
		int m = 0;
		int s = 0;
		for (i = 0;i < nu;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(time[i].x) = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(time[i].y) = tempVar3;
			}
		}
		for (i = 0;i < nu;i++)
		{
			if ((time[i].x) <= 140 && (time[i].x) >= 90 && (time[i].y) <= 90 && (time[i].y) >= 60)
			{
				h += 1;
				s = h;
			}
			else if (m <= h)
			{
				m = h;
				h = 0;
				continue;
			}
			else if (m >= h)
			{
				h = 0;
				continue;
			}
		}
		if (s >= m)
		{
			System.out.printf("%d",s);
		}
		else
		{
			System.out.printf("%d\n",m);
		}
			return 0;
	}
}


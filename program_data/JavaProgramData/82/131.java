package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int s = 0;
		int m;
		int[] j = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct point
	//	{
	//		int a;
	//		int b;
	//	}
	//	c[100];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				c[i].a = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				c[i].b = tempVar3;
			}
			if (c[i].a >= 90 && c[i].a <= 140 && c[i].b >= 60 && c[i].b <= 90)
			{
				s++;
				j[i] = s;
			}
			else
			{
				j[i] = 0;
				s = 0;
			}
		}
		for (i = 1;i < n;i++)
		{
			if (j[i] < j[i - 1])
			{
				m = j[i];
				j[i] = j[i - 1];
				j[i - 1] = m;
			}
		}
		System.out.printf("%d\n",j[n - 1]);
		return 0;
	}
}


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
	//	a[5000];
		int n;
		int i;
		int c;
		int d;
		int j;
		int h;
		int x;
		int y;
		int[] r = new int[5000];
		int[] t = new int[5000];
		double f;
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
				x = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				y = Integer.parseInt(tempVar3);
			}
			a[i].x = x;
			a[i].y = y;

		r[i] = a[i].x;
		t[i] = a[i].y;
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if (a[j].x < a[i].x)
				{
					c = a[i].x;
					a[i].x = a[j].x;
					a[j].x = c;
				}
				if (a[j].y > a[i].y)
				{
					d = a[i].y;
					a[i].y = a[j].y;
					a[j].y = d;
				}
			}
		}
		for (i = a[0].x;i < a[0].y;i++)
		{
		f = i * 1.0 + 0.1;
		h = 0;
			for (j = 0;j < n;j++)
			{
				if (f < r[j] || f> t[j])
				{
				  h++;
				}
			}
			if (h == n)
			{

				System.out.print("no");
				return 0;
			}

		}
		if (i == a[0].y)
		{
			System.out.printf("%d %d",a[0].x,a[0].y);
		}

		return 0;


	}
}


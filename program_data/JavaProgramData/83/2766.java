package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct point
	//	{
	//	float s;
	//	int r;
	//	};
		point[] a = {0, 0, null, null, null, null, null, null, null, null};
		int n;
		int i;
		float d = 0.0F;
		float result = 0.0F;
		float t = 0.0F;

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
				a[i].s = tempVar2;
			}
			t = t + a[i].s;
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i].r = tempVar3;
			}
		}
		for (i = 0;i < n;i++)
		{
				if (a[i].r >= 90)
				{
					d = 4.0F;
				}
				if (a[i].r <= 89 && a[i].r >= 85)
				{
					d = 3.7F;
				}
				if (a[i].r <= 84 && a[i].r >= 82)
				{
					d = 3.3F;
				}
				if (a[i].r <= 81 && a[i].r >= 78)
				{
					d = 3.0F;
				}
				if (a[i].r <= 77 && a[i].r >= 75)
				{
					d = 2.7F;
				}
				if (a[i].r <= 74 && a[i].r >= 72)
				{
					d = 2.3F;
				}
				if (a[i].r <= 71 && a[i].r >= 68)
				{
					d = 2.0F;
				}
				if (a[i].r <= 67 && a[i].r >= 64)
				{
					d = 1.5F;
				}
				if (a[i].r <= 63 && a[i].r >= 60)
				{
					d = 1.0F;
				}
			a[i].s = a[i].s * d;
			d = 0F;
		}
		for (i = 0;i < n;i++)
		{
			result = result + a[i].s;
		}
			result = result / t;
			System.out.printf("%.2f",result);
	}

}


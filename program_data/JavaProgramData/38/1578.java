package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int j;
		double x;
		double y;
		double z;

//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct pp
	//	{
	//		int a;
	//		float s[100];
	//	}
	//	pl;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				pl.a = tempVar2;
			}
			for (j = 0;j < pl.a;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					pl.s[j] = tempVar3;
				}
			}
			x = 0;
			y = 0;
			z = 0;
			for (j = 0;j < pl.a;j++)
			{
				x += pl.s[j];
			}
			for (j = 0;j < pl.a;j++)
			{
				y += (pl.s[j] - x / pl.a) * (pl.s[j] - x / pl.a);
			}
			z = Math.sqrt(y / pl.a);
			System.out.printf("%.5lf\n",z);
		}
		return 0;
	}
}


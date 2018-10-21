package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int i;
		  int j;
		  int n;
		double m = 0;
		double l;
		double a;
		double b;
		double c;
		double d;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct point
	//	{
	//		float x,y;
	//	}
	//	*p;

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
			p = (point)malloc(sizeof(point) * n);
			for (i = 0;i < n;i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					(p + i).x = tempVar2;
				}
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					(p + i).y = tempVar3;
				}
			}
			for (i = 1;i < n;i++)
			{
			for (j = 0;j < i;j++)
			{
					a = (p + i).x;
					b = (p + j).x;
					c = (p + i).y;
					d = (p + j).y;
					l = Math.sqrt((a - b) * (a - b) + (c - d) * (c - d));
					if (l > m)
					{
						m = l;
					}
			}
			}
			System.out.printf("%.4f",m);
			p = null;

	}
}


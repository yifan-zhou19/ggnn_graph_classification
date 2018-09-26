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
			for (i = 0;i < n;i++)
			{
			for (j = 0;j < i;j++)
			{
					l = Math.sqrt(((((p + i).x) - ((p + j).x)) * (((p + i).x) - ((p + j).x))) + ((((p + i).y) - ((p + j).y)) * (((p + i).y) - ((p + j).y))));
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


package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		float[] c = new float[100];
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct A
	//	{
	//		float a;
	//		float b;
	//	}
	//	m[100];
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
				m[i].a = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				m[i].b = tempVar3;
			}
			c[i] = m[i].b / m[i].a;
		}
		for (i = 1;i < n;i++)
		{
			if (c[i] - c[0] > 0.05F)
			{
				System.out.print("better\n");
			}
			else if (c[i] - c[0] < -0.05F)
			{
				System.out.print("worse\n");
			}
			else
			{
				System.out.print("same\n");
			}
		}
		return 0;
	}


}


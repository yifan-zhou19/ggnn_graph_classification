package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		double f;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct ZL
	//	{
	//		int a,b;
	//	}
	//	*s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		s = (ZL)malloc(sizeof(ZL) * n);
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s[i].a = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				s[i].b = tempVar3;
			}
		}
		f = (double)s[0].b / s[0].a;
		for (i = 1;i < n;i++)
		{
			if ((double)s[i].b / s[i].a - f > 0.05)
			{
				System.out.print("better\n");
			}
			else if (f - (double)s[i].b / s[i].a > 0.05)
			{
				System.out.print("worse\n");
			}
			else
			{
				System.out.print("same\n");
			}
		}
		s = null;
		return 0;
	}
}


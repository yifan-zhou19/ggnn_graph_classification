package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct dc
	//	{
	//		   char a[100];
	//		   int len;
	//	}
	//	dc[200],*ps;
		ps = dc;
		int n;
		int max = 0;
		int min = 500;
		int i;
		String pmax;
		String pmin;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++,ps++)
		{
						String tempVar2 = ConsoleInput.scanfRead();
						if (tempVar2 != null)
						{
							ps.a = tempVar2;
						}
						ps.len = ps.a.length();
						if (ps.len > max)
						{
										max = ps.len;
										pmax = ps.a;
						}
						if (ps.len < min)
						{
										min = ps.len;
										pmin = ps.a;
						}
		}
		System.out.printf("%s\n%s",pmax,pmin);
		return 0;
	}
}


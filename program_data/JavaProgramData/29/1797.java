package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
	int n;
	int j;
	float x;
	float s;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		m = Integer.parseInt(tempVar);
	}

	for (i = 0;i < m;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (s = 0F,j = 0,x = 2.0f;j < n;j++)
		{
			s = s + x;
				x = 1 + 1 / x;
		}
		System.out.printf("%.3f\n",s);
	}
	}
}


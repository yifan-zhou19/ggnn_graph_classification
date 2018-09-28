package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		m = Integer.parseInt(tempVar);
	}
	int i;
		for (i = 1;i <= m;i++)
		{
			int n;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			float a = 2F;
			float b = 1F;
			float c;
			float s = 0F;
	int j;
			for (j = 1; j <= n;j++)
			{
				s += a / b;
				c = a;
				a += b;
				b = c;
			}
			System.out.printf("%.3f\n",s);
		}
	}

}


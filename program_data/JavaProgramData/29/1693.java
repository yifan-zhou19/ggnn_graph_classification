package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		int n;
		int k;
		float s = 0F;
		float j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
			for (i = 1;i <= m;i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					n = Integer.parseInt(tempVar2);
				}
			j = 2F;
			s = 0F;
			for (k = 1;k <= n;k++)
			{
				s = s + j;
			j = 1 + 1 / j;
			}
			System.out.printf("%.3f\n",s);
			}
	}



}


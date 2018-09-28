package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int fm1 = 1;
		int fm2 = 1;
		int fm;
		float[] s = new float[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i < m;i++)
		{
			fm1 = 1;
					  fm2 = 1;
					  String tempVar2 = ConsoleInput.scanfRead();
					  if (tempVar2 != null)
					  {
						  n = Integer.parseInt(tempVar2);
					  }
			for (j = 1;j <= n;j++)
			{
				fm = fm1 + fm2;
				s[i] += (float)fm / fm2;
							   fm1 = fm2;
							   fm2 = fm;
			}
		}
		for (i = 0;i < m;i++)
		{
			System.out.printf("%.3f\n",s[i]);
		}
		return 0;
	}

}


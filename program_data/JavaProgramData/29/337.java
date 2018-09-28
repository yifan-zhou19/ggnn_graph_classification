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
		for (int z = 0;z < m;z++)
		{
			int n;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
					  if (n == 1)
					  {
						  System.out.print("2.000\n");
							   continue;
					  }
			int a = 2;
			int b = 1;
			int c = 3;
			int d = 2;
			int c1;
			int d1;
			float s = (float)2 / 1 + (float)3 / 2;
			for (int i = 2;i < n;i++)
			{
				c1 = c;
				d1 = d;
				c = a + c;
				d = b + d;
				a = c1;
				b = d1;
				s = s + (float)c / (float)d;
			}
			System.out.printf("%.3f\n",s);
		}
		return 0;
	}


}


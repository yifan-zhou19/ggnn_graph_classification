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
		for (int i = 0;i < m;i++)
		{
			 int n;
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 n = Integer.parseInt(tempVar2);
			 }
			 float s = 0F;
			 int x = 2;
			 int y = 1;
			 int t;
			 for (int j = 1;j <= n;j++)
			 {
				  s = s + (float)x / y;
				  t = x + y;
				  y = x;
				  x = t;
			 }
			 System.out.printf("%.3f\n",s);

		}

		System.in.read();
		System.in.read();
	}

}


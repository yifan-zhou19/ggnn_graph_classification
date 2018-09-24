package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		float f = int j;
		int i;
		int n;
		int m;
		int k;
		float s = 0F;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (k = 0;k < m;k++)
		{
			s = 0F;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			for (i = 0;i < n;i++)
			{

			 s = s + f(i + 3) / f(i + 2);
			}
				 System.out.printf("%.3lf\n",s);

		}


		return 0;

	}
	 public static float f(int j)
	 {
		 int c;
		 if (j == 1 || j == 2)
		 {
			 c = 1;
		 }
		 else
		 {
			 c = f(j - 1) + f(j - 2);
		 }
		 return (c);
	 }


}


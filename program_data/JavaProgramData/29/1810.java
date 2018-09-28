package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i = 1;
		int k = 3;
		float s = 3.5F;
		float p;
		float a = 2.0F;
		float b = 3.0F;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		while (i <= m)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			  if (n >= 3)
			  {
				   while (k <= n)
				   {
				 p = a + b;
				 s = s + p / b;
				 a = b;
				 b = p;
				 k = k + 1;
				   }
			 System.out.printf("%.3f\n",s);
		   s = 3.5F;
		   a = 2.0F;
		   b = 3.0F;
		   k = 3;
			  }
		 else if (n == 1)
		 {
			   System.out.print("2.000\n");
		 }
		 else
		 {
				System.out.print("3.500\n");
		 }
		 i = i + 1;
		}
	return 0;
	}

}


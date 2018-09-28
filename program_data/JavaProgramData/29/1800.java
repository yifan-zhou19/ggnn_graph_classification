package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int s;
		int n;
		int i;
		float a1 = 2F;
		float a2 = 3F;
		float b1 = 1F;
		float b2 = 2F;
		float a;
		float b;
		float sum = 3.5F;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}

	   for (s = 0;s < m;s++)
	   {
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   n = Integer.parseInt(tempVar2);
	   }
	   if (n == 1)
	   {
		 System.out.print("2.000\n");
	   }
	  else
	  {
		  if (n == 2)
		  {
		System.out.print("3.500\n");
		  }
	  else
	  {
		for (i = 3;i <= n;i++)
		{
			a = a1 + a2;
			b = b1 + b2;
			sum = sum + a / b;
			a1 = a2;
			a2 = a;
			b1 = b2;
			b2 = b;

		}
			  System.out.printf("%.3f\n",sum);
	  }

			  sum = 3.5F;
			 a1 = 2F;
			 a2 = 3F;
			 b1 = 1F;
			 b2 = 2F;

	  }
	   }
	return 0;
	}

}


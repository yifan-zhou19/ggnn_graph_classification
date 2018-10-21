package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[10];
		int[] b = new int[10];
		int n;
		int i;
		int w1 = 0;
		double GPA;
		double[] c = new double[10];
		double w = 0;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (i = 0;i <= n - 1;++i)
		{
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   a[i] = Integer.parseInt(tempVar2);
		   }
		}

		for (i = 0;i <= n - 1;++i)
		{
		   String tempVar3 = ConsoleInput.scanfRead();
		   if (tempVar3 != null)
		   {
			   b[i] = Integer.parseInt(tempVar3);
		   }
		}



		for (i = 0;i <= n - 1;++i)
		{
		  if (b[i] < 60)
		  {
			  c[i] = 0;
		  }
		  else
		  {
			  if (b[i] <= 63)
			  {
				  c[i] = 1.0;
			  }
			else
			{
				if (b[i] <= 67)
				{
					c[i] = 1.5;
				}
			  else
			  {
				  if (b[i] <= 71)
				  {
					  c[i] = 2.0;
				  }
			  else
			  {
				  if (b[i] <= 74)
				  {
					  c[i] = 2.3;
				  }
			  else
			  {
				  if (b[i] <= 77)
				  {
					  c[i] = 2.7;
				  }
			  else
			  {
				  if (b[i] <= 81)
				  {
					  c[i] = 3.0;
				  }
			  else
			  {
				  if (b[i] <= 84)
				  {
					  c[i] = 3.3;
				  }
			  else
			  {
				  if (b[i] <= 89)
				  {
					  c[i] = 3.7;
				  }
			  else
			  {
				  if (b[i] <= 100)
				  {
					  c[i] = 4.0;
				  }
			  else
			  {

			  }
			  }
			  }
			  }
			  }
			  }
			  }
			  }
			}
		  }
		}


		for (i = 0;i <= n - 1;++i)
		{
			w = w + a[i] * c[i];
		}

		for (i = 0;i <= n - 1;++i)
		{
			   w1 = w1 + a[i];
		}
		System.out.printf("%3.2f",GPA = w / w1);


	return 0;
	}
}


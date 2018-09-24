package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  int i;
		  double[] a = new double[500];
		  double[] b = new double[500];
		  for (i = 0;i < n;i++)
		  {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  a[i] = Double.parseDouble(tempVar2);
		  }
		  String tempVar3 = ConsoleInput.scanfRead(" ");
		  if (tempVar3 != null)
		  {
			  b[i] = Double.parseDouble(tempVar3);
		  }
		  }
		double[] c = new double[500];
		char[][] r = new char[500][500];
		for (i = 0;i < n;i++)
		{
			c[i] = b[i] / a[i];

		}
		for (i = 1;i < n;i++)
		{
			if (i < n)
			{
				if ((c[i] - c[0]) > 0.05)
				{
			  System.out.print("better\n");
				}
		   else if ((c[0] - c[i]) > 0.05)
		   {
			 System.out.print("worse\n");
		   }
		   else
		   {
			  System.out.print("same\n");
		   }
			}
		  else
		  {
			   if ((c[i] - c[0]) > 0.05)
			   {
			 System.out.print("better");
			   }
		   else if ((c[0] - c[i]) < 0.05)
		   {
			 System.out.print("worse");
		   }
		   else
		   {
			 System.out.print("same");
		   }
		  }


		}


	}
}


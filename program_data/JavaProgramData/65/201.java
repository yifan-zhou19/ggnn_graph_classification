package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int a;
		int b;
		int i;
		int j;
		int[] x = new int[201];
		int[] y = new int[201];

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  (x[i]) = Integer.parseInt(tempVar2);
		  }
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  (y[i]) = Integer.parseInt(tempVar3);
		  }
		}
	  a = b = 0;

	 for (i = 0;i < n;i++)
	 {
		  if (x[i] == 1)
		  {
			if (y[i] == 0)
			{
				b = b + 1;
			}
			if (y[i] == 2)
			{
				a = a + 1;
			}

		  }

		   if (x[i] == 2)
		   {
			if (y[i] == 0)
			{
				a = a + 1;
			}
			if (y[i] == 1)
			{
				b = b + 1;
			}

		   }

		  if (x[i] == 0)
		  {
			if (y[i] == 1)
			{
				a = a + 1;
			}
			if (y[i] == 2)
			{
				b = b + 1;
			}

		  }

	 }


	  if (a > b)
	  {
		  System.out.print("A");
	  }
	else
	{
	  if (a < b)
	  {
		  System.out.print("B");
	  }

	  else
	  {
		  System.out.print("Tie");
	  }
	}


	  return 0;
	}
}


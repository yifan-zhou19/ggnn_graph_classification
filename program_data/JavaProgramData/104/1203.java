package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] x = new int[1000];
	int[] y = new int[1000];
	int i;
	int j;
	int a;
	int b;
	int m;
	int n;
	int p = 0;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 a = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead(" ");
	 if (tempVar2 != null)
	 {
		 b = Integer.parseInt(tempVar2);
	 }
	 x[0] = a;
	 y[0] = b;
	if (a == 1 || b == 1)
	{
	  System.out.print("1");
	}
	else if (a == b)
	{
		System.out.printf("%d",a);

	}

	else
	{
	for (i = 1;a > 0;i++)
	{
	  if (a % 2 == 0)
	  {
		x[i] = (a / 2);
		a = a / 2;
	  }
	  if (a % 2 != 0 && a != 1)
	  {
		x[i] = (a - 1) / 2;
		a = x[i];
	  }
	if (a == 1)
	{
			 x[i] = 1;
			 a -= 1;
	}
	  m = i;
	}

	for (j = 1;b > 0;j++)
	{
	  if (b % 2 == 0)
	  {
		y[j] = (b / 2);
		b = b / 2;
	  }
	  if (b % 2 != 0 && b != 1)
	  {
		y[j] = (b - 1) / 2;
		b = y[j];
	  }
	 if (b == 1)
	 {
	   y[j] = b;
	   b -= 1;
	 }
	  n = j;
	}




	  for (i = 0;i <= m;i++)
	  {
	   for (j = 0;j <= n;j++)
	   {
		 if (x[i] == y[j])
		 {
			System.out.printf("%d",x[i]);
			p = 1;
		 }
		if (p == 1)
		{
			break;
		}
	   }
	   if (p == 1)
	   {
		   break;
	   }
	  }
	}

	return 0;
	}







}


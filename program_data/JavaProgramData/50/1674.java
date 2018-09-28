package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int w;
	   int i;
	   int j;
	   int m;
	   int n;
	   int s;
	   int h;
	   int[] x = new int[1000];
	   int[] y = new int[1000];
	   int[] z = new int[1000];
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   w = Integer.parseInt(tempVar);
	   }
	   for (i = 1;i <= 365;i++)
	   {

		   x[i] = (w + i - 1) % 7;
	   }
	   for (j = 1;j <= 365;j++)
	   {
		  if (j <= 31)
		  {
				y[j] = j;
				z[j] = 1;
		  }
		  else if (j <= 59)
		  {
				 y[j] = j - 31;
				 z[j] = 2;
		  }
		  else if (j <= 90)
		  {
				 y[j] = j - 59;
				 z[j] = 3;
		  }
		  else if (j <= 120)
		  {
				 y[j] = j - 90;
				 z[j] = 4;
		  }
		  else if (j <= 151)
		  {
				 y[j] = j - 120;
				 z[j] = 5;
		  }
		  else if (j <= 181)
		  {
				 y[j] = j - 151;
				 z[j] = 6;
		  }
		  else if (j <= 212)
		  {
				 y[j] = j - 181;
				 z[j] = 7;
		  }
		  else if (j <= 243)
		  {
				 y[j] = j - 212;
				 z[j] = 8;
		  }
		  else if (j <= 273)
		  {
				 y[j] = j - 243;
				 z[j] = 9;
		  }
		  else if (j <= 304)
		  {
				 y[j] = j - 273;
				 z[j] = 10;
		  }
		  else if (j <= 334)
		  {
				 y[j] = j - 304;
				 z[j] = 11;
		  }
		  else if (j <= 365)
		  {
				y[j] = j - 334;
				z[j] = 12;
		  }
	   }
		  for (i = 1;i <= 365;i++)
		  {
				if (x[i] == 5 && y[i] == 13)
				{
				System.out.printf("%d\n",z[i]);
				}
		  }
		   return 0;
	}
}


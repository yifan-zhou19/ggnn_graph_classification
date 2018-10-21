package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int m;
	   int n;
	   int i;
	   int j;
	   int k;
	   int jin;
	   int[] a = new int[35]; //n????????
	   int[] b = new int[35];
	   m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   for (i = 1;i < 35;i++)
	   {
		   a[i] = 0;
	   }
	   a[0] = 2;
	   for (i = 1;i < m;i++)
	   {
		   jin = 0;
		  for (j = 0;j < 35;j++)
		  {
			  b[j] = (2 * a[j] + jin) % 10;
			  jin = (2 * a[j] + jin) / 10;
		  }
		  for (j = 0;j < 35;j++)
		  {
			  a[j] = b[j];
		  }

	   }
	   for (i = 34;i >= 0;i--)
	   {
		  if (a[i] != 0)
		  {
			  break;
		  }
	   }
	   if (m == 0)
	   {
		   System.out.print(1);
	   }
	   else if (i == -1)
	   {
		   System.out.print(a[0]);
	   }
	   else
	   {
		   for (j = i;j >= 0;j--)
		   {
			   System.out.print(a[j]);
		   }
	   }

	return 0;
	}
}


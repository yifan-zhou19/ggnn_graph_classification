package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int[] x = new int[16];
	   int i;
	   int j;
	   int k;
	   for (i = 0;i < 15;i++)
	   {
		   x[i] = 0;
	   }
	   for (i = 0;;i++)
	   {
		   x[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   if (x[i] == -1)
		   {
			   break;
		   }
		   if (x[i] == 0)
		   {
			   int t = 0;
			   for (j = 0;j < i;j++)
			   {
				   for (k = 0;k < i;k++)
				   {
					   if (x[j] == 2 * x[k])
					   {
							t++;
					   }
				   }
			   }
			   System.out.print(t);
			   System.out.print("\n");
			   i = -1;
		   }
	   }
	   return 0;
	}
}


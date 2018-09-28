package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[200][3];
		int n;
		int i;
		float[] b = new float[200];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			a[i][1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			a[i][2] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b[i] = (float)a[i][2] / a[i][1];
		}
		   for (i = 2;i <= n;i++)
		   {
			   if (b[i] - b[1] > 0.05F)
			   {
			  System.out.print("better");
			   }


			  else if (b[1] - b[i] > 0.05F)
			  {
				  System.out.print("worse");
			  }
			  else
			  {
				  System.out.print("same");
			  }
			  System.out.print("\n");
		   }
		   return 0;
	}
}


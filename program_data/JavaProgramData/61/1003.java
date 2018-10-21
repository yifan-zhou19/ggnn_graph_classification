package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int k;
	   int a = 1;
	   int b;
	   int c = 2;
	   int d = 0;
	   int e = 1;
	   int f;
	   int[] h = new int[a];
	   k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   for (a = 1;a <= k;a++)
	   {
			  b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (b == 1)
			{
				h[a] = b;
			}
			else
			{
			for (c = 2;c <= b;c++) //??b????
			{
				f = (d + e);
				d = e;
				e = f;
			}
			}
			   h[a] = e;
				e = 1;
				d = 0;
	   }
		  for (a = 1;a <= k;a++)
		  {
			  System.out.print(h[a]);
			  System.out.print("\n");
		  }
			return 0;
	}

}


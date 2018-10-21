package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int w;
		int i = 0;
		int[] a = new int[400];
		int x = 0;
		int y;
		int z;
		int[] month = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= 12;i++)
		{
		x = x + month[i - 1];
		z = (x + 12) % 7;
		y = w + z;
		  if (y > 7)
		  {
			  y = y - 7;
			  if (y == 5)
			  {
				  System.out.printf("%d\n",i);
			  }
			  else
			  {
				  continue;
			  }
		  }
		  else
		  {
			  if (y == 5)
			  {
				  System.out.printf("%d\n",i);
			  }
			  else
			  {
				  continue;
			  }
		  }
		}
		return 0;
	}







}


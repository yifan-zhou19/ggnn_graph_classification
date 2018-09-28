package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int d = 3;
		int e;
		int h;
		int y;
		int i;
		int x;
		int z;
		float c;
		float f;
		float g;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		b = a / 2;
		while (d <= b)
		{
		   e = a - d;
		  f = Math.sqrt(d);
		  g = Math.sqrt(e);
		  h = 2;
		  i = 2;
		  y = 1;
		  z = 1;
			 while (h <= f)
			 {
			   if (d % h == 0)
			   {
				  y = 0;
				  break;
			   }
			  else
			  {
				  h++;
			  }
			 }
				 while (i <= g)
				 {
				   if (e % i == 0)
				   {
					  z = 0;
					  break;
				   }
				 else
				 {
					 i++;
				 }
				 }
			if (y == 1 && z == 1)
			{
			System.out.printf("%d %d\n",d,e);
			}
			d = d + 2;
		}
	}
}


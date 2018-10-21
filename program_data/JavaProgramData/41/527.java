package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int a = 1;
	 int b = 1;
	 int c = 1;
	 int d = 1;
	 int e = 1;
	 int i;
	 int[] n = new int[6];
	 if (a == 1)
	 {
		 n[5] = 1;
		 n[4] = 1;
		 if (n[4] - n[5] == 0)
		 {
			 n[4] = 0;
			 n[5] = 0;
			 a = 0;
		 }
	 }
	 if (a == 0)
	 {
	  if (b == 1)
	  {
	   n[2] = 2;
	   if (c == 1)
	   {
	   n[3] = 1;
	   d = 0;
	   e = 0;
	   n[1] = 5;
	   n[5] = 4;
	   n[2] = 2;
	   n[4] = 3;
	   c = 0;
	   for (i = 1;i <= 5;i++)
	   {
		   System.out.printf("%d",n[i]);
		   if (i != 5)
		   {
			   System.out.print(" ");
		   }
	   }
	   }
	   if (c == 0)
	   {
		d = 1;
		e = 0;
		n[4] = 2;
		if (n[2] - n[4] == 0)
		{
		d = 0;
		}
	c = 1;
	   }
	  }
	 }

	}
}

package <missing>;

public class GlobalMembers
{
	 public static int reverse(int num)
	 {
		int i = 0;
	   for (;num != 0;)
	   {
	   i = i * 10 + num % 10;
	   num = num / 10;
	   }
	   return (i);
	 }

	public static int Main()
	{
	   int[] x = new int[6];
	   int[] p = new int[6];
	   int i;
	   for (i = 0;i < 6;i++)
	   {
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   x[i] = Integer.parseInt(tempVar);
	   }
	   }
	   for (i = 0;i < 6;i++)
	   {
		   if (x[i] >= 0)
		   {
			  p[i] = reverse(x[i]);
		   }
		   else
		   {
			  p[i] = -reverse(-x[i]);
		   }
	   }
		 for (i = 0;i < 6;i++)
		 {
		System.out.printf("%d\n",p[i]);
		 }
		System.in.read();
		System.in.read();
	}

}


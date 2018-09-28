package <missing>;

public class GlobalMembers
{
	public static int reverse(int num)
	{
	   int b = 0;
	   int t = num;
	   if (num > 0)
	   {
		   num = num;
	   }
	   else if (num < 0)
	   {
		   num = -num;
	   }
	   for (int i = 1;num != 0;i++)
	   {
		  int a = num % 10;
		  num = (num - a) / 10;
		  b = b * 10 + a;
	   }
	   if (t == 0 || t == -0)
	   {
		   b = 0;
	   }
	   else if (t > 0)
	   {
		   b = b;
	   }
	   else if (t < 0)
	   {
		   b = -b;
	   }
	   return b;
	}
	public static int Main()
	{
	   int[] num = new int[6];
	   for (int i = 0;i < 6;i++)
	   {
		   String tempVar = ConsoleInput.scanfRead();
		   if (tempVar != null)
		   {
			   num[i] = Integer.parseInt(tempVar);
		   }
	   }
	   for (int i = 0;i < 6;i++)
	   {
		   System.out.printf("%d\n",reverse(num[i]));
	   }
	   System.in.read();
	   System.in.read();
	   System.in.read();
	}


}


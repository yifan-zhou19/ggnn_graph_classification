package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int reverse = int num;
	   int i;
	   int n;
	   int p;
	   for (i = 0;i < 6;i++)
	   {
		   String tempVar = ConsoleInput.scanfRead();
		   if (tempVar != null)
		   {
			   n = Integer.parseInt(tempVar);
		   }
		   p = reverse(n);
		   System.out.printf("%d\n",p);
	   }
	   System.in.read();
	   System.in.read();
	}
	   public static int reverse(int num)
	   {
		   int d; //?????????
		   int r = 0;
		   while (num != 0)
		   {
		   d = num % 10;
		   r = r * 10 + d;
		   num = num / 10;
		   }
		   return (r); //return?????????????????????
	   }














}


package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
	   if (9999 < a && a < 99999)
	   {
		   System.out.printf("%d%d%d%d%d",a % 10,a / 10 % 10,a / 100 % 10,a / 1000 % 10,a / 10000);
	   }
	   if (999 < a && a < 9999)
	   {
		   System.out.printf("%d%d%d%d",a % 10,a / 10 % 10,a / 100 % 10,a / 1000 % 10);
	   }
	   if (99 < a && a < 999)
	   {
		   System.out.printf("%d%d%d",a % 10,a / 10 % 10,a / 100 % 10);
	   }
	   if (9 < a && a < 99)
	   {
		   System.out.printf("%d%d",a % 10,a / 10 % 10);
	   }
	   if (0 < a && a < 9)
	   {
		   System.out.printf("%d",a);
	   }
	}
}


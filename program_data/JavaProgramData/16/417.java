package <missing>;

public class GlobalMembers
{
	public static int num;
	public static int[] digit = new int[5];
	public static int Main()
	{
	   int count = 0;
	   int i;
	   int number;
	   do
	   {
			   String tempVar = ConsoleInput.scanfRead();
			   if (tempVar != null)
			   {
				   num = Integer.parseInt(tempVar);
			   }
	   } while (num < 0 || num>99999);
	   count = 0;
	   number = num;
	   do
	   {
			   digit[count++] = number % 10;
			   number = number / 10;
	   } while (number > 0);
	   for (i = 0;i < count;i++)
	   {
		   System.out.printf("%ld",digit[i]);
	   }
	}
}


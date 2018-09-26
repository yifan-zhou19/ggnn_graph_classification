package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int a;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   a = Integer.parseInt(tempVar);
	   }
	   if (a == 1)
	   {
		  System.out.print("End");
	   }
		  else
		  {
			do
			{
			if (a % 2 == 0)
			{
				  System.out.printf("%d",a);
			   a = a / 2;
			   System.out.printf("/2=%d\n",a);
			}
			else
			{
			   System.out.printf("%d*3+1=",a);
			   a = 3 * a + 1;
			   System.out.printf("%d\n",a);
			}
			} while (a != 1);
			System.out.print("End");
		  }
	   System.in.read();
	   System.in.read();
	   return 0;
	}
}


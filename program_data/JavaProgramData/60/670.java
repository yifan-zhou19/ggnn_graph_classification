package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   int a;
	   int b;

	   int i;
	   if (n <= 4)
	   {
	   System.out.print("empty");
	   }
	   else
	   {
	   for (a = 3;a <= (n - 2);a++)
	   {
			 for (i = 2;i <= a;i++)
			 {
					b = a + 2;
					if (a % i == 0)
					{
					break;
					}
					else if (b % i == 0)
					{
					break;
					}


			 }
			   if (i == a)
			   {
			   System.out.printf("%d %d\n",a,b);
			   }

	   }
	   }
		 System.in.read();
		 System.in.read();




	}
}


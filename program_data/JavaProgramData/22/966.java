package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a = 0;
		int b = 0;
		while (scanf("%d,", n) != EOF)
		{
									 if (n > a)
									 {
										 b = a;
										 a = n;
									 }
									 else if (n < a)
									 {
									 if (n > b)
									 {
									 b = n;
									 }
									 }
		}
	   if (b == 0)
	   {
	   System.out.print("No");
	   }
	   else
	   {
		   System.out.printf("%d",b);
	   }
	}
}

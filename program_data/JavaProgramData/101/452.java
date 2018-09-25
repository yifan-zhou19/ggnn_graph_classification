package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int a;
	int b;
	int c;
	int i;
	for (a = 0;a < 3;a++)
	{
	for (b = 0;b < 3;b++)
	{
	 if (b == a)
	 {
		 continue;
	 }
	 else
	 {
	 c = 3 - a - b;
	 if ((b > a) + (c == a) + a == (a > b) + (a > c) + b && (a > b) + (a > c) + b == (c > b) + (b > a) + c)
	 {
	   for (i = 0;i < 3;i++)
	   {
	   if (a == i)
	   {
		   System.out.print("A");
	   }
	   if (b == i)
	   {
		   System.out.print("B");
	   }
	   if (c == i)
	   {
		   System.out.print("C");
	   }
	   }

	 }
	 }

	}

	}
	return 0;

	}
}

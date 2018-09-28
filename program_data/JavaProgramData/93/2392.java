package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int n;
	int t = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	if (n % 3 == 0)
	{
	   t = 1;
	   System.out.print("3");
	}
	if (n % 5 == 0)
	{
	   if (t == 1)
	   {
	   System.out.print(" ");
	   }
		t = 1;
	   System.out.print("5");
	}
	if (n % 7 == 0)
	{
	   if (t == 1)
	   {
	   System.out.print(" ");
	   }
		t = 1;
	   System.out.print("7");
	}
	if (t == 0)
	{
	  System.out.print("n");
	}
	}
}


package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 int n;
	 int i;
	 int f = 0;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 for (i = 3;i <= 7;i = i + 2)
	 {
	   if (n % i == 0)
	   {
		 f = 1;
		 System.out.printf("%d",i);
		 break;
	   }
	 }
	 for (i = i + 2;i <= 7;i = i + 2)
	 {
	   if (n % i == 0)
	   {
		 f = 1;
		 System.out.printf(" %d",i);
	   }
	 }
	 if (f == 0)
	 {
	   System.out.print("n");
	 }
	 System.out.print("\n");
	}
}


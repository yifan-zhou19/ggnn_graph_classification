package <missing>;

public class GlobalMembers
{
	public static int turn(int a)
	{
	  int i;
	  int k;
	  int m = 0;
	  String x = new String(new char[1000]);
	  for (i = 0;a != 0;i++)
	  {
		 x = tangible.StringFunctions.changeCharacter(x, i, a % 10);
		 a = a / 10;
	  }
	   for (k = 0;k < i;k++)
	   {
	   m = x.charAt(k) + 10 * m;
	   }
	   return (m);
	}
	public static int Main()
	{
	 int n;
	 for (int i = 0;i < 6;i++)
	 {
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 if (n < 0)
		 {
		 System.out.printf("-%d\n",turn(-n));
		 }
		 else
		 {
		 System.out.printf("%d\n",turn(n));
		 }
	 }
	}
}


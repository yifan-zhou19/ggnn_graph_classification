package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int i = 1;
	 int n;
	 int m;
	 int p;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 if (n == 10000)
	 {
		 System.out.print("00001");
	 }
	 else if (n <= 9)
	 {
		 m = 1;
	 }
	 else if (n < 100)
	 {
		 m = 2;
	 }
	 else if (n < 1000)
	 {
		 m = 3;
	 }
	 else if (n < 10000)
	 {
		 m = 4;
	 }
	 while (i <= m)
	 {
		p = n - n / 10 * 10;
		System.out.printf("%d",p);
		n = n / 10;
		i++;
	 }
	 return 0;
	}

}


package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int a;
	 int b;
	 int c;
	 int n;
	 int k;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 k = Integer.parseInt(tempVar2);
	 }
	a = 1;
	c = 1;
	b = 1;
	 while (b <= n)
	 {
		 if (a % (n - 1) == 0)
		 {
		 a = (a / (n - 1)) * n + k;
	  b++;
		 }
	 else
	 {
		 c = c + 1;
	 a = c * (n - 1);
	 b = 1;
	 }
	 }
	 System.out.printf("%d\n",a);





	 return 0;
	}
}


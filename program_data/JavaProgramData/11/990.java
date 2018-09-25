package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int run = int n;
	 int[] q = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	 int i;
	 int n;
	 int y;
	 int r;
	 int s = 0;
	 int k;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead(" ");
	 if (tempVar2 != null)
	 {
		 y = Integer.parseInt(tempVar2);
	 }
	 String tempVar3 = ConsoleInput.scanfRead(" ");
	 if (tempVar3 != null)
	 {
		 r = Integer.parseInt(tempVar3);
	 }
	 for (i = 0;i < y;i++)
	 {
	  s = s + q[i];
	 }
	 s = s + r;
	 k = run(n);
	 if (k != 0 && (y > 2))
	 {
		 s += 1;
	 }
	 System.out.printf("%d",s);

	}

	public static int run(int n)
	{
		int a;
	 if ((n % 400 == 0) || ((n % 4 == 0) && (n % 100 != 0)))
	 {
		 a = 1;
	 }
	 else
	 {
		 a = 0;
	 }
	 return a;
	}

}


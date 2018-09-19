package <missing>;

public class GlobalMembers
{
	public static int[] b = new int[5];
	public static int m = 0;
	public static int f(int n)
	{
	 int c;
	 if (n == 0)
	 {
		 return (0);
	 }
	 else
	 {
	  b[m] = n % 10;
	  m++;
	  c = n / 10;
	  return f(c);
	 }
	}
	public static void Main()
	{
	 int n;
	 int i;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 f(n);
	 for (i = 0;i < m;i++)
	 {
	 System.out.printf("%d",b[i]);
	 }
	}
}


package <missing>;

public class GlobalMembers
{
	public static int reverse(int a)
	{
		int c;
		int d = 0;
		int i;
		if (a < 0)
		{
			a = -a;
			for (i = 0;a != 0;i++)
			{
			 c = a % 10;
			 a = a / 10;
			 d = c + d * 10;
			}
			return -d;
		}
		else
		{
			for (i = 0;a != 0;i++)
			{
			 c = a % 10;
			 a = a / 10;
			 d = c + d * 10;
			}
			return d;
		}
	}
	public static int Main()
	{
	 int i;
	 int[] a = new int[6];
	 int[] b = new int[6];
	 for (i = 0;i < 6;i++)
	 {
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 a[i] = Integer.parseInt(tempVar);
	 }
	 }
	 for (i = 0;i < 6;i++)
	 {
	   b[i] = reverse(a[i]);
	   System.out.printf("%d\n",b[i]);
	 }
	}
}


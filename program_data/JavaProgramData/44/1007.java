package <missing>;

public class GlobalMembers
{
	public static int reverse(int num)
	{
		int d = 0;
		int m;
		if (num >= 0)
		{
			 m = num;
			 while (m != 0)
			 {
			  d = d * 10 + m % 10;
			  m = m / 10;
			 }
		return d;
		}
		else
		{
			m = 0 - num;
			 while (m != 0)
			 {
			  d = d * 10 + m % 10;
			  m = m / 10;
			 }
		return -d;
		}
	}

	public static int Main()
	{
		int i;
		int[] a = new int[10];
		int[] b = new int[10];
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
		System.in.read();
		System.in.read();
		System.in.read();
	}

}


package <missing>;

public class GlobalMembers
{
	public static int reverse(int num)
	{
		int j;
		int m;
		int s;
		int r;
		if (num > 0)
		{
			s = num;
		}
		else
		{
			s = 0 - num;
		}
		r = 0;
		for (j = 1;s > 0;j++)
		{
			m = s % 10;
			r = r * 10 + m;
			s = s / 10;
		}
		if (num < 0)
		{
			r = 0 - r;
		}
		return (r);
	}
	public static int Main()
	{
		 int i;
		 int[] a = new int[7];
		 int[] c = new int[7];
		 for (i = 1;i <= 6;i++)
		 {
			 String tempVar = ConsoleInput.scanfRead();
			 if (tempVar != null)
			 {
				 a[i] = Integer.parseInt(tempVar);
			 }
		 }
		 for (i = 1;i <= 6;i++)
		 {
			 if (a[i] == 0)
			 {
				 System.out.print("0\n");
			 }
			 else
			 {
				 c[i] = reverse(a[i]);
				 System.out.printf("%d\n",c[i]);
			 }
		 }
	}
}


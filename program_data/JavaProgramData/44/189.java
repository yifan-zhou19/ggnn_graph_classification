package <missing>;

public class GlobalMembers
{
	public static int reverse(int num)
	{
		int retval = 0;
		while (num != 0)
		{
		retval = retval * 10 + num % 10;
		num = num / 10;
		}
		return retval;
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
			 b[i] = reverse(a[i]);
			 System.out.printf("%d\n",b[i]);
		 }
	}



}


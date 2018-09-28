package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int[] a = new int[6];
		 int l;
		 int reverse = int num;
		 for (l = 0;l < 6;l++)
		 {
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 a[l] = Integer.parseInt(tempVar);
		 }
		 System.out.printf("%d\n",reverse(a[l]));
		 }
	}

	public static int reverse(int num)
	{
		int i;
		int[] b = new int[5];
		int c = 0;
		int k;
		for (i = 0;num != 0;i++)
		{
				 b[i] = num % 10;
				 num = num / 10;
		}
		i--;
		for (k = 0;k <= i;k++)
		{
			 c = c * 10 + b[k];

		}
		return (c);
	}

}


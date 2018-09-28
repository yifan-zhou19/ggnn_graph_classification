package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int reverse = int n;
		int i;
		int n;
		int j = 0;
		int[] a = new int[6];
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
						 if (a[i] < 0)
						 {
									 a[i] = 0 - a[i];
									 j = reverse(a[i]);
									 System.out.printf("-%d\n",j);
						 }
						 else
						 {
							  j = reverse(a[i]);
							  System.out.printf("%d\n",j);
						 }

		}
		return 0;
	}

	public static int reverse(int n)
	{
		 int b = 0;
		 int l = 0;
		do
		{
			b = n - n / 10 * 10;
			n = n / 10;
			l = l * 10 + b;
		}while (n >= 1);
		return l;
	}
}


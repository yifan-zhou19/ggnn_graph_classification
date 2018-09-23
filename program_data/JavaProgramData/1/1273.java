package <missing>;

public class GlobalMembers
{
	public static int sum;
	public static void zhongshu(int qian, int a)
	{
	   int i;
	   int j;
	   int c;
	   if (a == 1)
	   {
	   sum = sum + 1;
	   return;
	   }
	   for (i = qian;i <= a;i++)
	   {
		  if (a % i == 0)
		  {
			 zhongshu(i, a / i);
		  }
	   }
	}
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] a = new int[100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
		a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n;i++)
		{
			sum = 0;
		   zhongshu(2, a[i]);
		   System.out.print(sum);
		   System.out.print("\n");
		}
		return 0;
	}
}


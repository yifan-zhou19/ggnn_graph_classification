package <missing>;

public class GlobalMembers
{
	public static int reverse(int num)
	{
		int[] a = new int[20];
		int i;
		int j;
		int k = 1;
		int r = 0;
		int m = 1;
		for (i = 0;num % k != num;i++)
		{
		  k = k * 10;
		  a[i] = (num % k - num % (k / 10)) / (k / 10);
		}
		for (j = 0;j < i;j++)
		{
		  m = m * 10;
		  r += a[j] * (k / m);
		}
		return r;
	}
	public static int Main()
	{
		int[] a = new int[6];
		int i;
		for (i = 0;i < 6;i++)
		{
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  a[i] = Integer.parseInt(tempVar);
		  }
		  if (a[i] == 0)
		  {
			System.out.print("0\n");
		  }
		  else if (a[i] < 0)
		  {
			System.out.printf("%d\n",reverse(a[i] * (-1)) * (-1));
		  }
		  else
		  {
			System.out.printf("%d\n",reverse(a[i]));
		  }
		}
		System.in.read();
		System.in.read();


	}
}


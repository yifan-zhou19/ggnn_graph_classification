package <missing>;

public class GlobalMembers
{
	public static int cifang(int n)
	{
		int t = 1;
		int i;
		if (n == 0)
		{
		return t;
		}
		else
		{
		for (i = n;i > 0;i--)
		{
		t = t * 10;
		}
		return t;
		}
	}
	public static int reverse(int num)
	{
		int i;
		int j;
		int count = 0;
		int t;
		int total = 0;
		int[] a = new int[500];
		int[] b = new int[500];

		for (i = 0;;i++)
		{
					 t = 0;
					 t = num % cifang(i + 1);
					 a[i] = t / cifang(i);
					 count++;
					 num = num - a[i] * cifang(i);
					 if (num == 0)
					 {
						 break;
					 }
		}

		for (i = 0;i < count;i++)
		{
		total = total + a[i] * cifang(count - i - 1);
		}
		if (total == -0)
		{
		return total = 0;
		}
		else
		{
		return total;
		}
	}
	public static int Main()
	{
		  for (int i = 6;i > 0;i--)
		  {
		  int n;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  reverse(n);
		 System.out.printf("%d\n",reverse(n));
		  }
		  System.in.read();
		  System.in.read();
	}
}


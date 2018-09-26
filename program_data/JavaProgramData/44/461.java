package <missing>;

public class GlobalMembers
{
	public static int reverse(int x)
	{
		int[] a = new int[20];
		int i;
		int j;
		int t;
		int y;
		int l = 0;
		for (i = 0;i < 20;i++)
		{
			a[i] = 0;
		}
		while (x != 0)
		{
			a[l] = x % 10;
			x /= 10;
			l += 1;
		}
		y = 0;
		t = 1;
		for (i = 0;i <= l;i++)
		{
			for (j = l - 1;j > i;j--)
			{
				t *= 10;
			}
			y += a[i] * t;
			t = 1;
		}
		return (y);
	}
	public static int Main()
	{
		  int i;
		  int n;
		  for (i = 0;i <= 5;i++)
		  {
			  String tempVar = ConsoleInput.scanfRead();
			  if (tempVar != null)
			  {
				  n = Integer.parseInt(tempVar);
			  }
			  if (n < 0)
			  {
				  System.out.print("-");
				  n = -n;
			  }
			  n = reverse(n);
			  System.out.printf("%d\n",n);
		  }
		  System.in.read();
		  System.in.read();
	}

}


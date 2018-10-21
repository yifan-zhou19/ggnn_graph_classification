package <missing>;

public class GlobalMembers
{
	public static int f(int i)
	{
		int c;
		int k;
		if (i == 2)
		{
			c = 1;
		}
		else if (i % 2 == 0)
		{
			c = 0;
		}
		else if (i == 3)
		{
			c = 1;
		}
		else
		{
			k = 3;
			while (k <= i - 2 && i % k != 0)
			{
				k = k + 2;
			}
			if (k == i)
			{
				c = 1;
			}
			else
			{
				c = 0;
			}
		}
		return c;
	}
	public static int g(int i)
	{
		int num = 0;
		int c;
		int t;
		t = i;
		while (i != 0)
		{
			num = num * 10 + i % 10;
			i = (i - i % 10) / 10;
		}
		if (t == num)
		{
			c = 1;
		}
		else
		{
			c = 0;
		}
		return c;
	}
	public static void Main()
	{
		int m;
		int n;
		int num = 0;
		int i;
		int l = 0;
		int[] b = new int[300];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = m;i <= n;i++)
		{
			if (f(i) * g(i) != 1)
			{
			num++;
			}
		   if (f(i) * g(i) == 1)
		   {
			   l++;
			   b[l] = i;
		   }
		}
		 if (num == n - m + 1)
		 {
			System.out.print("no");
		 }
		 else
		 {
			 for (i = 1;i <= l - 1;i++)
			 {
				 System.out.printf("%d,",b[i]);
			 }
			 System.out.printf("%d",b[l]);
		 }




	}





}


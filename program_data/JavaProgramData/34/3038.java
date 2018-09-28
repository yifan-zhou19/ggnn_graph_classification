package <missing>;

public class GlobalMembers
{
	public static int b;
	public static int jishu(int n)
	{
	  int b;
	  b = n;
	  n = n * 3 + 1;
	  System.out.printf("%d*3+1=%d\n",b,n);
	  if (n == 1)
	  {
	  return (0);
	  }
	  else if (n % 2 == 0)
	  {
		return oushu(n);
	  }
	  else
	  {
		return jishu(n);
	  }
	}
	public static int oushu(int n)
	{
			int a;
			a = n;
			n = n / 2;
			System.out.printf("%d/2=%d\n",a,n);
			if (n == 1)
			{
				return (0);
			}
			else if (n % 2 == 0)
			{
				return oushu(n);
			}
			else
			{
				return jishu(n);
			}
	}

	public static void Main()
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			b = Integer.parseInt(tempVar);
		}
		if (b == 1)
		{
			System.out.print("End");
			return;
		}
		else if (b % 2 == 0)
		{
			oushu(b);
		}
		else
		{
			jishu(b);
		}
		System.out.print("End");
	}
}


package <missing>;

public class GlobalMembers
{
	public static int p(int i) //???
	{
		int s = 1;
		for (int j = 1;j <= i;j++)
		{
				s = s * 10;
		}
		return s;
	}
	public static int size(int a) //????????
	{
		int b;
		int S = 1;
		for (b = 1;b < 20;b++)
		{
			S = S * 10;
			if (S > a)
			{
				break;
			}
		}
		return (b);
	}
	public static int reserve(int n) //?????
	{
		int g = 0;
		int k;
		if (n == 0) //???0??????0
		{
				g = 0;
		}
		else
		{
			k = Math.abs(n);
			int[] a = new int[32];
			int i;
			int b = size(k);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(a,0,(Integer.SIZE / Byte.SIZE));
			for (i = b - 1;i >= 0;i--) //?????
			{
					a[i] = k % 10;
					k = k / 10;
			}
			for (i = b - 1;i >= 0;i--) //??????0????????
			{
					if (a[i] != 0)
					{
							   break;
					}
			}
			for (int j = i;j >= 0;j--) //????????
			{
						g = g + a[j] * p(j);
			}
			if (n < 0)
			{
				g = -g;
			} //??n????g????
		}
		return g;
	}
	public static int Main()
	{
		int i = 6;
		while (i-- != 0)
		{
				  int n;
				  n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				  int a = reserve(n);
				  System.out.print(a);
				  System.out.print("\n");
		}
		return 0;
	}

}


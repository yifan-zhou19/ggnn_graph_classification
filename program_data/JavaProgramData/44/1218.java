package <missing>;

public class GlobalMembers
{
	public static int rev(int n)
	{
		int[] digit = new int[6];
		int i;
		int out = 0;
		int a;
		for (i = 0;;i++)
		{
			digit[i] = n % 10;
			n /= 10;
			if (n == 0)
			{
				break;
			}
		}
		a = i + 1;
		for (i = 0;i < a;i++)
		{
			out += (digit[i] * Math.pow(10,a - 1 - i));
		}
		return out;
	}

	public static int Main()
	{
		int n;
		int i;
		for (i = 0;i < 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			if (i != 0)
			{
				System.out.print("\n");
			}
			System.out.printf("%d",rev(n));
		}
		return 0;
	}
}


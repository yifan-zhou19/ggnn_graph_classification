package <missing>;

public class GlobalMembers
{
	public static int ss(int x)
	{
		int result = 0;
		int i;
		for (i = 2;i < x;i++)
		{

			if (x % i == 0)
			{
				result *= 0;
				break;

			}
			else
			{
				result += 1;
			}
		}
		return result;
	}
	public static int Main()
	{
		int n;
		int j;
		int a;
		int b;
		int c = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 3;j < n - 1;j += 2)
		{
			a = ss(j);
			b = ss(j + 2);
			if (a > 0 && b > 0)
			{
				System.out.printf("%d %d\n",j,j + 2);
				c++;
			}
		}
		if (c == 0)
		{
			System.out.print("empty");
		}

		  return 0;
	}
}


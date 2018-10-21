package <missing>;

public class GlobalMembers
{
	public static int function(int a)
	{
		int b;
		if (a % 2 == 1)
		{
			b = 3 * a + 1;
			System.out.printf("%d*3+1=%d\n",a,b);
			return b;
		}
		else if (a % 2 == 0)
		{
			b = a / 2;
			System.out.printf("%d/2=%d\n",a,b);
			return b;
		}
	}


	public static void Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n == 1)
		{
			System.out.print("End\n");
		}
		else
		{
			while (true)
			{
				n = function(n);
				if (n == 1)
				{
					System.out.print("End\n");
					break;
				}
			}
		}
	}
}


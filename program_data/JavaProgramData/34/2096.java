package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int ji = int x;
		int ou = int y;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (true)
		{
			if (n != 1)
			{
				if (n % 2 == 0)
				{
					n = ou(n);
				}
				else
				{
					n = ji(n);
				}
			}
			else
			{
				System.out.print("End");
				break;
			}
		}
		return 0;
	}
	public static int ji(int x)
	{
		int z;
		z = x * 3 + 1;
		System.out.printf("%d*3+1=%d\n",x,z);
		return (z);
	}
	public static int ou(int x)
	{
		int z;
		z = x / 2;
		System.out.printf("%d/2=%d\n",x,z);
		return (z);
	}
}


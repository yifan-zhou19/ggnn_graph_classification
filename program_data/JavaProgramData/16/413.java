package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int[] num = new int[10];
	public static int Main()
	{
		int i;
		int t = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(num,-1,(Integer.SIZE / Byte.SIZE));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int x = n;
		num[0] = 0;
		while (n > 0)
		{
				  num[t] = n % 10;
				  n -= n % 10;
				  n /= 10;
				  t++;
		}
		for (i = 0;i < t;++i)
		{
						   System.out.print(num[i]);
		}
		if (x == 0)
		{
			System.out.print(0);
		}
		System.out.print("\n");
		return 0;
	}


}


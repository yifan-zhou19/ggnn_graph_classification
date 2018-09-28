package <missing>;

public class GlobalMembers
{
	public static String stack = new String(new char[MAX]);
	public static int count = 0;

	public static int isprime(int n)
	{
		return stack.charAt(n);
	}


	public static void makechart(int n)
	{
		int i;
		int j;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
	memset(stack,1,(Character.SIZE / Byte.SIZE) * (n + 1));
	stack = stack.substring(0, 1);
		for (i = 2;i < n;i++)
		{
			if (stack.charAt(i) == 0)
			{
				continue;
			}


			for (j = 2;j * i <= n;j++)
			{
				stack = stack.substring(0, i * j);
			}
		}
	}

	public static int Main()
	{
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		makechart(n);
		for (i = 6;i <= n;i += 2)
		{
			for (j = 2;j + j <= i;j++)
			{
				if (isprime(j) != 0 && isprime(i - j) != 0)
				{
					System.out.printf("%d=%d+%d\n",i,j,i - j);
				break;
				}
			}
		}
		return 0;
	}



}


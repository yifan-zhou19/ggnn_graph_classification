package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] n;
		int x;
		int i;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *ans;
		int ans;
		int fibonacci = int;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		n = new int[x];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
		ans = (int)calloc(x,(Integer.SIZE / Byte.SIZE));
		for (i = 0;i < x;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < x;i++)
		{
			ans[i] = fibonacci(n[i]);
			System.out.printf("%d\n",ans[i]);
		}
	}
	public static int fibonacci(int n)
	{
		if (n == 1 || n == 2)
		{
			return 1;
		}
		else
		{
			return fibonacci(n - 2) + fibonacci(n - 1);
		}
	}
}


package <missing>;

public class GlobalMembers
{
	public static int find(int n)
	{
		int i;
		for (i = 2;i <= Math.sqrt(n);i++)
		{
			if (n % i == 0)
			{
				return 0;
			}
		}
		return 1;
	}

	public static int Main()
	{
		int[] a = new int[1000000];
		int i;
		int j = 0;
		int n;
		int s = 0;
		int ok = 1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a,0,(Integer.SIZE / Byte.SIZE));
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			if (find(i) != 0)
			{
				a[j++] = i;
			}
		}
		for (i = 0;i < j;i++)
		{
			if (a[i + 1] - a[i] == 2)
			{
				System.out.printf("%d %d\n",a[i],a[i + 1]);
				s++;
				ok = 0;
			}
		}
		if (s == 0)
		{
			System.out.print("empty");
			ok = 0;
		}
		if (ok != 0)
		{
			System.out.print("^");
		}

		return 0;
	}

}


package <missing>;

public class GlobalMembers
{
	public static int myfunc(Object a, Object b)
	{
		return *(int)a - (int)b;
	}
	public static int max(int a, int b)
	{
		return a > b != 0?a:b;
	}
	public static int Main()
	{
		int[] t = new int[2000];
		int[] q = new int[1000];
		int n;
		int i;
		int start;
		int sum;
		int tmp;
		while (true)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			if (n == 0)
			{
				break;
			}
			for (i = 0; i < n; i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					t + i = tempVar2;
				}
			}
			for (i = 0; i < n; i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					q + i = tempVar3;
				}
			}
			qsort(t, n, (Integer.SIZE / Byte.SIZE), myfunc);
			qsort(q, n, (Integer.SIZE / Byte.SIZE), myfunc);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memcpy' has no equivalent in Java:
			memcpy(t + n, t, n);
			sum = -0xFFFFFFF;
			for (start = 0; start < n; start++)
			{
				tmp = 0;
				for (i = 0; i < n; i++)
				{
					if (t[start + i] < q[i])
					{
						tmp -= 200;
					}
					if (t[start + i] > q[i])
					{
						tmp += 200;
					}
				}
				sum = max(sum, tmp);
			}
			System.out.printf("%d\n", sum);
		}
		return 0;
	}
}


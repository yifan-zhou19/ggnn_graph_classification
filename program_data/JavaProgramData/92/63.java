package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int[] King = new int[1005];
	public static int[] Tian = new int[1005];
	public static int[] Ans = new int[1005];

	public static int mCmp(Object v1, Object v2)
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *i1=(int *)v1;
		int i1 = (int)v1;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *i2=(int *)v2;
		int i2 = (int)v2;
		return i1 - i2;
	}

	public static int Main()
	{
		int i;
		int j;
		int k;
		int max;
		while (true)
		{
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (n == 0)
			{
				return 0;
			}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(King,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(Tian,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(Ans,0,(Integer.SIZE / Byte.SIZE));
			max = -1000000;
			for (i = 0;i < n;i++)
			{
				Tian[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			for (i = 0;i < n;i++)
			{
				King[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			qsort(Tian,n,(Integer.SIZE / Byte.SIZE),mCmp);
			qsort(King,n,(Integer.SIZE / Byte.SIZE),mCmp);
			for (i = 0;i <= n;i++)
			{
				Ans[i] = 0;
				for (j = 0;j < i;j++)
				{
					if (King[n - 1 - j] > Tian[j])
					{
						Ans[i] -= 200;
					}
					else if (King[n - 1 - j] < Tian[j])
					{
						Ans[i] += 200;
					}
				}
				for (j = i;j < n;j++)
				{
					if (King[j - i] > Tian[j])
					{
						Ans[i] -= 200;
					}
					else if (King[j - i] < Tian[j])
					{
						Ans[i] += 200;
					}
				}
				if (Ans[i] >= max)
				{
					max = Ans[i];
				}
			}
			System.out.print(max);
			System.out.print("\n");
		}
	}
}


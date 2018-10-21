package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int t;
		int s = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[N];
		int[] b = new int[N];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a,0,(Integer.SIZE / Byte.SIZE));
		for (i = 0;i < N;i++)
		{
			b[i] = 1;
		}
		j = 0;
		for (i = 3;i <= n;i = i + 2)
		{
			a[j++] = i;
		}
		for (i = 0;i < N;i++)
		{
			if (a[i] == 0)
			{
				t = i;
				break;
			}
		}
		for (i = 0;i < t;i++)
		{
			k = Math.sqrt(a[i]) + 1;
			for (j = 2;j <= k;j++)
			{
				if (a[i] % j == 0)
				{
					b[i] = 0;
					break;
				}
			}
		}
		for (i = 0;i < t - 1;i++)
		{
			if (b[i] == 1 && b[i + 1] == 1)
			{
				s++;
				System.out.printf("%d %d\n",a[i],a[i + 1]);
			}
		}
		if (s == 0)
		{
			System.out.print("empty\n");
		}
		return 0;
	}


}


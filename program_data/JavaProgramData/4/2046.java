package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int l;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p[100];
		int[] p = new int[100];
		for (i = 0;i < n;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p[i] = (int)malloc(m * (Integer.SIZE / Byte.SIZE));
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < m;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					p[i] + j = tempVar3;
				}
			}
		}
		for (i = 0;i < m;i++)
		{
			if (i - (n - 1) >= 0)
			{
				for (l = 0;l < n;l++)
				{
					System.out.printf("%d\n",*(p[l] + (i - l)));
				}
			}
			else
			{
				for (l = 0;l <= i;l++)
				{
					System.out.printf("%d\n",*(p[l] + (i - l)));
				}
			}
		}
		for (i = 1;i < n;i++)
		{
			if (n - i >= m)
			{
				for (l = 0;l < m;l++)
				{
					System.out.printf("%d\n",*(p[(i + l)] + (m - (1 + l))));
				}
			}
			else
			{
				for (l = 0;l < n - i;l++)
				{
					System.out.printf("%d\n",*(p[(i + l)] + (m - (1 + l))));
				}
			}
		}
		return 0;
	}

}


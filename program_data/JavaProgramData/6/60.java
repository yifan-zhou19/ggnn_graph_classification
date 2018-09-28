package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int n;
		int m;
		int i;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
			int j;
			int sum = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p = (int)malloc((Integer.SIZE / Byte.SIZE) * m * n);
			for (j = 0;j < m * n;j++)
			{
				String tempVar4 = ConsoleInput.scanfRead();
				if (tempVar4 != null)
				{
					p + j = Integer.parseInt(tempVar4);
				}
				if (j < n || (j < n * m && j >= (m - 1) * n) || j % n == 0 || (j + 1) % n == 0)
				{
					sum += *(p + j);
				}
			}
			System.out.printf("%d\n",sum);

		}
	}
}


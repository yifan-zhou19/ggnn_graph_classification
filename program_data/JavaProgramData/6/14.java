package <missing>;

public class GlobalMembers
{
	public static int f(tangible.RefObject<Integer> p, int m, int n)
	{
		int row;
		int col;
		int temp;
		int sum = 0;
		for (row = 1;row < m + 1;row++)
		{
			for (col = 1;col < n + 1;col++)
			{
				if (row == 1 || row == m || col == 1 || col == n)
				{
					temp = (p.argValue + n * (row - 1) + col);
					sum += temp;
				}
			}
		}
		return sum;
	}
	public static int Main()
	{
		int k;
		int m;
		int n;
		int i;
		int s;
		int row;
		int col;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p = (int)malloc((Integer.SIZE / Byte.SIZE));
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
			for (row = 1;row < m + 1;row++)
			{
				for (col = 1;col < n + 1;col++)
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						p + n * (row - 1) + col = Integer.parseInt(tempVar4);
					}
				}
			}
		tangible.RefObject<Integer> tempRef_p = new tangible.RefObject<Integer>(p);
			s = f(tempRef_p, m, n);
			p = tempRef_p.argValue;
			System.out.printf("%d\n",s);
		}
		return 0;
	}
}


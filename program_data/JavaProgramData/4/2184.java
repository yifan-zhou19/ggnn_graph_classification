package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p1[100],*p2,i,j,n,m,s;
		int[] p1 = new int[100];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p2;
		int p2;
		int i;
		int j;
		int n;
		int m;
		int s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < 100;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1[i] = (int)malloc(100 * (Integer.SIZE / Byte.SIZE));
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < m;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					*(p1[i] + j) = tempVar3;
				}
			}
		}
			for (s = 0;s < n + m - 1;s++)
			{
				for (i = 0;i < n;i++)
				{
					if (s - i < m)
					{
					System.out.printf("%d\n",*(p1[i] + s - i));
					}
					if (s - i == 0 || i == n)
					{
						break;
					}
				}
			}
	}

}


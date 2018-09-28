package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p,n,m,t,i,j;
		int p;
		int n;
		int m;
		int t;
		int i;
		int j;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
		p = (int)calloc(25,(Integer.SIZE / Byte.SIZE));
		for (i = 0;i < 25;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				p + i = Integer.parseInt(tempVar);
			}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		if (0 <= n != 0 && 0 <= m != 0 && 5> n && 5> m)
		{
			for (i = 0;i < 5;i++)
			{
				t = (p + 5 * n + i);
				*(p + 5 * n + i) = *(p + 5 * m + i);
				*(p + 5 * m + i) = t;
			}
			for (i = 0;i < 5;i++)
			{
				for (j = 0;j < 5;j++)
				{
					j == 4?System.out.printf("%d\n",*(p + 5 * i + j)):printf("%d ",*(p + 5 * i + j));
				}
			}
		}
		else
		{
			System.out.print("error");
		}
	}
}


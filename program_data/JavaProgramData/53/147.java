package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[100];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
		int m = 0;
		int s;
		int q;
		int k;
		p = a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s = Integer.parseInt(tempVar2);
			}
			q = 1;
			for (k = 0;k < m;k++)
			{
				q = q * (*(p + k) != s);
			}
			if (q != 0)
			{
			   *(p + m) = s;
			   m = m + 1;
			}
		}
		i = 1;
		System.out.printf("%d", p);
		while (*(p + i) != 0)
		{
			System.out.printf(",%d",*(p + i));
			i = i + 1;
		}
		return 0;
	}
}


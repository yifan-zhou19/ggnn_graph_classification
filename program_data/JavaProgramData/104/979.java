package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p,*q;
		int p;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *q;
		int q;
		int x;
		int y;
		int[] a = new int[10];
		int[] b = new int[10];

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}
		for (i = 0;x != 0;i++)
		{
			a[i] = x;
			x /= 2;
			p = a[i];
		}
		for (i = 0;y != 0;i++)
		{
			b[i] = y;
			y /= 2;
			q = b[i];
		}
		for (;;q--,p--)
		{
			if (q == p && *(q - 1) != *(p - 1))
			{
				System.out.printf("%d\n", p);
				break;
			}
		}
		return 0;
	}
}


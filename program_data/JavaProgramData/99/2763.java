package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *a,i,*p,u,b,c,d;
		int a;
		int i;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
		int u;
		int b;
		int c;
		int d;
		u = b = c = d = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		a = (int)malloc(n * (Integer.SIZE / Byte.SIZE));
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a + i = Integer.parseInt(tempVar2);
			}
		}
		p = a;
		for (i = 0;i < n;i++)
		{
			if (*(p + i) >= 1 && *(p + i) <= 18)
			{
				u = u + 1;
			}
			else if (*(p + i) >= 19 && *(p + i) <= 35)
			{
				b = b + 1;
			}
			else if (*(p + i) >= 36 && *(p + i) <= 60)
			{
				c = c + 1;
			}
			else if (*(p + i) > 60)
			{
				d = d + 1;
			}
		}
		System.out.printf("1-18: %.2lf%%\n",((double)u / n) * 100);
		System.out.printf("19-35: %.2lf%%\n",((double)b / n) * 100);
		System.out.printf("36-60: %.2lf%%\n",((double)c / n) * 100);
		System.out.printf("60??: %.2lf%%\n",((double)d / n) * 100);
		return 0;
	}
}


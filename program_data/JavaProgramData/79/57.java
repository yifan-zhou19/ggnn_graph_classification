package <missing>;

public class GlobalMembers
{
	public static int f(int m,int n)
	{
		int s = 0;
		int i = 0;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *pa,*p;
		int pa;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		pa = (int)malloc((Integer.SIZE / Byte.SIZE) * n);
		for (p = pa;p < pa + n;p++)
		{
		   *p = 1;
		}
		p = pa;
		while (s != n * m)
		{
			s = s + *(p + i % n);
			if (s % m == 0)
			{
				*(p + i % n) = 0;
			}
			i++;
		}
		if (i % n == 0)
		{
			i = n;
		}
		else
		{
			i = i % n;
		}
		return (i);
	}
	public static void Main()
	{
		while (true)
		{
		int m;
		int n;
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
		if (m > 0 && n > 0)
		{
			System.out.printf("%d\n",f(m, n));
		}
		else
		{
			break;
		}
		}
	}


}


package <missing>;

public class GlobalMembers
{
	public static int suan(int n, tangible.RefObject<Integer> p)
	{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p.argValue = (int)malloc((Integer.SIZE / Byte.SIZE) * n);
		if (n == 1 || n == 2)
		{
					  *(p.argValue + n - 1) = 1;
		}
		else
		{
			*(p.argValue + n - 1) = suan(n - 1, p) + suan(n - 2, p);
		}
		return *(p.argValue + n - 1);
	}
	public static int Main()
	{
		int b;
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			b = Integer.parseInt(tempVar);
		}
		for (i = 0;i < b;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		int[] a = new int[n];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
		p = a;
	tangible.RefObject<Integer> tempRef_p = new tangible.RefObject<Integer>(p);
		System.out.printf("%d\n",suan(n, tempRef_p));
		p = tempRef_p.argValue;
		}
		System.in.read();
		System.in.read();
		System.in.read();
	}

}


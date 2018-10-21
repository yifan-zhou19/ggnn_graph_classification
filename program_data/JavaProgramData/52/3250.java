package <missing>;

public class GlobalMembers
{
	public static void change(int n, int m, tangible.RefObject<Integer> p)
	{
		int i;
		int j;
		int q;
		for (i = 0;i < m;i++)
		{
			q = (p.argValue + n - 1);
			for (j = n - 1;j > 0;j--)
			{
				*(p.argValue + j) = *(p.argValue + j - 1);
			}
			p.argValue = q;
		}
	}
	public static void Main()
	{
		int n;
		int m;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
		int i;
		int q = 0;
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
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p = (int)malloc((Integer.SIZE / Byte.SIZE) * n);
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p + i = Integer.parseInt(tempVar3);
			}
		}
	tangible.RefObject<Integer> tempRef_p = new tangible.RefObject<Integer>(p);
		change(n, m, tempRef_p);
		p = tempRef_p.argValue;
		for (i = 0;i < n - 1;i++)
		{
			System.out.printf("%d ",*(p + i));
		}
		System.out.printf("%d\n",*(p + i));
	}
}


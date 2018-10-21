package <missing>;

public class GlobalMembers
{
	public static void move(tangible.RefObject<Integer> p, int n)
	{
		int i;
		int temp;
		temp = (p.argValue + n - 1);
		for (i = n - 2;i >= 0;i--)
		{
			*(p.argValue + i + 1) = *(p.argValue + i);
		}
		p.argValue = temp;
	}

	public static void Main()
	{
		int i;
		int n;
		int m;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
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
		p = (int)malloc(n * (Integer.SIZE / Byte.SIZE));
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p + i = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < m;i++)
		{
		tangible.RefObject<Integer> tempRef_p = new tangible.RefObject<Integer>(p);
			move(tempRef_p, n);
			p = tempRef_p.argValue;
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%d",*(p + i));
			if (i != n - 1)
			{
				System.out.print(" ");
			}
			else
			{
				System.out.print("\n");
			}
		}
	}


}


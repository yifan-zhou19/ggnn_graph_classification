package <missing>;

public class GlobalMembers
{
	public static void reverse(tangible.RefObject<Integer> p, int n)
	{
		int temp;
		int i;
		int j;
		for (i = 0,j = n - 1;i < j;i++,j--)
		{
			temp = (p.argValue + i);
			*(p.argValue + i) = *(p.argValue + j);
			*(p.argValue + j) = temp;
		}
	}

	public static void Main()
	{
		int n;
		int i;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p = (int)malloc((Integer.SIZE / Byte.SIZE));
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p + i = Integer.parseInt(tempVar2);
			}
		}
	tangible.RefObject<Integer> tempRef_p = new tangible.RefObject<Integer>(p);
		reverse(tempRef_p, n);
		p = tempRef_p.argValue;
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


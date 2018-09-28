package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int n;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p = (int)(malloc(n * (Integer.SIZE / Byte.SIZE)));
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p + i = Integer.parseInt(tempVar2);
			}
		}
		for (i = n - 1;i > 0;i--)
		{
			System.out.printf("%d ",*(p + i));
		}
		System.out.printf("%d",*(p + i));
	}
}


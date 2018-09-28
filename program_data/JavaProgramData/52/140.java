package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *pint;
		int pint;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		pint = (int)malloc((Integer.SIZE / Byte.SIZE) * a);
		for (i = 0;i < a;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				pint + i = Integer.parseInt(tempVar3);
			}
		}
		for (i = a - b;i < a;i++)
		{
			System.out.printf("%d ",*(pint + i));
		}
		for (i = 0;i < a - b;i++)
		{
			System.out.printf("%d",*(pint + i));
			if (i != a - b - 1)
			{
				System.out.print(" ");
			}
		}
		return 0;
	}

}


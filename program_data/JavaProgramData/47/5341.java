package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int buf;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *array;
		int array;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		array = (int)malloc(n * (Integer.SIZE / Byte.SIZE));
		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				array + i = Integer.parseInt(tempVar2);
			}
		}
		for (i = n - 1; i >= 0; i--)
		{
			if (i != n - 1)
			{
				System.out.print(" ");
			}
			System.out.printf("%d", *(array + i));
		}
		return 0;
	}
}


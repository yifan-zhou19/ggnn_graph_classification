package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *a;
		int a;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		a = (int)malloc(n * 4);
		int i;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a + i = Integer.parseInt(tempVar2);
			}
		}
		int temp;
		for (i = 0;i < n / 2;i++)
		{
			temp = (a + i);
			*(a + i) = *(a + n - 1 - i);
			*(a + n - 1 - i) = temp;
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%d",*(a + i));
			if (i != n - 1)
			{
				System.out.print(" ");
			}
		}
	}
}


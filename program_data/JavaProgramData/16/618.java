package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *a;
		int a;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n != 0)
		{
			m = Math.floor(Math.log10(n)) + 1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			a = (int)malloc((Integer.SIZE / Byte.SIZE) * m);
			for (i = 1; i <= m; i++)
			{
				*(a + i - 1) = n % 10;
				n = (n - *(a + i - 1)) / 10;
			}
			for (i = 1; i <= m; i++)
			{
				System.out.printf("%d", *(a + i - 1));
			}
		}
		else
		{
			System.out.print("0");
		}
	}
}


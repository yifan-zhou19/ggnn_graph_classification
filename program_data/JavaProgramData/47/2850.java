package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] x = new int[100];
		int n;
		int i;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p=null;
		int p = null;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		p = x[0];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (i != 0)
			{
				System.out.print(" ");
			}
			System.out.printf("%d",*(p + n - i - 1));
		}
		System.out.print("\n");
		return 0;
	}
}


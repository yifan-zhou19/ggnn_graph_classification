package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int x;
		int y;
		int[] a = new int[1010];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a,0,(Integer.SIZE / Byte.SIZE));
		for (i = x;i > 0;i /= 2)
		{
			a[i] = 1;
		}
		for (i = y;i > 0;i /= 2)
		{
			if (a[i] != 0)
			{
				System.out.printf("%d",i);
				break;
			}
		}
		return 0;
	}
}


package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[100];
		int n;
		int m;
		int i;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int* p;
		int p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
			if (i >= n - m)
			{
				p = a;
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					p + i - n + m = Integer.parseInt(tempVar3);
				}
			}
			else
			{
				p = a + m;
				String tempVar4 = ConsoleInput.scanfRead();
				if (tempVar4 != null)
				{
					p + i = Integer.parseInt(tempVar4);
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%d%c",a[i],i == n - 1?'\n':' ');
		}
	}
}


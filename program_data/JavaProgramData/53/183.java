package <missing>;

public class GlobalMembers
{
	public static void del(int[] f, int n, int k)
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *pt;
		int pt;
		int i;
		for (i = 0;i < n;i++)
		{
			if (f[i] == k)
			{
				break;
			}
		}
		for (i = i + 1;i < n;i++)
		{
			if (f[i] == k)
			{
				pt = f[i];
				pt = null;
			}
		}
	}
	public static void Main()
	{
		int n;
		int i;
		int[] f = new int[300];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			f[0] = Integer.parseInt(tempVar2);
		}
		for (i = 1;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				f[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			del(f, n, f[i]);
		}
		System.out.printf("%d",f[0]);
		for (i = 1;i < n;i++)
		{
			if (f[i] != 0)
			{
				System.out.printf(",%d",f[i]);
			}
		}
	}
}


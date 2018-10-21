package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[maxn];
	public static int Main()
	{
		int n;
		int i;
		int x1;
		int x2;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a,0,(Integer.SIZE / Byte.SIZE));
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x1 = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				x2 = Integer.parseInt(tempVar3);
			}
			if (x1 + x2 == 0)
			{
				break;
			}
			if (a[x2] != -1)
			{
				a[x2]++;
			}
			a[x1] = -1;
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] == n - 1)
			{
				System.out.print(i);
				System.out.print("\n");
				return 0;
			}
		}
		System.out.print("NOT FOUND");
		System.out.print("\n");

	}
}


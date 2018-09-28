package <missing>;

public class GlobalMembers
{
	public static int cmp(Object a, Object b)
	{
		return (((int)a - (int)b > 0)?1:-1);
	}
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] arr = new int[n];
		int i;
		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				arr[i] = Integer.parseInt(tempVar2);
			}
		}
		qsort(arr,n,(Integer.SIZE / Byte.SIZE),cmp);
		System.out.printf("%d\n",arr[n - 1]);
		System.out.printf("%d\n",arr[n - 2]);
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			n = Integer.parseInt(tempVar3);
		}
		return 0;
	}
}


package <missing>;

public class GlobalMembers
{
	public static int[] t = new int[10001];
	public static int comp(Object a, Object b)
	{
		return * (int) a - (int) b;
	}
	public static int Main()
	{

	   int i;
	   int n;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
		for (i = 0;i < n;i++)
		{

		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			t[i] = Integer.parseInt(tempVar2);
		}
		}
		qsort(t,n,(Integer.SIZE / Byte.SIZE),comp);
		for (i = 0;t[i] % 2;i++)
		{
		System.out.printf("%d",t[i]);
		}
		for (;i < n;i++)
		{
		if (t[i] % 2 != 0)
		{
		System.out.printf(",%d",t[i]);
		}
		}
		return 0;
	}


}


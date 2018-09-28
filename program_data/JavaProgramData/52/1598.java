package <missing>;

public class GlobalMembers
{
	public static void yid(tangible.RefObject<Integer> p, int x, int y)
	{
		int i;
		int j;
		int temp;
		for (i = 0;i < y;i++)
		{
			temp = (p.argValue + x - 1);
			for (j = x - 1;j > 0;j--)
			{
				*(p.argValue + j) = *(p.argValue + j - 1);
			}
			p.argValue = temp;
		}
	}
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * arr;
		int l;
		int[] a = new int[100];
		int n;
		int m;
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
		for (l = 0;l < n;l++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[l] = Integer.parseInt(tempVar3);
			}
		}
		arr = a;
	tangible.RefObject<Integer> tempRef_arr = new tangible.RefObject<Integer>(arr);
		yid(tempRef_arr, n, m);
		arr = tempRef_arr.argValue;
		System.out.printf("%d",*arr);
		for (arr = (a + 1);arr < (a + n);arr++)
		{
			System.out.printf(" %d",*arr);
		}
	}

}


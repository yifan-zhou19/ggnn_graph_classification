package <missing>;

public class GlobalMembers
{
	public static void right_shift_one(int[] a, int n)
	{
		int temp = a[n - 1];
		int i;
		for (i = n - 1;i > 0;i--)
		{
			a[i] = a[i - 1];
		}
		a[0] = temp;
	}
	public static void right_shift_array(tangible.RefObject<Integer> a, int n, int m)
	{
		int i;
		for (i = 0;i < m;i++)
		{
			right_shift_one(a.argValue, n);
		}
	}

	public static int Main()
	{
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
		int[] a = new int[n];
		int i;
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(a[i]) = Integer.parseInt(tempVar3);
			}
		}
	tangible.RefObject<Integer> tempRef_a = new tangible.RefObject<Integer>(a);
		right_shift_array(tempRef_a, n, m);
		a = tempRef_a.argValue;
		for (i = 0;i < n - 1;i++)
		{
			System.out.printf("%d ",a[i]);
		}
		System.out.printf("%d",a[n - 1]);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(a);
		return 0;
	}
}


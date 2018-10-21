package <missing>;

public class GlobalMembers
{
	public static void operate(int[] a, int n)
	{
		int i;
		int pointer = 0;
		int max = a[0];
		for (i = 0;i < n;i++)
		{
		 if (a[i] > max)
		 {
		 pointer = i;
		 max = a[i];
		 }
		}
		a[pointer] = 0;
		System.out.printf("%d\n",max);
	}
	public static void Main()
	{
		int i;
		int n;
		int[] a = new int[101];
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
			a[i] = Integer.parseInt(tempVar2);
		}
		}
		operate(a, n);
		operate(a, n);
	}
}


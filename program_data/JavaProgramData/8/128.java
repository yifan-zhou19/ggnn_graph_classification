package <missing>;

public class GlobalMembers
{
	public static void sort(int[] array, int n)
	{
		int i;
		int j;
		int k;
		int t;
	 for (i = 0;i < n - 1;i++)
	 {
			k = i;
		for (j = i + 1;j < n;j++)
		{
			if (array[j] < array[k])
			{
				k = j;
			}
		}
		t = array[k];
		array[k] = array[i];
		array[i] = t;
	 }
	}
	public static void link(int[] array1, int[] array2, int m, int n)
	{
		int i;
	 for (i = m;i < m + n;i++)
	 {
		 array1[i] = array2[i - m];
	 }
	}

	public static int Main()
	{
		int[] a = new int[40];
		int[] b = new int[20];
		int n1;
		int n2;
		int i;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n1 = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead(" ");
	 if (tempVar2 != null)
	 {
		 n2 = Integer.parseInt(tempVar2);
	 }
	 for (i = 0;i < n1;i++)
	 {
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a[i] = Integer.parseInt(tempVar3);
		}
	 }
	 for (i = 0;i < n2;i++)
	 {
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			b[i] = Integer.parseInt(tempVar4);
		}
	 }
	 sort(a, n1);
	 sort(b, n2);
	 link(a, b, n1, n2);
		for (i = 0;i < n1 + n2 - 1;i++)
		{
			System.out.printf("%d ",a[i]);
		}
		if (i == n1 + n2 - 1)
		{
			System.out.printf("%d",a[i]);
		}
	}

}


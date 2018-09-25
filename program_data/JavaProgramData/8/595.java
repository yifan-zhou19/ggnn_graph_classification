package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		void paixu(int array[],int x);
		int i;
		int n1;
		int n2;
		int[] a = new int[50];
		int[] b = new int[50];
		int[] c = new int[100];
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
		for (i = 0;i <= n1 - 1;i++)
		{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a[i] = Integer.parseInt(tempVar3);
		}
		}
		for (i = 0;i <= n2 - 1;i++)
		{
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			b[i] = Integer.parseInt(tempVar4);
		}
		}
		paixu(a, n1);
		paixu(b, n2);
		for (i = 0;i <= n1 - 1;i++)
		{
		c[i] = a[i];
		}
		for (i = n1;i <= n1 + n2 - 1;i++)
		{
		c[i] = b[i - n1];
		}
		for (i = 0;i <= n1 + n2 - 2;i++)
		{
		System.out.printf("%d ",c[i]);
		}
		System.out.printf("%d",c[n1 + n2 - 1]);
		return 0;
	}
	public static void paixu(int[] array, int x)
	{
		int j;
		int k;
		int t;
		for (k = 1;k <= x - 1;k++)
		{
			 for (j = 0;j <= x - k - 1;j++)
			 {
			 if (array[j] > array[j + 1])
			 {
				 t = array[j];
				 array[j] = array[j + 1];
				 array[j + 1] = t;
			 }
			 }
		}
	}


}


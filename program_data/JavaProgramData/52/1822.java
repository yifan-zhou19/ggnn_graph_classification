package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		void move(int * pa,int m,int n);
		int[] a = new int[110];
		int[] pa = a;
		int n;
		int m;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				pa[i] = tempVar3;
			}
		}
	tangible.RefObject<Integer> tempRef_pa = new tangible.RefObject<Integer>(pa);
		move(tempRef_pa, m, n);
		pa = tempRef_pa.argValue;
		for (i = 0;i < n - 1;i++)
		{
		System.out.printf("%d ",a[i]);
		}
		System.out.printf("%d\n",a[n - 1]);
		System.in.read();
		System.in.read();
	}
	public static void move(tangible.RefObject<Integer> a, int m, int n)
	{
		int temp;
		int i;
		int j;
		for (i = n - m;i < n;i++)
		{
			for (j = i - 1;j >= m - n + i;j--)
			{
				temp = (a.argValue + j);
				*(a.argValue + j) = *(a.argValue + j + 1);
				*(a.argValue + j + 1) = temp;
			}
		}
	}

}


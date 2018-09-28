package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int m;
		int i;
		int[] a = new int[100];
		int t;
		int temp;
		int r;

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
				a[i] = Integer.parseInt(tempVar3);
			}
		}

		for (i = n - m;i < n;i++)
		{
			t = 0;
			r = i;
			while (t < n - m)
			{
				temp = a[r];
				a[r] = a[r - 1];
				a[r - 1] = temp;
				t++;
				r--;
			}
		}

		System.out.printf("%d",a[0]);

		for (i = 1;i < n;i++)
		{
			System.out.printf(" %d",a[i]);
		}
	}


}


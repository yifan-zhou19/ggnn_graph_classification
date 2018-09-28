package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[300];
		int i;
		int j;
		int k;
		int b;
		int c;
		int t1 = -1;
		int t2 = -1;

		char z;
		for (i = 0;i < 300;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				z = tempVar2.charAt(0);
			}
			if (z == '\n')
			{
				k = i;
				break;
			}
		}
		for (i = 0;i <= k;i++)
		{
			if (a[i] >= t1)
			{
				t1 = a[i];
			}
		}
		for (j = 0;j <= k;j++)
		{
			if (a[j] < t1 && a[j] >= t2)
			{
		t2 = a[j];
			}
		}
		if (t2 == -1)
		{
			System.out.print("No");
		}
		else
		{
			System.out.printf("%d",t2);
		}
		System.out.print("\n");
		return 0;
	}

}


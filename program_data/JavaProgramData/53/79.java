package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int t;
		int[] a = new int[100];
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
		for (i = 0;i < n - 1;i++)
		{
			if (a[i] != 0)
			{
				t = a[i];
		for (j = i + 1;j <= n;j++)
		{
			if (a[j] == t)
			{
				a[j] = 0;
			}
		}
			}
		}
		t = 0;
		for (i = 0;i < n;i++)
		{
			if (a[i] != 0 && t == 0)
			{
			System.out.printf("%d",a[i]);
			t++;
			}
			else if (a[i] != 0)
			{
				System.out.printf(",%d",a[i]);
			}
		}
	}
}


package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[300];
		int n = 0;
		int i;
		int j;
		int t;
		char c;
		do
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[n++] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				c = tempVar2.charAt(0);
			}
		}while (c == ',');
		for (i = 0;i < n - 1;i++)
		{
			for (j = 0;j < n - i;j++)
			{
				if (a[j] < a[j + 1])
				{
					t = a[j];
					a[j] = a[j + 1];
					a[j + 1] = t;
				};
			}
		}
		t = 0;
		while (a[t] == a[0] && t < n)
		{
			t++;
		}
		if (t == n)
		{
			System.out.print("No\n");
		}
			else
			{
				System.out.printf("%d",a[t]);
			}
	}
}


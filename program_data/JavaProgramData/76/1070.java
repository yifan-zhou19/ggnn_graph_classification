package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[51000];
		int[] b = new int[51000];
		int k;
		int t;

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
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}

		for (k = n - 1;k > 0;k--)
		{
			for (i = 0;i < k;i++)
			{
				if (a[i] > a[i + 1])
				{
					t = a[i];
					a[i] = a[i + 1];
					a[i + 1] = t;
				t = b[i];
				b[i] = b[i + 1];
				b[i + 1] = t;
				}
			}
		}

		  int x = 0;

		for (i = 0;i < n - 1;i++)
		{
			if (b[0] >= a[i + 1] != 0 && b[0] < b[i + 1])
			{
				b[0] = b[i + 1];
			}
			else if (b[0] >= a[i + 1] != 0 && b[0] >= b[i + 1])
			{
				x = 0;
			}
			else
			{
				x = 1;
				break;
			}
		}

	if (x == 0)
	{
		System.out.printf("%d %d",a[0],b[0]);
	}
	else
	{
		System.out.print("no");
	}


















		return 0;
	}



}


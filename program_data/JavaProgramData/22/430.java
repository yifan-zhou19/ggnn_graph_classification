package <missing>;

public class GlobalMembers
{
	public static int i;
	public static int j;
	public static int k;
	public static int h;
	public static int m;
	public static int n;
	public static int[] a = new int[300];
	public static char c;
	public static int t1 = -1;
	public static int t2 = -1;
	public static int num = 300;

	public static int Main()
	{
		for (k = 0;k <= 300;k++)
		{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[k] = Integer.parseInt(tempVar);
				}
				String tempVar2 = ConsoleInput.scanfRead(null, 1);
				if (tempVar2 != null)
				{
					c = tempVar2.charAt(0);
				}
				if (c == '\n')
				{
					num = k;
					break;
				}
		}

		for (j = 0;j <= num;j++)
		{
			if (a[j] >= t1)
			{
				t1 = a[j];
			}
		}

		for (i = 0;i <= num;i++)
		{
			if ((a[i] >= t2) && (a[i] < t1))
			{
				t2 = a[i];
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

	return 0;
	}


}


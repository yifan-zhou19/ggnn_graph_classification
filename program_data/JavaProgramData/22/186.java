package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[300];
		int i;
		int j;
		int k = 0;
		int d;
		int t;
		for (i = 0;;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			d = i;
			if (System.in.read() == '\n')
			{
				break;
			}
		}
		if (i == 0)
		{
			System.out.print("No\n");
		}
		else
		{
			for (i = 0;i < d;i++)
			{
			for (j = i + 1;j <= d;j++)
			{
				if (a[i] < a[j])
				{
					t = a[i];
					a[i] = a[j];
					a[j] = t;
					k++;
				}
			}
			}
		if (k > 0)
		{
			for (i = 0;;i++)
			{
				if (a[i] != a[i + 1])
				{
					break;
				}
			}
			System.out.printf("%d",a[i + 1]);
		}
		 else
		 {
			System.out.print("No\n");
		 }
		}
	}


}


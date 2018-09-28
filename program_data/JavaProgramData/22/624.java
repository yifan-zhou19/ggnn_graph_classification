package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[300];
		int i = 0;
		int j;
		int l;
		int m = 0;
		int n = 0;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[0] = Integer.parseInt(tempVar);
		}
		for (i = 1;i < 300;i++)
		{

			String tempVar2 = ConsoleInput.scanfRead(",");
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}

		}
		t = 0;
		for (i = 0;i < 300;i++)
		{
			m = 0;
			l = 10000;
			for (j = 0;j < 300;j++)
			{
				if (a[j] > a[i] && a[j] != l)
				{
					m++;
					l = a[j];
				}
			}
			if (m == 1 && a[i] != 0)
			{
				System.out.printf("%d",a[i]);
				t++;
				break;
			}
		}



		if (t == 0)
		{
			System.out.print("No");
		}
		return 0;
	}
}


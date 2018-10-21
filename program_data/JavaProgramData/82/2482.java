package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int t1 = 0;
		int t2 = 0;
		int j = 1;
		int[] a = new int[100];
		int[] b = new int[100];

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;

		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}

		}

		for (i = 0;i < n;i++)
		{
			if (a[i] >= 90 && a[i] <= 140 && b[i] >= 60 && b[i] <= 90)
			{
				t2 += 1;
				if (t2 > t1)
				{
					t1 = t2;
				}
			}


			else
			{
				t2 = 0;
			}
		}


		System.out.printf("%d",t1);




		return 0;
	}
}


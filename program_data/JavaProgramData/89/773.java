package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[10001];
		int[] b = new int[10001];
		int[] c = new int[100000];
		int[] d = new int[100000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int j;
		int k;
		int sum = 0;
		int cs = 0;
		for (i = 0;i < 10001;i++)
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
			cs = cs + 1;
			if (a[i] == 0 && b[i] == 0)
			{
				break;
			}
		}
		for (i = 0;i < n;i++)
		{
			sum = 0;
			for (j = 0;j < cs;j++)
			{
				if (i == a[j])
				{
					sum = sum + 1;
				}

			}
			c[i] = sum;
		}
		 for (i = 0;i < n;i++)
		 {
			if (c[i] == 0)
			{
				System.out.printf("%d",i);
				sum += 1;
			}

		 }
		if (sum == 0)
		{
			System.out.print("NOT FOUND");
		}
		return 0;

	}

}


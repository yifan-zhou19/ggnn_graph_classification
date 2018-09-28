package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int t;
		int j;
		int i;
		int s = 60;
		int[] a = new int[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (j = 0;j < t;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			for (i = 0;i < n;i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i] = Integer.parseInt(tempVar3);
				}
			}
			if (60 >= (a[n - 1] + 3 * n))
			{
				System.out.printf("%d\n",60 - 3 * n);
			}
			else
			{
				for (i = 0;i < n;i++)
				{
				if (s > a[i])
				{
					s = s - 3;
				if (s < a[i])
				{
					s = a[i];
					break;
				}
				}
				if (s < a[i])
				{
					s = 60 - 3 * i;
					break;
				}
				}
				System.out.printf("%d\n",s);
			}
			s = 60;
		}

	}
}


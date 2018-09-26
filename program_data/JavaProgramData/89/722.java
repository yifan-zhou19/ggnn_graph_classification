package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j = 1;
		int k = 1;
		int s;
		int[] a = new int[10000];

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}


		for (;j != 0 || k != 0;)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				j = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				k = Integer.parseInt(tempVar3);
			}
			a[k]++;
		}
		s = 0;
		for (i = 0;i < n;i++)
		{
			if (a[i] == n - 1)
			{
				System.out.printf("%d\n",i);
				s = 1;
				break;
			}
		}
		if (s = 0)
		{
			System.out.print("NOT FOUND");
		}

		return 0;
	}
}


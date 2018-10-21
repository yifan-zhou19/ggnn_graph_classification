package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] ori = new int[300];
		int[] fin = new int[300];
		int i;
		int j;
		int k;
		int a;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				ori[i] = Integer.parseInt(tempVar2);
			}
		}
		fin[0] = ori[0];
		k = 1;
		for (i = 1; i < n; i++)
		{
			a = 0;
			for (j = i - 1; j >= 0 && a == 0; j--)
			{
				if (ori[i] == fin[j])
				{
					a = 1;
				}
			}
			if (a == 0)
			{
				fin[k] = ori[i];
				k++;
			}
		}
		for (i = 0; i < k - 1; i++)
		{
			System.out.printf("%d,", fin[i]);
		}
		System.out.printf("%d", fin[i]);
			 return 0;
	}
}


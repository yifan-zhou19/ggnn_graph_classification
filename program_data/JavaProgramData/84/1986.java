package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] n = new int[100];
		int k;
		int i;
		int t1;
		int t2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		t1 = 0;
		t2 = 0;
		for (i = 1; i <= k; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n[i] = Integer.parseInt(tempVar2);
			}
			if (n[i] > t1)
			{
				t2 = t1;
				t1 = n[i];

			}
			else if (n[i] > t2 && n[i] < t1)
			{
				t1 = t1;
				t2 = n[i];
			}
			else if (n[i] < t2)
			{
				t1 = t1;
				t2 = t2;
			}
		}
		System.out.printf("%d\n%d", t1, t2);
		return 0;
	}


}


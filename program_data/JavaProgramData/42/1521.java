package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int j;
		int[] t = new int[100000];
		int a;
		int k;
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
				t[i] = Integer.parseInt(tempVar2);
			}
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			k = Integer.parseInt(tempVar3);
		}
		for (i = 0;i < n;i++)
		{
			if (t[i] != k)
			{
				a = i;
				System.out.printf("%d",t[i]);
				break;
			}
		}
		for (i = a + 1;i < n;i++)
		{
			if (t[i] != k)
			{
				System.out.printf(" %d",t[i]);
			}

		}

		return 0;
	}
}


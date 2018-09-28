package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int[] a = new int[201];
		int[] b = new int[201];
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
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		k = 0;
		for (i = 0;i < n;i++)
		{
			if ((a[i] == 0 && b[i] == 1) || (a[i] == 1 && b[i] == 2) || (a[i] == 2 && b[i] == 0))
			{
				k += 1;
			}
			else if (a[i] == b[i])
			{
				k += 0;
			}
			else
			{
				k -= 1;
			}
		}
		if (k > 0)
		{
			System.out.print("A");
		}
		else if (k == 0)
		{
			System.out.print("Tie");
		}
		else
		{
			System.out.print("B");
		}
		return 0;
	}


}


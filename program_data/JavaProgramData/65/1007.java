package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[300];
		int[] b = new int[300];
		int n;
		int i;
		int k = 0;
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
		for (i = 0;i < n;i++)
		{
			if (a[i] == 0 && b[i] == 1)
			{
				k++;
			}
			if (a[i] == 0 && b[i] == 2)
			{
				k--;
			}
			if (a[i] == 1 && b[i] == 2)
			{
				k++;
			}
			if (a[i] == 1 && b[i] == 0)
			{
				k--;
			}
			if (a[i] == 2 && b[i] == 0)
			{
				k++;
			}
			if (a[i] == 2 && b[i] == 1)
			{
				k--;
			}
		}
		if (k > 0)
		{
			System.out.print("A");
		}
		else if (k < 0)
		{
			System.out.print("B");
		}
		else
		{
			System.out.print("Tie");
		}
		return 0;

	}

}


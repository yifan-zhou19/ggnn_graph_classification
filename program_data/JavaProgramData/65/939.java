package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j = 0;
		int k = 0;
		int[] a = new int[300];
		int[] b = new int[300];
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
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
			if (a[i] == b[i])
			{
				j++;
				k++;
			}
			if (a[i] == 1 && b[i] == 0)
			{
				k++;
			}
			if (a[i] == 1 && b[i] == 2)
			{
				j++;
			}
			if (a[i] == 0 && b[i] == 1)
			{
				j++;
			}
			if (a[i] == 0 && b[i] == 2)
			{
				k++;
			}
			if (a[i] == 2 && b[i] == 0)
			{
				j++;
			}
			if (a[i] == 2 && b[i] == 1)
			{
				k++;
			}
		}
		if (j == k)
		{
			System.out.print("Tie");
		}
		if (j > k)
		{
			System.out.print("A");
		}
		if (j < k)
		{
			System.out.print("B");
		}
		return 0;
	}

}


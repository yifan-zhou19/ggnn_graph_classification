package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[200];
		int[] b = new int[200];
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
			if (a[i] != 2 && b[i] - a[i] == 1)
			{
				k++;
			}
			else if (a[i] == 2 && b[i] == 0)
			{
				k++;
			}
			else if (b[i] != 2 && a[i] - b[i] == 1)
			{
				k--;
			}
			else if (b[i] == 2 && a[i] == 0)
			{
				k--;
			}
			else if (a[i] == b[i])
			{
				k = k;
			}
		}
		if (k == 0)
		{
			System.out.print("Tie");
		}
		else if (k < 0)
		{
			System.out.print("B");
		}
		else
		{
			System.out.print("A");
		}
		return 0;
	}

}


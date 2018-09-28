package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[MAX];
		int[] b = new int[MAX];
		int i;
		int j;
		int k;
		k = 0;
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
			j = a[i] - b[i];
			if (j == -1 || j == 2)
			{
				k++;
			}
			else if (j == 1 || j == -2)
			{
				k--;
			}
			else if (j == 0)
			{
				k = k;
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
		else if (k < 0)
		{
			System.out.print("B");
		}
		return 0;
	}
}


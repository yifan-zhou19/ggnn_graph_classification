package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int[] a = new int[200];
		int[] b = new int[200];
		int m = 0;
		int n = 0;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(a[i]) = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(b[i]) = Integer.parseInt(tempVar3);
			}
			if (a[i] == 0 && b[i] == 1)
			{
				m++;
			}
			else if (a[i] == 0 && b[i] == 2)
			{
				n++;
			}
			else if (a[i] == 1 && b[i] == 0)
			{
				n++;
			}
			else if (a[i] == 1 && b[i] == 2)
			{
				m++;
			}
			else if (a[i] == 2 && b[i] == 1)
			{
				n++;
			}
			else if (a[i] == 2 && b[i] == 0)
			{
				m++;
			}
		}
		if (m == n)
		{
			System.out.print("Tie");
		}
		else if (m > n)
		{
			System.out.print("A");
		}
		else if (m < n)
		{
				System.out.print("B");
		}
		return 0;
	}


}


package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int num;
		int[] a = new int[200];
		int[] b = new int[200];
		int m = 0;
		int n = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = Integer.parseInt(tempVar);
		}
		for (i = 0;i < num;i++)
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
				m++;
				n++;
			}
			else if ((a[i] == 0 && b[i] == 1) || (a[i] == 1 && b[i] == 2) || (a[i] == 2 && b[i] == 0))
			{
				m++;
			}
			else if ((b[i] == 0 && a[i] == 1) || (b[i] == 1 && a[i] == 2) || (b[i] == 2 && a[i] == 0))
			{
				n++;
			}
		}
		if (m > n)
		{
			System.out.print("A");
		}
		else if (m < n)
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


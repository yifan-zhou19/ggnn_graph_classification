package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[200];
		int[] b = new int[200];
		int c = 0;
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
			if (a[i] - b[i] == 1 || a[i] - b[i] == -2)
			{
				c++;
			}
			if (a[i] - b[i] == -1 || a[i] - b[i] == 2)
			{
				c--;
			}
		}
		if (c == 0)
		{
			System.out.print("Tie");
		}
		if (c > 0)
		{
			System.out.print("B");
		}
		if (c < 0)
		{
			System.out.print("A");
		}



		return 0;
	}

}


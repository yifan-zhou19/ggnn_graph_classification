package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int aa = 0;
		int bb = 0;
		int[] a = new int[200];
		int[] b = new int[200];
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
			if (a[i] == 0)
			{
				if (b[i] == 1)
				{
					aa += 1;
				}
				else if (b[i] == 2)
				{
					bb += 1;
				}
			}
			else if (a[i] == 1)
			{
				if (b[i] == 0)
				{
					bb += 1;
				}
				else if (b[i] == 2)
				{
					aa += 1;
				}
			}
			else if (a[i] == 2)
			{
				if (b[i] == 0)
				{
					aa += 1;
				}
				else if (b[i] == 1)
				{
					bb += 1;
				}
			}
		}
		if (aa > bb)
		{
			System.out.print("A");
		}
		else if (aa < bb)
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


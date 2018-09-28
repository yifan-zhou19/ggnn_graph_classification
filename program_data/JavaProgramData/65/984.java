package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int awin;
		int bwin;
		int n;
		int[] a = new int[220];
		int[] b = new int[220];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		awin = 0;
		bwin = 0;
		for (i = 1;i <= n;i++)
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
			if (a[i] == 0 && b[i] == 2)
			{
				bwin++;
			}
			else
			{
				if (a[i] == 2 && b[i] == 0)
				{
					awin++;
				}
				else
				{
					if (a[i] > b[i])
					{
						bwin++;
					}
					else
					{
						if (b[i] > a[i])
						{
							awin++;
						}
						else
						{
							continue;
						}
					}
				}
			}
		}
		if (awin > bwin)
		{
			System.out.print("A");
		}
		else
		{
			if (bwin > awin)
			{
				System.out.print("B");
			}
			else
			{
				System.out.print("Tie");
			}
		}
		return 0;
	}
}


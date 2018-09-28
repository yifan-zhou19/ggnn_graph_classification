package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int i;
		int n;
		int[] a = new int[200];
		int[] b = new int[200];
		int[] c = new int[200];
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
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				c[i] = Integer.parseInt(tempVar4);
			}
			if ((a[i] % 4 == 0 && a[i] % 100 != 0) || (a[i] % 400 == 0))
			{
				if ((b[i] == 1 && c[i] == 4) || (b[i] == 4 && c[i] == 1) || (b[i] == 1 && c[i] == 7) || (b[i] == 7 && c[i] == 1) || (b[i] == 2 && c[i] == 8) || (b[i] == 8 && c[i] == 2) || (b[i] == 3 && c[i] == 11) || (b[i] == 11 && c[i] == 3) || (b[i] == 4 && c[i] == 7) || (b[i] == 7 && c[i] == 4) || (b[i] == 9 && c[i] == 12) || (b[i] == 12 && c[i] == 9))
				{
					System.out.print("YES\n");
				}
				else
				{
				System.out.print("NO\n");
				}
			}
			else
			{
				if ((b[i] == 1 && c[i] == 10) || (b[i] == 10 && c[i] == 1) || (b[i] == 2 && c[i] == 3) || (b[i] == 3 && c[i] == 2) || (b[i] == 2 && c[i] == 11) || (b[i] == 11 && c[i] == 2) || (b[i] == 3 && c[i] == 11) || (b[i] == 11 && c[i] == 3) || (b[i] == 4 && c[i] == 7) || (b[i] == 7 && c[i] == 4) || (b[i] == 9 && c[i] == 12) || (b[i] == 12 && c[i] == 9))
				{
					System.out.print("YES\n");
				}
				else
				{
					System.out.print("NO\n");
				}
			}
		}
	}


}


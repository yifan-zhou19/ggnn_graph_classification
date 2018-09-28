package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int[] a = new int[100];
		int[] b = new int[13];
		b[0] = 0;
		b[1] = 31;
		b[2] = 59;
		b[3] = 90;
		b[4] = 120;
		b[5] = 151;
		b[6] = 181;
		b[7] = 212;
		b[8] = 243;
		b[9] = 273;
		b[10] = 304;
		b[11] = 334;
		b[12] = 365;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[0] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[1] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				a[2] = Integer.parseInt(tempVar4);
			}
			if ((a[0] % 4 == 0 && a[0] % 100 != 0) || (a[0] % 400 == 0))
			{
				if (a[1] > 2 && a[2] > 2 && (b[a[1] - 1] - b[a[2] - 1]) % 7 == 0)
				{
					System.out.print("YES\n");
				}
				else if (a[1] < 3 && a[2] < 3 && (b[a[1] - 1] - b[a[2] - 1]) % 7 == 0)
				{
					System.out.print("YES\n");
				}
				else if (a[1] < 3 && a[2]>2 && (b[a[2] - 1] - b[a[1] - 1] + 1) % 7 == 0)
				{
					System.out.print("YES\n");
				}
				else if (a[2] < 3 && a[1]>2 && (b[a[1] - 1] - b[a[2] - 1] + 1) % 7 == 0)
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
				 if ((b[a[1] - 1] - b[a[2] - 1]) % 7 == 0)
				 {
					System.out.print("YES\n");
				 }
				else
				{
					System.out.print("NO\n");
				}
			}

		}
		return 0;
	}
}


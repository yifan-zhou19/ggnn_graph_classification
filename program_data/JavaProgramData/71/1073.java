package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int l;
		int a;
		int[] b = new int[13];
		int[] c = new int[13];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (k = 1;k <= n;k++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				i = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				j = Integer.parseInt(tempVar4);
			}
			if (i > j)
			{
				l = i;
				i = j;
				j = l;
			}
			if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0)
			{
				b[1] = c[1] = 0;
				b[2] = c[2] = 31;
				b[3] = c[3] = 60;
				b[4] = c[4] = 91;
				b[5] = c[5] = 121;
				b[6] = c[6] = 152;
				b[7] = c[7] = 182;
				b[8] = c[8] = 213;
				b[9] = c[9] = 244;
				b[10] = c[10] = 274;
				b[11] = c[11] = 305;
				b[12] = c[12] = 335;
				if ((c[j] - b[i]) % 7 == 0)
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
				b[1] = c[1] = 0;
				b[2] = c[2] = 31;
				b[3] = c[3] = 59;
				b[4] = c[4] = 90;
				b[5] = c[5] = 120;
				b[6] = c[6] = 151;
				b[7] = c[7] = 181;
				b[8] = c[8] = 212;
				b[9] = c[9] = 243;
				b[10] = c[10] = 273;
				b[11] = c[11] = 304;
				b[12] = c[12] = 334;
				if ((c[j] - b[i]) % 7 == 0)
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


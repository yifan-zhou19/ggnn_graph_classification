package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int x;
		int z;
		int t;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] y = new int[n];
		int[] m1 = new int[n];
		int[] m2 = new int[n];
		for (i = 0;i < n;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				y[i] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m1[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				m2[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			x = y[i] % 4;
			z = y[i] % 400;
			t = y[i] % 100;

			if (x != 0 || (t == 0 && z != 0))
			{
				if ((m1[i] == 2 && m2[i] == 3) || (m1[i] == 3 && m2[i] == 2) || (m1[i] == 4 && m2[i] == 7) || (m1[i] == 7 && m2[i] == 4) || (m1[i] == 9 && m2[i] == 12) || (m1[i] == 12 && m2[i] == 9) || (m1[i] == 1 && m2[i] == 10) || (m1[i] == 10 && m2[i] == 1) || (m1[i] == 3 && m2[i] == 11) || (m1[i] == 11 && m2[i] == 3) || (m1[i] == 2 && m2[i] == 11) || (m1[i] == 11 && m2[i] == 2))
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
		if ((m1[i] == 1 && m2[i] == 4) || (m1[i] == 4 && m2[i] == 1) || (m1[i] == 4 && m2[i] == 7) || (m1[i] == 7 && m2[i] == 4) || (m1[i] == 9 && m2[i] == 12) || (m1[i] == 12 && m2[i] == 9) || (m1[i] == 1 && m2[i] == 7) || (m1[i] == 7 && m2[i] == 1) || (m1[i] == 2 && m2[i] == 8) || (m1[i] == 8 && m2[i] == 2) || (m1[i] == 3 && m2[i] == 11) || (m1[i] == 11 && m2[i] == 3))
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


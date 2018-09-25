package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] y = new int[200];
		int m1;
		int m2;
		int i;
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
				y[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				m1 = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				m2 = Integer.parseInt(tempVar4);
			}
			if (m1 > m2)
			{
				int t;
				t = m1;
				m1 = m2;
				m2 = t;
			}
		if ((y[i] % 4 == 0 && y[i] % 100 != 0) || (y[i] % 100 == 0 && y[i] % 400 == 0))
		{
		   if ((m1 == 1 && m2 == 4) || (m1 == 1 && m2 == 7) || (m1 == 2 && m2 == 8) || (m1 == 3 && m2 == 11) || (m1 == 4 && m2 == 7) || (m1 == 9 && m2 == 12))
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
		   if ((m1 == 1 && m2 == 10) || (m1 == 2 && m2 == 3) || (m1 == 2 && m2 == 11) || (m1 == 3 && m2 == 11) || (m1 == 4 && m2 == 7) || (m1 == 9 && m2 == 12))
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


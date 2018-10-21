package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n; //c????
		int[] year = new int[200];
		int[] m1 = new int[200];
		int[] m2 = new int[200];
		int i;
		int j;


		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			int c1 = 1;
			int c2 = 1;
			int[] days = {0, 31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				year[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				m1[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				m2[i] = Integer.parseInt(tempVar4);
			}
			if ((year[i] % 4 == 0) && (year[i] % 100 != 0) || (year[i] % 400 == 0))
			{
				 days[2] += 29;
			}
			else
			{
				days[2] += 28;
			}

			for (j = 0;j < m1[i];j++)
			{
				c1 = c1 + days[j];
			}
			for (j = 0;j < m2[i];j++)
			{
				c2 = c2 + days[j];
			}

			if ((c2 - c1) % 7 == 0)
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


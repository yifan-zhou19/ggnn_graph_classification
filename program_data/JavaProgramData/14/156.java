public class score
{
	public int ID;
	public int chinese;
	public int math;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int[] sum;
		int max;
		int p = 0;
		//struct score s[100000];
		score[] s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		s = tangible.Arrays.initializeWithDefaultscoreInstances(n);
		sum = new int[n];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s[i].ID = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				s[i].chinese = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				s[i].math = Integer.parseInt(tempVar4);
			}
		}
		for (i = 0;i < n;i++)
		{
			sum[i] = s[i].chinese + s[i].math;
		}
		max = sum[0];
		for (i = 0;i < n;i++)
		{
			if (max < sum[i])
			{
				max = sum[i];
				p = i;
			}
		}
		System.out.printf("%d %d\n",s[p].ID,sum[p]);
		if (n > 1)
		{
			max = sum[0];
			sum[p] = 0;
			p = 0;
			for (i = 0;i < n;i++)
			{
				if (max < sum[i])
				{
					max = sum[i];
					p = i;
				}
			}
			 System.out.printf("%d %d\n",s[p].ID,sum[p]);
			if (n > 2)
			{
				max = sum[0];
				sum[p] = 0;
				p = 0;
				for (i = 0;i < n;i++)
				{
					if (max < sum[i])
					{
						max = sum[i];
						p = i;
					}
				}
				System.out.printf("%d %d\n",s[p].ID,sum[p]);
			}
		}
	}
}


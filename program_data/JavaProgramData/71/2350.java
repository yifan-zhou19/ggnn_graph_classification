package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int i;
		int j;
		int n;
		int y;
		int m1;
		int m2;
		int t;
		int sum = 0;
		int[] a = new int[N];
		//int md[]={31,28,31,30,31,30,31,31,30,31,30,31};
		int[] md = new int[N];
		md[1] = 28;
		md[2] = 31;
		md[3] = 30;
		md[4] = 31;
		md[5] = 30;
		md[6] = 31;
		md[7] = 31;
		md[8] = 30;
		md[9] = 31;
		md[10] = 30;
		md[11] = 31;
		md[0] = 31;
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
				y = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				m1 = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				m2 = Integer.parseInt(tempVar4);
			}
			if (m1 == m2)
			{
				System.out.print("YES\n");
				continue;
			}
			if (m1 > m2)
			{
				t = m1;
				m1 = m2;
				m2 = t;
			}
		//	printf("%d %d\n",m1,m2);
			for (j = m1 - 1;j <= m2 - 2;j++)
			{
				sum += md[j];
			}
		//	printf("%d\n",sum);
			if (((y % 4 == 0) && (y % 100 != 0) || (y % 400 == 0)) && (((m1 == 1) && (m2 >= 3)) || m1 == 2))
			{
				sum++;
			}
		//	printf("%d\n",sum);
			if (sum % 7 == 0)
			{
				a[i] = 1;
			}
			else
			{
				a[i] = 0;
			}
			sum = 0;
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] == 1)
			{
				System.out.print("YES\n");
			}
			else if (a[i] == 0)
			{
				System.out.print("NO\n");
			}

		}
	}

}


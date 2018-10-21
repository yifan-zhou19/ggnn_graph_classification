package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] a = new int[300];
		int i;
		int m;
		int j;
		int s;
		int[] p1 = a;
		int[] p2 = a;
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
		}
		System.out.printf("%d",p1[0]);
		for (p1 = a + 1;p1 < a + n;p1++)
		{
			s = 0;
			for (p2 = a;p2 < p1;p2++)
			{
			m = p1 - p2[0];
			if (m != 0)
			{
				s++;
			}
			}
			if (s == p1 - a)
			{
					System.out.printf(",%d",p1[0]);
			}
		}
	}

}


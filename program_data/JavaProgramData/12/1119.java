package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[15];
		int t;
		int s;
		int i;
		int j;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		while (t != -1)
		{
			s = 0;
			n = 0;
			a[s] = t;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				t = Integer.parseInt(tempVar2);
			}
			while (t != 0)
			{
				s++;
				a[s] = t;
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					t = Integer.parseInt(tempVar3);
				}
			}
			i = 0;
			for (i;i < s;i++)
			{
				j = i + 1;
				for (j;j <= s;j++)
				{
					if ((a[i] == a[j] * 2) || (a[j] == a[i] * 2))
					{
						n++;
					}
				}
			}
			System.out.printf("%d",n);
			System.out.print("\n");
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				t = Integer.parseInt(tempVar4);
			}
		}
	}

}


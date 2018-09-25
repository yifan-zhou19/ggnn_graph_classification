package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		int i;
		int j;
		int[] s1 = new int[1000];
		int[] s2 = new int[1000];
		for (i = 1;i <= a;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				s1[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 1;i <= b;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				s2[i] = Integer.parseInt(tempVar4);
			}
		}
		for (i = 1;i <= a - 1;i++)
		{
			for (j = 1;j <= a - i;j++)
			{
				if (s1[j] > s1[j + 1])
				{
					int t;
					t = s1[j];
					s1[j] = s1[j + 1];
					s1[j + 1] = t;
				}
			}
		}
		for (i = 1;i <= b - 1;i++)
		{
			for (j = 1;j <= b - i;j++)
			{
				if (s2[j] > s2[j + 1])
				{
					int t;
					t = s2[j];
					s2[j] = s2[j + 1];
					s2[j + 1] = t;
				}
			}
		}
		for (i = 1;i <= a;i++)
		{
			System.out.printf("%d ",s1[i]);
		}
		for (i = 1;i <= b - 1;i++)
		{
			System.out.printf("%d ",s2[i]);
		}
		System.out.printf("%d",s2[b]);
	}


}


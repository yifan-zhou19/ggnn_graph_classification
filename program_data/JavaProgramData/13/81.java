package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int[] s = new int[20001];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (i = 1; i <= n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s[i] = Integer.parseInt(tempVar2);
			}
		}
		System.out.printf("%d", s[1]);
		for (i = 2; i <= n; i++)
		{
			for (j = 1; j < i; j++)
			{
				if (s[i] == s[j])
				{
					s[i] = 0;
					break;
				}; //????????????????????????
			};
		};

		for (i = 2; i <= n; i++)
		{
			if (s[i] != 0)
			{
				System.out.printf(" %d", s[i]); //?????
			}
		};
	}
}


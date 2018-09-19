package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int[] t = new int[20000];
		int a;
		int[] s = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < 100;i++)
		{
			s[i] = 0;
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				t[i] = Integer.parseInt(tempVar2);
			}
			if (s[t[i]] == 0)
			{
				s[t[i]] = 1;
			}
			else if (s[t[i]] == 1)
			{
				t[i] = 101;
			}

		}

		for (i = 0;i < n;i++)
		{
			if (t[i] != 101)
			{
				a = i;
				System.out.printf("%d",t[i]);
				break;
			}
		}

		for (i = a + 1;i < n;i++)
		{
			if (t[i] != 101)
			{
				System.out.printf(" %d",t[i]);
			}

		}
		return 0;
	}
}


package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int k;
		int[] s = new int[300];
		int[] t = new int[300];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.in.read();
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s[i] = Integer.parseInt(tempVar2);
			}
			t[i] = 1;
			for (j = 0;j < i;j++)
			{
				if (s[j] == s[i])
				{
					t[i] = 0;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (t[i] != 0)
			{
			System.out.printf("%d",s[i]);
			}
			k = i;
			break;
		}
		for (i = k + 1;i < n;i++)
		{
			if (t[i] != 0)
			{
			System.out.printf(",%d",s[i]);
			}
		}
	}
}


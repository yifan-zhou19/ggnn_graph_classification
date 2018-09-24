package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int[] s = new int[20000];
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
				s[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < i;j++)
			{
				if (s[j] == s[i])
				{
					s[i] = 0;
				}
			}
		}
			System.out.printf("%d",s[0]);
			for (i = 1;i < n;i++)
			{
				if (s[i] != 0)
				{
					System.out.printf(" %d",s[i]);
				}
			}
			System.out.print("\n");
	}
}


package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] s = new int[300];
		int i;
		int j;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0,j = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s[j] = Integer.parseInt(tempVar2);
			}
			for (k = 0;k < j;k++)
			{
				if (s[k] == s[j])
				{
					j--;
				}
			}
			j++;
		}
		for (i = 0;i < j;i++)
		{
			System.out.printf("%d",s[i]);
			if (i != j - 1)
			{
				System.out.print(",");
			}
		}
		return 0;
	}
}


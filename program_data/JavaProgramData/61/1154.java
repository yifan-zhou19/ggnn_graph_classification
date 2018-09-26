package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[100];
		int[] s = new int[100];
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}

			s[1] = 1;
			s[2] = 1;
			for (j = 3;j <= a[i];j++)
			{
				s[j] = s[j - 1] + s[j - 2];
			}
			s[i] = s[a[i]];
			System.out.printf("%d\n",s[i]);
		}
		return 0;
	}

}


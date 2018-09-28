package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] m = new int[30000];
		int[] n = new int[300];
		int i;
		int k;
		int[] s = new int[3000];
		int j;
		i = 0;
		do
		{
			i++;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n[i] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				m[i] = Integer.parseInt(tempVar2);
			}

		} while (n[i] != 0 && m[i] != 0);
		for (k = 1;k < i;k++)
		{
			s[k] = 0;
		}
		for (k = 1;k < i;k++)
		{
			for (j = 2;j <= n[k];j++)
			{
				s[k] = (s[k] + m[k]) % j;
			}

		}
		for (k = 1;k < i;k++)
		{
			System.out.printf("%d\n",s[k] + 1);
		}
		return 0;
	}
}


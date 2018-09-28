package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] n = new int[100];
		int[] m = new int[100];
		int i;
		int j = 0;
		for (i = 0; i < 100; i++)
		{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					(n[i]) = Integer.parseInt(tempVar);
				}
				String tempVar2 = ConsoleInput.scanfRead(" ");
				if (tempVar2 != null)
				{
					(m[i]) = Integer.parseInt(tempVar2);
				}
				j += 1;
				if (n[i] == 0 && m[i] == 0)
				{
					break;
				}
		}
		int k;
		int[] s = new int[j];
		int l;
		int q;
		for (q = 0; q < j; q++)
		{
			s[q] = 0;
		}
		for (k = 0; k < j; k++)
		{
			for (l = 2; l <= n[k]; l++)
			{
				s[k] = (s[k] + m[k]) % l;
			}
		}
		int p;
		for (p = 0; p < j - 1; p++)
		{
			System.out.printf("%d\n", s[p] + 1);
		}
		return 0;
	}
}


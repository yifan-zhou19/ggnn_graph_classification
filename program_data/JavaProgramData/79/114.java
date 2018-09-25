package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] n = new int[15];
		int[] m = new int[15];
		int i;
		for (i = 1;;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n[i] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m[i] = Integer.parseInt(tempVar2);
			}
			if (n[i] == 0 && m[i] == 0)
			{
				break;
			}
		}
		int j;
		int k;
		int f;
		for (j = 1;j < i;j++)
		{
			f = 0;
			for (k = 1;k <= n[j];k++)
			{
				f = (f + m[j]) % k;
			}
			System.out.printf("%d\n",f + 1);
		}

	}
}


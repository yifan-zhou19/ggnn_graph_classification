package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] n = new int[p];
		int[] m = new int[p];
		int i;
		for (i = 0;i < p;i++)
		{
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
			if (n[i] == 0 && m[i] == 0)
			{
				break;
			}
		}
		 for (i = 0;m[i] != 0 && n[i] != 0;i++)
		 {
			int j;
			int k = 0;
			for (j = 2;j <= n[i];j++)
			{
				k = ((m[i] % j) + k) % j;
			}
			if (n[i] == 0 && m[i] == 0)
			{
				break;
			}
			System.out.printf("%d\n",k + 1);

		 }
		return 0;
	}
}


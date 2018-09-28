package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int a = 0;
		int[] m = new int[100];
		int[] n = new int[100];

		for (i = 0;;i++)
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
			a++;
		}
		for (i = 0;i < a;i++)
		{
			k = 0;
			for (j = 2;j <= n[i];j++)
			{
				k = ((m[i] % j) + k) % j;
			}
			System.out.printf("%d\n",k + 1);
		}

		return 0;
	}

}


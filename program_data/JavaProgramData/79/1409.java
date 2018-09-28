package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int[] n = new int[100];
		int[] m = new int[100];
		int i;
		int t = 0;
		int j;

		for (i = 0;i <= 100;i++)
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
			t++;
			if (n[i] == 0 && m[i] == 0)
			{
				break;
			}
		}
		for (i = 0;i < t - 1;i++)
		{
			int[] a = new int[300];
			for (j = 0;j < n[i];j++)
			{
				a[j] = j + 1;
			}
			int nPtr = 0;
			for (j = 0;j < n[i];j++)
			{
				int nCount = 0;
				while (nCount < m[i])
				{
					while (a[nPtr] == 0)
					{
						nPtr = (nPtr + 1) % n[i];
					}
					nCount++;
					nPtr = (nPtr + 1) % n[i];
				}
				nPtr--;
				if (nPtr < 0)
				{
					nPtr = n[i] - 1;
				}
				if (j == n[i] - 1)
				{
					System.out.printf("%d\n",a[nPtr]);
				}
				a[nPtr] = 0;
			}

		}

		return 0;

	}
}


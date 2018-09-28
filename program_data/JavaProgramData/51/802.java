package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int p;
		int l;
		int temp;
		int[] sum = new int[600];
		int[] real = new int[600];
		int[][] realreal = new int[600][3];
		String s = new String(new char[600]);
		final String a = "";
		final String b = "";
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s = tempVar2.charAt(0);
		}
		l = s.length();
		for (i = 0;i <= 599;i++)
		{
			sum[i] = 1;
		}
		for (i = 0;i <= l - n;i++)
		{
			for (j = 0;j <= n - 1;j++)
			{
				a.charAt(i)[j] = s.charAt(i + j);
			}
		}
		for (i = 1;i <= l - n;i++)
		{
			for (j = 0;j <= i - 1;j++)
			{
					if (strcmp(a.charAt(i),a.charAt(j)) == 0)
					{
						sum[i]++;
					}
			}
		}
		k = 0;
		real[0] = sum[l - n];
		for (i = 0;i <= n - 1;i++)
		{
			b.charAt(0)[i] = a.charAt(l - n)[i];
		}
		for (i = l - n - 1;i >= 0;i--)
		{
			for (j = l - n;j >= i + 1;j--)
			{
				if (strcmp(a.charAt(i),a.charAt(j)) == 0)
				{
					break;
				}
			}
			if (j == i)
			{
				k++;
				real[k] = sum[i];
				for (p = 0;p <= n - 1;p++)
				{
					b.charAt(k)[p] = a.charAt(i)[p];
				}
			}
		}
		for (i = 0;i <= k;i++)
		{
			realreal[i][0] = real[i];
			realreal[i][1] = i;
		}
		if (k == 0)
		{
			System.out.printf("%d\n",l - n + 1);
			for (i = 0;i <= n - 1;i++)
			{
				System.out.printf("%c",a.charAt(0)[i]);
			}
				System.out.print("\n");
		}
		else
		{
		for (i = 0;i <= k - 1;i++)
		{
			for (j = i + 1;j <= k;j++)
			{
				if (realreal[i][0] < realreal[j][0])
				{
					temp = realreal[i][0];
					realreal[i][0] = realreal[j][0];
					realreal[j][0] = temp;
					temp = realreal[i][1];
					realreal[i][1] = realreal[j][1];
					realreal[j][1] = temp;
				}
			}
		}
		if (realreal[0][0] == 1)
		{
			System.out.print("NO");
		}
		else
		{
			for (i = 1;i <= k;i++)
			{
				if (realreal[i][0] != realreal[0][0])
				{
					break;
				}
			}
			System.out.printf("%d\n",realreal[0][0]);
			for (p = 0;p <= i - 1;p++)
			{
				for (j = 0;j <= l - n;j++)
				{
					if (strcmp(b.charAt(realreal[p][1]),a.charAt(j)) == 0)
					{
						realreal[p][2] = j;
						break;
					}
				}
			}
			if (i >= 2)
			{
			for (p = 0;p <= i - 2;p++)
			{
				for (j = p + 1;j <= i - 1;j++)
				{
					if (realreal[p][2] > realreal[j][2])
					{
						temp = realreal[p][2];
						realreal[p][2] = realreal[j][2];
						realreal[j][2] = temp;
						temp = realreal[p][1];
						realreal[p][1] = realreal[j][1];
						realreal[j][1] = temp;
					}
				}
			}
			}
			for (p = 0;p <= i - 1;p++)
			{
				for (j = 0;j <= n - 1;j++)
				{
					System.out.printf("%c",a.charAt(realreal[p][2])[j]);
				}
					System.out.print("\n");
			}
		}
		}
		return 0;
	}
}


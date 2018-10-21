package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[600]);
		char[][] b =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		int n;
		int i;
		int j;
		int k = 0;
		int max = 0;
		int len;
		int[] c = new int[600];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = new Scanner(System.in).nextLine();
		len = a.length();
		for (i = 0;i <= len - n;i++)
		{
			for (j = i;j < i + n;j++)
			{
				b[k][j - i] = a.charAt(j);
			}
			k++;
		}
		for (j = 0;j < k;j++)
		{
			for (i = j;i < k;i++)
			{
				if (!strcmp(b[i],b[j]))
				{
					c[j]++;
				}
			}
			if (c[j] > max)
			{
				max = c[j];
			}
		}
		if (max > 1)
		{
			System.out.printf("%d\n",max);
			for (i = 0;i < k;i++)
			{
			if (c[i] == max)
			{
				System.out.println(b[i]);
			}
			}
		}
		else
		{
			System.out.print("NO");
		}
		return 0;
	}
}


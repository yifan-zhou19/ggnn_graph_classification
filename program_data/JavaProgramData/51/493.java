package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int len;
		int j;
		int max = 1;
		int[] b = new int[500];
		String a = new String(new char[500]);
		char[][] c =
		{
			{0, '\0', '\0', '\0', '\0'}
		};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.in.read();
		a = new Scanner(System.in).nextLine();
		len = a.length();
		for (i = 0;i <= len - n;i++)
		{
			b[i] = 1;
			for (j = 0;j < n;j++)
			{
				c[i][j] = a.charAt(i + j);
			}
		}

		for (i = 0;i <= len - n;i++)
		{
			for (j = i + 1;j <= len - n;j++)
			{
				if (strcmp(c[j],c[i]) == 0)
				{
					b[i] += 1;
					b[j] = 0;
				}
			}
		}

		for (i = 0;i <= len - n;i++)
		{
			if (b[i] > max)
			{
				max = b[i];
			}
		}
		if (max == 1)
		{
			System.out.print("NO");
		}
		else
		{
			System.out.printf("%d\n",max);
			for (i = 0;i <= len - n;i++)
			{
				if (b[i] == max)
				{
					System.out.printf("%s\n",c[i]);
				}
			}
		}
		return 0;
	}

}


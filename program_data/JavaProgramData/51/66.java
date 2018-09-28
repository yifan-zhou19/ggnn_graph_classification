package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String z = new String(new char[500]);
		char[][] gram = new char[500][6];
		int n;
		int i;
		int j;
		int[] js = new int[500];
		int len;
		int max = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			z = tempVar2.charAt(0);
		}
		len = z.length();
		for (i = 0;i < len - n + 1;i++)
		{
			for (j = 0;j < n;j++)
			{
				gram[i][j] = z.charAt(i + j);
			}
			for (j = n;j < 6;j++)
			{
				gram[i][j] = 0;
			}
		}
		for (i = 0;i < len - n + 1;i++)
		{
			js[i] = 0;
		}
		for (i = 0;i < len - n;i++)
		{
			for (j = i;j < len - n + 1;j++)
			{
				if (strcmp(gram[i],gram[j]) == 0)
				{
					js[i]++;
				}
			}
			if (js[i] > max)
			{
				max = js[i];
			}
		}
		if (max == 1)
		{
			System.out.print("NO");
		}
		else
		{
			System.out.printf("%d\n",max);
			for (i = 0;i < len - n + 1;i++)
			{

				if (js[i] == max)
				{
					for (j = 0;j < n;j++)
					{
						System.out.printf("%c",gram[i][j]);
					}
					System.out.print("\n");
				}
			}
		}
		return 0;
	}

}


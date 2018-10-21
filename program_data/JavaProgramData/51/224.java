package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[500]);
		char[][] w =
		{
			{0, '\0', '\0', '\0', '\0'}
		};
		int n;
		int i;
		int j;
		int l;
		int max = -1;
		int[] no = new int[500];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		s = new Scanner(System.in).nextLine();
		l = s.length();
		for (i = 0;i < l - n + 1;i++)
		{
			for (j = 0;j < n;j++)
			{
			w[i][j] = s.charAt(i + j);
			}
		}
		for (i = 0;i < l - n;i++)
		{
			for (j = i + 1;j < l - n + 1;j++)
			{
				if (strcmp(w[i],w[j]) == 0)
				{
				no[i]++;
				if (no[i] > max)
				{
					max = no[i];
				}
				}
			}
		}
				if (max == -1)
				{
					System.out.print("NO");
				}
				else
				{
					System.out.printf("%d\n",max + 1);
				for (i = 0;i < l - n + 1;i++)
				{
					if (no[i] == max)
					{
						System.out.printf("%s\n",w[i]);
					}
				}
				}
		return 0;
	}

}


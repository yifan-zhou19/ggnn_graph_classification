package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		System.in.read();
		String str = new String(new char[550]);
		str = new Scanner(System.in).nextLine();
		int strl = str.length();
		char[][] strm = new char[550][10];
		int[] strn = new int[550];
		for (int i = 0;i <= strl - N;i++)
		{
			for (int j = 0;j < N;j++)
			{
				strm[i][j] = str.charAt(i + j);
			}
			strm[i][N] = '\0';
		}
		int max = 0;
		for (int i = 0;i <= strl - N;i++)
		{
			for (int j = i;j <= strl - N;j++)
			{
				if (strcmp(strm[i],strm[j]) == 0)
				{
					strn[i]++;
				}
			}
			if (max < strn[i])
			{
				max = strn[i];
			}
		}
		if (max == 1)
		{
			System.out.print("NO");
			return 0;
		}
		System.out.printf("%d\n",max);
		for (int i = 0;i <= strl - N;i++)
		{
			if (max == strn[i])
			{
				System.out.println(strm[i]);
			}
		}
		return 0;
	}
}


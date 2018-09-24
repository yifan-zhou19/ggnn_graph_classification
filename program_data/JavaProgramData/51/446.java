package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[501]);
		char[][] str1 = new char[501][5];
		String str2 = new String(new char[501]);
		int n;
		int i;
		int a;
		int b;
		int c;
		int d;
		int e;
		int l;
		int j;
		int k;
		int[] js = new int[501];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		str = new Scanner(System.in).nextLine();
		l = str.length();
		for (i = 0;i < l - n + 1;i++)
		{
			js[i] = 1;
			for (j = 0;j < n;j++)
			{
				str1[i][j] = str.charAt(i + j);
			}
		}
		for (i = 0;i < l - n + 1;i++)
		{
			str1[i][n] = '\0';
		}
		for (i = 0;i < l - n;i++)
		{
			for (j = i + 1;j < l - n + 1;j++)
			{
				if (strcmp(str1[i],str1[j]) == 0)
				{
				js[i]++;
				}
			}
		}
		for (i = 0;i < l - n;i++)
		{
			for (j = 0;j < l - n - i;j++)
			{
				if (js[j] < js[j + 1])
				{
					k = js[j];
					js[j] = js[j + 1];
					js[j + 1] = k;
					str2 = str1[j];
					str1[j] = str1[j + 1];
					str1[j + 1] = str2;
				}
			}
		}
		if (js[0] == 1)
		{
			System.out.print("NO\n");
		}
		else
		{
		System.out.printf("%d\n",js[0]);
		for (i = 0;i < l - n + 1;i++)
		{
			if (js[i] == js[0])
			{
				System.out.println(str1[i]);
			}
		}
		}





	}
}


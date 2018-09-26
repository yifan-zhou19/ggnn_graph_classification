package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int maxflag;
		int max;
		int[] flag = new int[500];
		char[][] ch = new char[500][500];
		String str = new String(new char[500]);
		int i;
		int j;
		int l;
		int n;
		for (i = 0;i < 500;i++)
		{
			flag[i] = 1;
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.in.read();
		str = new Scanner(System.in).nextLine();
		l = str.length();
		for (i = 0;i <= l - n;i++)
		{
			for (j = i;j < i + n;j++)
			{
				ch[i][j - i] = str.charAt(j);
			}
		}
		maxflag = 0;
		int[] count = new int[500];
		for (i = 0;i <= l - n;i++)
		{
			count[i] = 0;
			if (flag[i] != 0)
			{
				for (j = 0;j <= l - n;j++)
				{
					if (strcmp(ch[i],ch[j]) == 0 && i != j)
					{
						count[i]++;
						flag[j] = 0;
					}
				}
			}
			count[i]++;
			if (count[i] > maxflag)
			{
				maxflag = count[i];
			}
		}
		if (maxflag != 1)
		{
			System.out.printf("%d\n",maxflag);
			for (i = 0;i <= l - n;i++)
			{
				if (count[i] == maxflag && flag[i] != 0)
				{
					System.out.printf("%s\n",ch[i]);
				}
			}
		}
		else
		{
			System.out.print("NO");
		}
	}

}


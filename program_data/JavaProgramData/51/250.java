package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int len;
		int m;
		int count;
		int[] c = new int[300];
		int max;
		String s = new String(new char[501]);
		char[][] t = new char[300][5];
		String p;
		String temp = new String(new char[501]);
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 300;j++)
			{
				t[j][i] = '\0';
			}
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		s = new Scanner(System.in).nextLine();
		temp = s;
		//puts(temp);
		len = s.length();
		for (i = 0;i <= len - n;i++)
		{
			j = 0;
			m = i;
			for (count = 0;count < n;count++)
			{
				t[i][j++] = s.charAt(m++);
			}
		}
		for (i = 0;i < len - n;i++)
		{
			for (j = i + 1;j <= len - n;j++)
			{
				if (strcmp(t[i],t[j]) == 0)
				{
					c[i]++;
				}
			}
		}
		max = c[0];
		for (i = 0;i <= len - n;i++)
		{
				if (c[i] > max)
				{
					max = c[i];
				}
		}
		if (max == 0)
		{
			System.out.print("NO\n");
			return 0;
		}
		System.out.printf("%d\n",max + 1);
		for (i = 0;i <= len - n;i++)
		{
			if (c[i] == max)
			{
				System.out.printf("%s\n",t[i]);
			}
		}
		//printf("%s\n",t[2]);
		return 0;
	}

}


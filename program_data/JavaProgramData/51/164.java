package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[500]);
		char[][] b = new char[500][6];
		int i;
		int j;
		int[] t = new int[500];
		int n;
		int max;
		int l;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		l = a.length();
		for (i = 0;i < l + 1 - n;i++)
		{
			for (j = 0;j < n;j++)
			{
				b[i][j] = a.charAt(i + j);
			}
			b[i][j] = '\0';
			t[i] = 1;
		}
		for (i = 0;i < l + 1 - n;i++)
		{
			for (j = i + 1;j < l + 1 - n;j++)
			{
				if (strcmp(b[i],b[j]) == 0)
				{
					t[i] = t[i] + 1;
				}
			}
		}
		max = t[0];
		for (i = 0;i < l + 1 - n;i++)
		{
			if (t[i] >= max)
			{
				max = t[i];
			}
		}
		if (max == 1)
		{
			System.out.print("NO\n");
		}
		else
		{
			System.out.printf("%d\n",max);
			for (i = 0;i < l + 1 - n;i++)
			{
				if (t[i] == max)
				{
					System.out.printf("%s\n",b[i]);
				}
			}
		}
	}

}


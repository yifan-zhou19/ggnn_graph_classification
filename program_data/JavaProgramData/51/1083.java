package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int l;
		int t = 0;
		int[] c = new int[500];
		int max = 0;
		int z = 0;
		String a = new String(new char[1000]);
		char[][] b = new char[500][6];
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
		for (int i = 0;i < l;i++)
		{
		for (int j = i;j - i < n;j++)
		{
				b[i][j - i] = a.charAt(j);
		}
		}
		for (int i = 0;i < l;i++)
		{
		for (int j = 0;j + i < l;j++)
		{
				for (int k = 0;k < n;k++)
				{
				if (b[i][k] == b[i + j][k])
				{
					t++;
				}
				if (t == n)
				{
					c[i]++;
				}
				}
				t = 0;
		}
		}
		for (int i = 0;i < l;i++)
		{
			if (c[i] > max)
			{
				max = c[i];
			}
		}
		if (max == 0 || max == 1)
		{
			System.out.print("NO");
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			goto end;
		}
		else
		{
			System.out.printf("%d\n",max);
		}
			for (int i = 0;i < l;i++)
			{
				if (max == c[i])
				{
				for (int j = 0;j < n;j++)
				{
				System.out.printf("%c",b[i][j]);
				}
				}
				System.out.print("\n");
			}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	end:
	return 0;
	}

}


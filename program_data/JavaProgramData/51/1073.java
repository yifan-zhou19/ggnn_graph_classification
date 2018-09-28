package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[502]);
		char[][] p = new char[502][7];
		int len;
		int n;
		int[] re = new int[502];
		int max = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(re,0,(Integer.SIZE / Byte.SIZE));
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
		len = a.length();
		for (int i = 0;i < len - n + 1;i++)
		{
				for (int j = 0;j < n;j++)
				{
					p[i][j] = a.charAt(i + j);
				}
				p[i][n] = 0;
		}
		for (int i = 0;i < len - n;i++)
		{
		for (int j = i + 1;j < len - n + 1;j++)
		{
		if (strcmp(p[i][0], p[j][0]) == 0)
		{
		re[i]++;
		}
		}
		}
		for (int i = 0;i < len - n + 1;i++)
		{
		if (re[i] > max)
		{
		max = re[i];
		}
		}
		if (0 == max)
		{
			System.out.print("NO");
			return 0;
		}
		System.out.printf("%d\n",max + 1);
		for (int i = 0;i < len - n + 1;i++)
		{
		if (re[i] == max)
		{
			System.out.printf("%s\n", p[i][0]);
		}
		}
		return 0;
	}

}


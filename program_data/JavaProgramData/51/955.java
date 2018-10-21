package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int length;
		String str = new String(new char[500]);
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			str = tempVar2.charAt(0);
		}
		char[][] son = new char[500][5];
		length = str.length();
		int i;
		int j;
		for (i = 0;i < length - n + 1;i++)
		{
			for (j = 0;j < n;j++)
			{
				son[i][j] = str.charAt(i + j);
			}
			son[i][n] = '\0';
		}
		int numson = length - n + 1;
		int[] number = new int[500];
		for (i = 0;i < numson;i++)
		{
			if (!strcmp(son[0],son[i]))
			{
				number[0]++;
			}
		}
		for (i = 1;i < numson;i++)
		{
			for (j = 0;j < i;j++)
			{
				if (!strcmp(son[i],son[j]))
				{
					continue;
				}
			}
			for (j = i;j < numson;j++)
			{
				if (!strcmp(son[i],son[j]))
				{
					number[i]++;
				}
			}
		}
		int max = 0;
		for (i = 0;i < numson;i++)
		{
			if (number[i] > max)
			{
				max = number[i];
			}
		}
		if (max == 1)
		{
			System.out.print("NO\n");
		}
		else
		{
			System.out.printf("%d\n",max);
			for (i = 0;i < numson;i++)
			{
				if (number[i] == max)
				{
					System.out.printf("%s\n",son[i]);
				}
			}
		}
	}

}


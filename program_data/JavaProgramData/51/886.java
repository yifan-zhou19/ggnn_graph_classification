package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String s = new String(new char[505]);
		String temp = new String(new char[6]);
		char[][] an = new char[505][6];
		int[] bn = new int[505];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s = tempVar2.charAt(0);
		}
		int len = s.length();
		int count = 1;
		int i;
		int j;
		for (i = 0;i < n;i++)
		{
			an[0][i] = s.charAt(i);
		}
		an[0][n] = '\0';
		bn[0] = 1;
		for (i = 1;i <= len - n;i++)
		{
			for (j = i;j < i + n;j++)
			{
				temp = tangible.StringFunctions.changeCharacter(temp, j - i, s.charAt(j));
			}
			temp = tangible.StringFunctions.changeCharacter(temp, n, '\0');
			int k = 0;
			while (k < count && strcmp(temp,an[k]) != 0)
			{
				k++;
			}
			if (k == count)
			{
				an[count] = temp;
				bn[count] = 1;
				count++;
			}
			else
			{
				bn[k]++;
			}
		}
		int max = 1;
		for (i = 0;i < count;i++)
		{
			if (bn[i] > max)
			{
				max = bn[i];
			}
		}
		if (max == 1)
		{
			System.out.print("NO");
		}
		else
		{
			System.out.printf("%d\n",max);
			for (i = 0;i < count;i++)
			{
				if (bn[i] == max)
				{
					System.out.printf("%s\n",an[i]);
				}
			}
		}
		return 0;
	}
}


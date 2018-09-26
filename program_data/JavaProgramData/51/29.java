package <missing>;

public class GlobalMembers
{
	public static int com(String str1, String str2)
	{
		int i;
		int n;
		int l = str1.length();
		for (i = 0;i < l;i++)
		{
			if (!str1[i].equals(str2[i]))
			{
				return 0;
			}
		}
		return 1;
	}
	public static void Main()
	{
		int i;
		int j;
		int n;
		int l;
		int k = 1;
		int[] nu = new int[800];
		int m = 1;
		int max = 0;
		String x = new String(new char[800]);
		char[][] p = new char[800][7];
		String tmp = new String(new char[7]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			x = tempVar2.charAt(0);
		}
		l = x.length();
		for (i = 0;i < n;i++)
		{
			p[0][i] = x.charAt(i);
		}
		 nu[0]++;
		for (i = 1;i < l - n + 1;i++)
		{
			for (j = 0;j < n;j++)
			{
				tmp = tangible.StringFunctions.changeCharacter(tmp, j, x.charAt(i + j));
			}
			for (j = 0;j < k;j++)
			{
				if (com(tmp, p[j]) != 0)
				{
				nu[j]++;
				m = 0;
				break;
				}
			}
			if (m == 1)
			{
				p[j] = tmp;
				k++;
				nu[j]++;
			}
			m = 1;
		}
		for (i = 0;i < k;i++)
		{
			if (nu[i] > max)
			{
				max = nu[i];
			}
		}
			if (max == 1)
			{
				System.out.print("NO");
			}
			else
			{
				System.out.printf("%d\n",max);
		for (i = 0;i < k;i++)
		{
			if (nu[i] == max)
			{
				System.out.printf("%s\n",p[i]);
			}
		}
			}
	}
}


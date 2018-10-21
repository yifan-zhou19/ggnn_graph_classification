package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] str = new char[3][256];
		String string = new String(new char[512]);
		int n;
		int m;
		int k;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str[0] = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			str[1] = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			str[2] = tempVar3.charAt(0);
		}
		n = String.valueOf(str[0]).length();
		m = String.valueOf(str[1]).length();
		k = String.valueOf(str[2]).length();
		for (j = 0;j < n - m + 1;j++)
		{
		for (i = 0;i < m;i++)
		{
			if (str[1][i] != str[0][i + j])
			{
				break;
			}
		}
		if (i == m)
		{
			break;
		}
		}
		if (j < n - m + 1)
		{
		for (i = 0;i < j;i++)
		{
			String[i] = str[0][i];
		}
		for (i = j;i < j + k;i++)
		{
			String[i] = str[2][i - j];
		}
		for (i = j + k;str[0][i - k + m] != '\0';i++)
		{
			String[i] = str[0][i - k + m];
		}
		String[i] = '\0';
		System.out.printf("%s",String);
		}
		else
		{
			System.out.printf("%s",str[0]);
		}
	}
}


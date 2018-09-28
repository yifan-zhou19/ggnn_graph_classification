package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int t = 0;
		int flag = 0;
		int l;
		float x;
		char[][] str = new char[2][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Float.parseFloat(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			str[0] = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			str[1] = tempVar3.charAt(0);
		}
		if (String.valueOf(str[0]).length() != String.valueOf(str[1]).length())
		{
			flag = 1;
		}
		else
		{
			l = String.valueOf(str[0]).length();
		for (i = 0;i < l;i++)
		{
			if ((str[0][i] != 'A' && str[0][i] != 'T' && str[0][i] != 'C' && str[0][i] != 'G') || (str[1][i] != 'A' && str[1][i] != 'T' && str[1][i] != 'C' && str[1][i] != 'G'))
			{
				flag = 1;
				break;
			}
			else if (str[0][i] == str[1][i])
			{
				t++;

			}
		}
		}
		if (flag == 1)
		{
			System.out.print("error");
		}
		else
		{
			if (((float)t / String.valueOf(str[1]).length()) >= x)
			{
				System.out.print("yes");
			}
			else
			{
				System.out.print("no");
			}
		}

		return 0;
	}
}


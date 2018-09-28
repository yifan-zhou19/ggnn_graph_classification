package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] m = new char[100][20];
		int b = 0;
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (i = 0;i < n;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m[i] = tempVar2.charAt(0);
		}
		}

		for (i = 0;i < n;i++)
		{
			for (j = 0;j < String.valueOf(m[i]).length();j++)
			{
			if (m[i][j] > 'z' || m[i][j] < 48)
			{
			b++;
		break;
			}
		else if (m[i][j] > 57 && m[i][j] < 'A')
		{
			b++;
		break;
		}
		else if (m[i][j] > 'Z' && m[i][j] < 'a' && m[i][j] != '_')
		{
			b++;
		break;
		}
		else if (m[i][0] >= 48 && m[i][0] <= 57)
		{
			b++;
		break;
		}
			}
		if (b == 0)
		{
			System.out.print("yes\n");
		continue;
		}
		else
		{
			System.out.print("no\n");
		b = 0;
		 continue;
		}
		}
	return 0;
	}





}


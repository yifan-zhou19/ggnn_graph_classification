package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[500]);
		String t = new String(new char[500]);
		char[][] result = new char[10][500];
		int n;
		int i;
		int j;
		int k;
		int m = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			s = new Scanner(System.in).nextLine();
			t = new Scanner(System.in).nextLine();
			k = s.length() - 1;
			for (j = t.length() - 1;j >= 0;j--)
			{
				if (s.charAt(k) >= t.charAt(j))
				{

					s = tangible.StringFunctions.changeCharacter(s, k, s.charAt(k) - t.charAt(j) + '0');
					k--;
				}
				else if (s.charAt(k) < t.charAt(j))
				{
					s.charAt(k - 1)--;
					s = tangible.StringFunctions.changeCharacter(s, k, s.charAt(k) + 10 - t.charAt(j) + '0');
					k--;
				}
			}
			result[m++] = s;
		if (i != n - 1)
		{
			scanf("\n");
		}
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;result[i][j] != '\0';j++)
			{
				if (result[i][j] != '0')
				{
					break;
				}
			}
			if (result[i][j] == '\0')
			{
				System.out.print("0");
			}
			else
			{
				for (k = j;result[i][k] != '\0';k++)
				{
				System.out.printf("%c",result[i][k]);
				}
			}
			System.out.print("\n");
		}
	}
}


package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int l;
		int i;
		int j;
		char[][] a = new char[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			int t = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = tempVar2.charAt(0);
			}
			String[] b = {"auto", "break", "case", "char", "const", "continue", "default", "do", "double", "else", "enum", "extern", "float", "for", "goto", "if", "int", "long", "register", "return", "short", "signed", "sizeof", "static", "struct", "switch", "typedef", "union", "unsigned", "void", "volatile", "while"};
			for (j = 0;j < 32;j++)
			{
				if (strcmp(b[j],a[i]) == 0)
				{
					t = -1;
					break;
				}
			}
				if (t == -1)
				{
					System.out.print("no\n");
					continue;
				}
				if ((a[i][0] >= 'A' && a[i][0] <= 'Z') || (a[i][0] >= 'a' && a[i][0] <= 'z') || a[i][0] == '_')
				{
					t = 0;
				}
				else
				{
					t = -1;
					System.out.print("no\n");
					continue;
				}
				l = String.valueOf(a[i]).length();
				j = 1;
				while (j < l)
				{
					if ((a[i][j] >= 'A' && a[i][j] <= 'Z') || (a[i][j] >= 'a' && a[i][j] <= 'z') || (a[i][j] >= '0' && a[i][j] <= '9') || a[i][j] == '_')
					{
						t = 0;
					}
						else
						{
						t = -1;
						break;
						}
						j++;
				}
				if (t == -1)
				{
					System.out.print("no\n");
				}
				if (t == 0)
				{
					System.out.print("yes\n");
				}
		}
	}

}


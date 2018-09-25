package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int k;
		int j;
		int flag;
		String[] key = {"int", "char", "float", "double", "short", "long", "unsigned", "struct", "union", "enum", "auto", "extern", "register", "static", "typedef", "goto", "return", "sizeof", "break", "continue", "if", "else", "do", "while", "for", "switch", "case", "default", "void", "entry", "include", "define", "undef", "ifdef", "ifndef", "endif", "line"};
		String a = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			flag = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			k = a.length();

			if (a.charAt(0) > 122 || (a.charAt(0) > 90 && a.charAt(0) < 97 && a.charAt(0) != 95) || a.charAt(0) < 65)
			{
				flag = 1;
			}


			for (j = 1;j < k;j++)
			{
				if (a.charAt(j) < 48 || a.charAt(j)>122 || (a.charAt(j) > 57 && a.charAt(j) < 65) || (a.charAt(j)>90 && a.charAt(j) < 97 && a.charAt(j) != 95))
				{
					flag = 1;
				}
			}

			for (j = 0;j < 37;j++)
			{
				if (!strcmp(key[j],a))
				{
					flag = 1;
				}
			}

			if (flag == 1)
			{
				System.out.print("no\n");
			}
			else
			{
				System.out.print("yes\n");
			}
		}
	}
}


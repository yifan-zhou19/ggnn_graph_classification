package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int n;
		int m;
		int k;
		char[][] c = new char[100][1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				c[i] = tempVar2.charAt(0);
			}
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 0;j < String.valueOf(c[i]).length();j++)
			{
				if (c[i][0] >= '0' && c[i][0] <= '9')
				{
					System.out.print("no\n");
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					goto loop;
				}
				else if (c[i][j] == '_')
				{
					continue;
				}
				else if (c[i][j] >= 'A' && c[i][j] <= 'Z')
				{
					continue;
				}
				else if (c[i][j] >= 'a' && c[i][j] <= 'z')
				{
					continue;
				}
				else if (c[i][j] >= '0' && c[i][j] <= '9')
				{
					continue;
				}
				else
				{
					System.out.print("no\n");
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					goto loop;
				}
			}
				System.out.print("yes\n");
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			loop:
			;
		}
	}

}


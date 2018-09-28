package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] word = new char[50][51];
		int m;
		int i;
		int c;
		int d;
		int chang = 0;
		int duan = 51;
		int a;
		int j;
		for (m = 0;;m++)
		{
			for (j = 0;;j++)
			{

					String tempVar = ConsoleInput.scanfRead(null, 1);
					if (tempVar != null)
					{
						word[m][j] = tempVar.charAt(0);
					}
					if (word[m][j] == 32)
					{
						break;
					}
					if (word[m][j] == 10)
					{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
						goto loop;
					}
			}


		}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	loop:
	for (i = 0;i <= m;i++)
	{
				a = 0;
				for (j = 0;;j++)
				{
					if (word[i][j] == 32)
					{
						break;
					}
					if (word[i][j] == 10)
					{
						break;
					}
					a++;
				}
				 if (a < duan)
				 {
					duan = a;
					d = i;
				 }
				 if (a > chang)
				 {
					chang = a;
					c = i;
				 }
	}
			for (i = 0;;i++)
			{
				if (word[c][i] == 32 || word[c][i] == 10)
				{
					break;
				}
				System.out.printf("%c",word[c][i]);
			}
			System.out.print("\n");
			for (i = 0;;i++)
			{
				if (word[d][i] == 32 || word[d][i] == 10)
				{
					break;
				}
				 System.out.printf("%c",word[d][i]);
			}
	}
}


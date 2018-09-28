package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		char[][] fj = new char[m][m];
		for (int i = 0;i < m;i++)
		{
				for (int j = 0;j < m;j++)
				{
						fj[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
				}
		}
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int k = 1;k < n;k++)
		{
							char[][] temp = new char[m][m];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memcpy' has no equivalent in Java:
				memcpy(temp,fj,(Character.SIZE / Byte.SIZE));
				for (int i = 0;i < m;i++)
				{
						for (int j = 0;j < m;j++)
						{
								if (fj[i][j] == '@')
								{
												 if (fj[i + 1][j] == '.' && i + 1 < m)
												 {
												 temp[i + 1][j] = '@';
												 }
												 if (fj[i - 1][j] == '.' && i - 1 >= 0)
												 {
												 temp[i - 1][j] = '@';
												 }
												 if (fj[i][j + 1] == '.' && j + 1 < m)
												 {
												 temp[i][j + 1] = '@';
												 }
												 if (fj[i][j - 1] == '.' && j - 1 >= 0)
												 {
												 temp[i][j - 1] = '@';
												 }

								}
						}
				}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memcpy' has no equivalent in Java:
				memcpy(fj,temp,(Character.SIZE / Byte.SIZE));
		}
		int s = 0;
		for (int i = 0;i < m;i++)
		{
				for (int j = 0;j < m;j++)
				{
						if (fj[i][j] == '@')
						{
						s++;
						}
				}
		}
		System.out.print(s);
		System.out.print("\n");

		return 0;
	}



}


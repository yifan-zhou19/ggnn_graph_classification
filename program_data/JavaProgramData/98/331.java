package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int count = 0;
		int len;
		int j;
		int flag = 0;
		char[][] word = new char[2000][2000];
		String p = null;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			word[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			len = String.valueOf(word[i]).length();
			word[i][len] = 0;
		}
		i = 0;
		while (i < n)
		{
			p = word[i];
			j = 0;
			{
				len = 0;
			//	while (*(p+len) != 0) len++;
			len = String.valueOf(word[i]).length();
			//	cout << count << endl;
			//	cout << len << endl;
				if (len > (80 - count))
				{
					System.out.print("\n");
					while (p != 0)
					{
						System.out.print(p);
						p = p.Substring(1);
					}

					i++;
					count = len + 1;
				}
				else
				{
					if (!count == 0)
					{
						System.out.print(" ");
					}
					while (p != 0)
					{
						System.out.print(p);
						p = p.Substring(1);
					}
					count += len;
					count++;
					i++;
				}
			}
		}

		return 0;
	}
}


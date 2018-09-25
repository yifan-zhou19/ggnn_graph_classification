package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			char[][] str = new char[1000][40];
		int i;
		for (i = 0;i < n;i++)
		{
			*(str + i) = ConsoleInput.readToWhiteSpace(true);
		}
		int len;

		for (i = 0;i < n;i++)
		{
			len = 0;
			while (true)
			{
				len += String.valueOf(*(str + i)).length();
				if (len + String.valueOf(*(str + i + 1)).length() + 1 > 80 || i >= n)
				{
					System.out.print((str + i));
					System.out.print("\n");
					break;
				}
				else
				{
					System.out.print((str + i));
					if (len + 1 + String.valueOf(*(str + i + 1)).length() <= 80 && i < n - 1)
					{
						System.out.print(" ");
						len++;
					}
				}
				i++;
			}
			//cout<<endl;
		}
		return 0;
	}
}


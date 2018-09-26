package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String str = new String(new char[100010]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (int i = 1; i <= n; i++)
		{
			int j = 0;
			while ((str[j] = System.in.read()) != '\n')
			{
				j++;
			}
			int k;
			for (k = 0; k < j; k++)
			{
				int l;
				for (l = 0; l < j; l++)
				{
					if (str.charAt(l) == str.charAt(k) && l != k)
					{
						l = -1;
						break;
					}
				}
				if (l != -1)
				{
					System.out.print(str.charAt(k));
					System.out.print("\n");
					k = -1;
					break;
				}
			}
			if (k != -1)
			{
				System.out.print("no\n");
			}
		}
		return 0;
	}
}


package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String string = new String(new char[100]);
		int n = 0;
		int m = 0;
		int len;
		cin.get(String,100,'\n');
		len = String.length();
		while (n < len)
		{
			if (String[n] == ' ')
			{
				if (String[n - 1] == ' ')
				{
					len = len - 1;
					for (int i = n;i < len;i++)
					{
						String[i] = string.charAt(i + 1);
					}
					String[len] = '\0';
					n--;
				}
			}
			n++;
		}
		System.out.print(String);
		System.out.print("\n");
		return 0;
	}
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i = 0;
		int j = 0;
		int l = 0;
		int n = 0;
		char[] str = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		str = new Scanner(System.in).nextLine();
		for (;i < n;i++)
		{
			str = new Scanner(System.in).nextLine();
			l = str.length();
			if (str[0] == '_' || (str[0] >= 'A' && str[0] <= 'Z') || (str[0] >= 'a' && str[0] <= 'z'))
			{
				for (j = 0;j < l;)
				{
					if ((str[j] >= '0' && str[j] <= '9') || (str[j] == '_') || (str[j] >= 'A' && str[j] <= 'Z') || (str[j] >= 'a' && str[j] <= 'z'))
					{
						j++;
					}
					else
					{
						System.out.print("0\n");
						break;
					}
					if (j == l)
					{
						System.out.print("1\n");
						break;
					}
				}
			}
			else
			{
				System.out.print("0\n");
			}
		}
	}

}


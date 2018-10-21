package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i = 1;
		int j;
		int len;
		char[] s = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.in.read();
		for (j = 0;j < n;j++)
		{
		s = new Scanner(System.in).nextLine();
		if (s[0] == '_' || (s[0] >= 'A' && s[0] <= 'Z') || (s[0] >= 'a' && s[0] <= 'z'))
		{
			i = 1;
			while (s[i] != '\0')
			{
				if ((s[i] < '0' || (s[i]>'9' && s[i] < 'A') || (s[i]>'Z' && s[i] < 'a') || s[i]>'z') && s[i] != '_')
				{
					System.out.print("0\n");
					break;
				}
				i++;
			}
			if (s[i] == '\0')
			{
				System.out.print("1\n");
			}
		}
		else
		{
		System.out.print("0\n");
		}
		}
	return 0;
	}


}


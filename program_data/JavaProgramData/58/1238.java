package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String str = new String(new char[100]);
		int flag;
		for (i = 1;i <= n;i++)
		{
			flag = 1;
			str = new Scanner(System.in).nextLine();
			for (j = 0;j < str.length();j++)
			{
			if (!(str.charAt(j) == '_' || (str.charAt(j) >= 'a' && str.charAt(j) <= 'z') || (str.charAt(j) >= 'A' && str.charAt(j) <= 'Z') || (str.charAt(j) >= '0' && str.charAt(j) <= '9')))
			{
				flag = 0;
				break;
			}
			if (j == 0 && (str.charAt(j) >= '0' && str.charAt(j) <= '9'))
			{
				flag = 0;
			}
			}
			System.out.printf("%d\n",flag);
		}
		return 0;
	}
}


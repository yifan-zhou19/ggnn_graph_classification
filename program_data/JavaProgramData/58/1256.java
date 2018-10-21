package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int l;
		int judge;
		String str = new String(new char[81]);
		str = new Scanner(System.in).nextLine();
		n = Integer.parseInt(str);
		for (j = 1;j <= n;j++)
		{
			str = new Scanner(System.in).nextLine();
			l = str.length();
			judge = 1;
			for (i = 0;i < l;i++)
			{
				if (i == 0)
				{
					if (*(str) != '_' && (*(str) > 'Z' || *(str) < 'A') && (*(str)>'z' || *(str) < 'a'))
					{
						judge = 0;
						break;
					}
				}
				else
				{
					if (*(str.Substring(i)) != '_' && (*(str.Substring(i)) > 'Z' || *(str.Substring(i)) < 'A') && (*(str.Substring(i))>'z' || *(str.Substring(i)) < 'a') && (*(str.Substring(i))>'9' || *(str.Substring(i)) < '0'))
					{
						judge = 0;
						break;
					}
				}
			}
			System.out.printf("%d\n",judge);
		}
		return 0;
	}
}

package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int j;
		int flag;
		String str = new String(new char[81]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			flag = 0;
			str = new Scanner(System.in).nextLine();
			if (str.charAt(0) == '_' || str.charAt(0) >= 'a' && str.charAt(0) <= 'z' || str.charAt(0) >= 'A' && str.charAt(0) <= 'Z')
			{
				for (j = 0;str.charAt(j);j++)
				{
					if (str.charAt(j) == '_' || str.charAt(j) >= 'a' && str.charAt(j) <= 'z' || str.charAt(j) >= 'A' && str.charAt(j) <= 'Z' || str.charAt(j) >= '0' && str.charAt(j) <= '9')
					{
						continue;
					}
					else
					{
						flag = 1;
						break;
					}
				}
			}
			else
			{
				flag = 1;
			}
			if (flag == 0)
			{
				System.out.print("1\n");
			}
			else
			{
				System.out.print("0\n");
			}
		}
	}
}


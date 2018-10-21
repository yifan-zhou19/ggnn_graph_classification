package <missing>;

public class GlobalMembers
{
	public static int panduan(char a)
	{
		int result = 0;
		if ((a >= 'a' && a <= 'z') || (a >= 'A' && a <= 'Z') || (a >= '0' && a <= '9') || (a == '_'))
		{
			 result = 1;
		}
		return result;
	}
	public static int first(char b)
	{
		int result = 0;
		if ((b >= 'a' && b <= 'z') || (b >= 'A' && b <= 'Z') || (b == '_'))
		{
			result = 1;
		}
		return result;
	}
	public static void Main(String[] args)
	{
		int i;
		int n;
		int j;
		int len;
		int flag;
		int panduan = char a;
		int first = char b;
		String s = new String(new char[81]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			s = new Scanner(System.in).nextLine();
			len = s.length();
			flag = 1;
			if (first(*s) == 0)
			{
				flag = 0;
			}
			else if (first(*s) == 1)
			{
				for (j = 1;j < len;j++)
				{
					if (panduan(*(s.Substring(j))) == 0)
					{
					flag = 0;
					break;
					}
				}
			}
			if (flag == 1)
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


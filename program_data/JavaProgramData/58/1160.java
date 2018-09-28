package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int len;
		int i;
		int j;
		int flag;
		String str = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.in.read();
		for (i = 0;i < n;i++)
		{
			str = new Scanner(System.in).nextLine();
			len = str.length();
			flag = 1;
			if ((str.charAt(0) >= 65) && (str.charAt(0) <= 90) || (str.charAt(0) >= 97) && (str.charAt(0) <= 122) || (str.charAt(0) == '_'))
			{
				flag *= 1;
			}
			else
			{
				flag *= 0;
			}
			for (j = 1;j < len;j++)
			{
				if ((str.charAt(j) >= 65) && (str.charAt(j) <= 90) || (str.charAt(j) >= 97) && (str.charAt(j) <= 122) || (str.charAt(j) == '_') || (str.charAt(j) >= 48) && (str.charAt(j) <= 57))
				{
					flag *= 1;
				}
				else
				{
					flag *= 0;
					break;
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
		return 0;
	}
}


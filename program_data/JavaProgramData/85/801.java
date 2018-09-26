package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int flag;
		String str = new String(new char[21]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			flag = 1;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				str = tempVar2.charAt(0);
			}
			if (str.charAt(0) <= 64 || str.charAt(0) >= 123 || (str.charAt(0) >= 91 && str.charAt(0) <= 94) || str.charAt(0) == 96)
			{
				System.out.print("no\n");
				flag = 0;
				continue;
			}
			for (j = 1;j < str.length();j++)
			{
				if (str.charAt(j) <= 47 || (str.charAt(j) <= 64 && str.charAt(j) >= 58) || str.charAt(j) >= 123 || (str.charAt(j) >= 91 && str.charAt(j) <= 94) || str.charAt(j) == 96)
				{
					System.out.print("no\n");
					flag = 0;
					break;
				}
			}
			if (flag == 1)
			{
				System.out.print("yes\n");
			}
		}
	}
}


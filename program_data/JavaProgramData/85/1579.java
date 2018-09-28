package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int n;
		int i;
		int j;
		int flag = 0;
		int length = 0;
		String a = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			length = a.length();
			if ('0' <= a.charAt(0) && a.charAt(0) <= '9')
			{
				flag = 1;
			}
			for (j = 0;j < length;j++)
			{
				if ('a' <= a.charAt(j) && a.charAt(j) <= 'z')
				{
					continue;
				}
				else if ('A' <= a.charAt(j) && a.charAt(j) <= 'Z')
				{
					continue;
				}
				else if ('0' <= a.charAt(j) && a.charAt(j) <= '9')
				{
					continue;
				}
				else if (a.charAt(j) == '_')
				{
					continue;
				}
				else
				{
					flag = 1;
				}
			}
			if (flag == 0)
			{
				System.out.print("yes\n");
			}
			else
			{
				System.out.print("no\n");
			}
			flag = 0;
		}
		return 0;
	}


}


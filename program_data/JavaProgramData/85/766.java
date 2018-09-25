package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String input = new String(new char[100]);
			int len;
			int j = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				input = tempVar2.charAt(0);
			}
			len = input.length();
			if (input.charAt(0) == '_' || (input.charAt(0) >= 'a' && input.charAt(0) <= 'z') || (input.charAt(0) >= 'A' && input.charAt(0) <= 'Z'))
			{
				for (j = 1;j < len;j++)
				{
					 if (!(input.charAt(j) == '_' || (input.charAt(j) >= 'a' && input.charAt(j) <= 'z') || (input.charAt(j) >= 'A' && input.charAt(j) <= 'Z') || (input.charAt(j) >= '0' && input.charAt(j) <= '9')))
					 {
						break;
					 }
				}
			}
			if (j == len)
			{
				System.out.print("yes\n");
			}
			else
			{
				System.out.print("no\n");
			}
		}
		return 0;
	}
}


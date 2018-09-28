package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int l;
		int first;
		int result;
		int i;
		int j;
		String id = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			result = 1;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				id = tempVar2.charAt(0);
			}
			l = id.length();
			if ((id.charAt(0) >= 65 && id.charAt(0) <= 90) || (id.charAt(0) >= 97 && id.charAt(0) <= 122) || id.charAt(0) == '_')
			{
				first = 1;
			}
			else
			{
				result = 0;
				first = 0;
			}
			for (j = 1;j < l;j++)
			{
				if (first != 0)
				{
					if ((id.charAt(j) >= 65 && id.charAt(j) <= 90) || (id.charAt(j) >= 97 && id.charAt(j) <= 122) || id.charAt(j) == '_' || (id.charAt(j) >= 48 && id.charAt(j) <= 57))
					{
						;
					}
					else
					{
						result = 0;
						break;
					}
				}
				else
				{
					break;
				}
			}
			if (result != 0)
			{
				System.out.print("yes\n");
			}
			else
			{
				System.out.print("no\n");
			}
		}
	}

}


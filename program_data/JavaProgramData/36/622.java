package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		final String str1 = "";
		final String str2 = "";
		int i;
		int j;
		int len1;
		int len2;
		int flag = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			str2 = tempVar2.charAt(0);
		}
		len1 = str1.length();
		len2 = str2.length();
		if (len1 != len2)
		{
			System.out.print("NO\n");
		}
		else
		{
			for (i = 0;i < len1;i++)
			{
				for (j = 0;j < len1;j++)
				{
					if (str1.charAt(i) == str2.charAt(j))
					{
						str2 = str2.substring(0, j);
						break;
					}
				}
				if (j >= len1)
				{
					flag = 0;
					break;
				}
			}
			if (flag != 0)
			{
				System.out.print("YES\n");
			}
			else
			{
				System.out.print("NO\n");
			}
		}
	}



}


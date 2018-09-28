package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String str1 = new String(new char[50]);
		String str2 = new String(new char[50]);
		int len1;
		int len2;
		int i;
		int j;
		int m = 0;

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
				for (j = 0;j < len2;j++)
				{
					if (str1.charAt(i) == str2.charAt(j) && str2.charAt(j) != 0)
					{
						str2 = str2.substring(0, j);
						m = 1;
						break;
					}
					else
					{
						m = 0;
					}
				}
			}

			if (m != 0)
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


package <missing>;

public class GlobalMembers
{
	public static int compare(String str1, String str2)
	{
		if (strcmp(str1,str2) == 0)
		{
			return 1;
		}
		else
		{
			int len1 = str1.length();
			int len2 = str2.length();
			int k;
			for (k = 0;k <= len1 - 1;k++)
			{
				if (str1[k].equals(str2[len2 - 1]))
				{
					break;
				}
			}

			if (k == len1)
			{
				return 0;
			}
			else
			{
				int i;
				for (i = k;i <= len1 - 2;i++)
				{
					str1[i] = str1[i + 1];
				}

				str1[len1 - 1] = null;
				str2[len2 - 1] = null;

				return compare(str1, str2);
			}
		}
	}

	public static void Main()
	{
		String str1 = new String(new char[100]);
		String str2 = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			str2 = tempVar2.charAt(0);
		}
		if (compare(str1, str2) != 0)
		{
			System.out.print("YES\n");
		}
		else
		{
			System.out.print("NO\n");
		}
	}
}


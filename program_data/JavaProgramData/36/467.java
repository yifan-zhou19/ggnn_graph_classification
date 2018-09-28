package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str1 = new String(new char[300]);
		String str2 = new String(new char[300]);
		int i;
		int len1;
		int len2;
		int flag = 0;
		void rank(char str[300]);
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
		rank(str1);
		rank(str2);
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
				if (str1.charAt(i) != str2.charAt(i))
				{
					flag++;
					break;
				}
			}

		if (flag == 0)
		{
			System.out.print("YES\n");
		}
		else
		{
			System.out.print("NO\n");
		}
		}
	}
	public static void rank(String str)
	{
		char t;
		int i;
		int j;
		int len;
		len = str.length();
		for (i = 0;i < len - 1;i++)
		{
			for (j = i + 1;j < len;j++)
			{
				if (str[i].compareTo(str[j]) < 0)
				{
					t = str[i];
					str[i] = str[j];
					str[j] = t;
				}
			}
		}
	}


}


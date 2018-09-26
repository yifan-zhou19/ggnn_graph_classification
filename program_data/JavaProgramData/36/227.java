package <missing>;

public class GlobalMembers
{
	public static String str1 = new String(new char[1000]);
	public static String str2 = new String(new char[1000]);
	public static void paixu(String a)
	{
		int len = a.length();
		int i;
		int j;
		for (j = 0;j < len - 1;j++)
		{
			for (i = 0;i < len - 1 - j;i++)
			{
				if (a[i].compareTo(a[i + 1]) > 0)
				{
					char temp = a[i + 1];
					a[i + 1] = a[i];
					a[i] = temp;
				}

			}
		}
	}
	public static int Main()
	{
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
		if (str1.length() != str2.length())
		{
			System.out.print("NO\n");
			return 0;
		}
		paixu(str1);
		paixu(str2);
		int len = str1.length();
		int check = 1;
		int i;
		for (i = 0;i < len;i++)
		{
			if (str1.charAt(i) != str2.charAt(i))
			{
				check = 0;
				break;
			}
		}
		if (check == 1)
		{
			System.out.print("YES\n");
		}
		else
		{
		System.out.print("NO\n");
		}



		return 0;
	}

}


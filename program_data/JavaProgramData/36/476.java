package <missing>;

public class GlobalMembers
{
	public static String str1 = new String(new char[100]);
	public static String str2 = new String(new char[100]);
	public static void inverse(tangible.RefObject<String> str)
	{
		int t;
		int flag;
		int i;
		char temp;
		t = str.argValue.length();
		do
		{
			flag = 0;
			for (i = 0;i < t - 1;i++)
			{
				if (str.argValue.charAt(i) < str.argValue.charAt(i + 1))
				{
					temp = str.argValue.charAt(i);
					str.argValue.charAt(i) = str.argValue.charAt(i + 1);
					str.argValue.charAt(i + 1) = temp;
					flag = 1;
				}
			}
			if (flag == 0)
			{
				break;
			}
		}while (t-- != 0);
	}
	public static void Main()
	{
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
	tangible.RefObject<String> tempRef_str1 = new tangible.RefObject<String>(str1);
		inverse(tempRef_str1);
		str1 = tempRef_str1.argValue;
	tangible.RefObject<String> tempRef_str2 = new tangible.RefObject<String>(str2);
		inverse(tempRef_str2);
		str2 = tempRef_str2.argValue;
		if (strcmp(str1,str2) == 0)
		{
			System.out.print("YES");
		}
		else
		{
			System.out.print("NO");
		}
	}
}


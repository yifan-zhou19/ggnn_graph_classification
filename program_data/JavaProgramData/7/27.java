package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String string = new String(new char[256]);
		String substring = new String(new char[256]);
		String replacement = new String(new char[256]);
		String final = new String(new char[500]);
		int i;
		int j;
		int k;
		int length;
		int length1;
		int length2;
		int a;
		int flag = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			String = tempVar;
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			substring = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			replacement = tempVar3.charAt(0);
		}
		length = String.length();
		length1 = substring.length();
		length2 = replacement.length();
		for (i = 0,j = 0; string.charAt(i) != '\0';i++)
		{
			if (String[i] == substring.charAt(j))
			{
				a = i;
				if (String[a + 1] == substring.charAt(j + 1))
				{
					flag = 1;
					break;
				}
			}
		}
		if (flag == 1)
		{
			for (k = 0;k <= a - 1;k++)
			{
				*(final.Substring(k)) = *(string.Substring(k));
			}
			for (k = a;k < a + length2;k++)
			{
				*(final.Substring(k)) = *(replacement.Substring(k) - a);
			}
			for (k = a + length2;k < length + length2 - length1;k++)
			{
				*(final.Substring(k)) = *(string.Substring(k) + length1 - length2);
			}
			*(final.Substring(length) + length2 - length1) = '\0';
			for (k = 0;final.charAt(k) != '\0';k++)
			{
				System.out.printf("%c",final.charAt(k));
			}
		}
		else if (flag == 0)
		{
			for (i = 0,j = 0; string.charAt(i) != '\0';i++)
			{
				System.out.printf("%c",string.charAt(i));
			}
			return 0;
		}
		return 0;
	}
}


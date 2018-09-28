package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String string = new String(new char[256]);
		String substring = new String(new char[256]);
		String replacement = new String(new char[256]);
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
		int length_string = String.length();
		int length_substring = substring.length();
		int length_replacement = replacement.length();
		int i;
		int j;
		int k;
		for (i = 0;i < length_string;i++)
		{
		   for (j = 0;j < length_substring;j++)
		   {
			   if (substring.charAt(j) != string.charAt(i + j))
			   {
					 break;
			   }
		   }
		   if (j == length_substring)
		   {
			   for (k = 0;k < length_substring;k++)
			   {
					  String[i + k] = replacement.charAt(k);
			   }
			   break;
		   }
		}
		System.out.printf("%s\n",String);

	}
}


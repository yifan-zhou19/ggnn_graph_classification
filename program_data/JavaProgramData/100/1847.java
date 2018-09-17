package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	char ch;
	char CH;
	String str = new String(new char[301]);
	int i;
	int len;
	int no = 1;
	int NO = 1;
	int[] counter = new int[26];
	int[] count = new int[26];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		str = tempVar.charAt(0);
	}
	len = str.length();
	for (i = 0; i < len; i++)
	{
	CH = ch = str.charAt(i);
	if (ch >= 'a' && ch <= 'z')
	{
	counter[ch - 'a']++;
	no = 0;
	}
	if (CH >= 'A' && CH <= 'Z')
	{
		count[CH - 'A']++;
		NO++;
	}
	}
	for (CH = 'A';CH <= 'Z';CH++)
	{
	if (count[CH - 'A'] > 0)
	{
		System.out.printf("%c=%d\n",CH,count[CH - 'A']);
	}
	}
	for (ch = 'a'; ch <= 'z'; ch++)
	{
	if (counter[ch - 'a'] > 0)
	{
	System.out.printf("%c=%d\n", ch, counter[ch - 'a']);
	}
	}
	if (no != 0 && NO != 0)
	{
	System.out.print("No");
	}
	return 0;
	}

}


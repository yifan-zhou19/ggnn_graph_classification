package <missing>;

public class GlobalMembers
{
	public static String line = new String(new char[1000000]);
	public static int[] ccount = new int[26];
	public static int Main()
	{
	int n;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	while (n-- != 0)
	{
	line = ConsoleInput.readToWhiteSpace(true).charAt(0);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
	memset((String)ccount,0,26 * (Integer.SIZE / Byte.SIZE));
	int len = line.length();
	int i;
	for (i = 0;i < len;i++)
	{
	ccount[line.charAt(i) - 'a']++;
	}
	for (i = 0;i < len;i++)
	{
	if (ccount[line.charAt(i) - 'a'] == 1)
	{
	System.out.print(line.charAt(i));
	System.out.print("\n");
	break;
	}
	}
	if (i == len)
	{
	System.out.print("no");
	System.out.print("\n");
	}
	}
	return 0;
	}
}


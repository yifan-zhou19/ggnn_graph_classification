package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] count = new int[26];
	int t = 0;
	int j;
	int k = 0;
	char i;
	String str = new String(new char[300]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	char * ps;
	String zf = new String(new char[26]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		str = tempVar.charAt(0);
	}
	for (ps = str; * ps != '\0';ps++)
	{
		if (*ps >= 'a' && *ps <= 'z')
		{
			for (i = 'a';i <= 'z';i++)
			{
				if (i == *ps)
				{
					t = i - 'a';
					zf = tangible.StringFunctions.changeCharacter(zf, t, i);
					count[t]++;
				}
			}
		}
	}
	for (j = 0;j < 26;j++)
	{
		if (count[j] != 0)
		{
			System.out.printf("%c=%d\n",zf.charAt(j),count[j]);
			k += 1;
		}
	}
	if (k == 0)
	{
	System.out.print("No");
	}
	return 0;
	}
}


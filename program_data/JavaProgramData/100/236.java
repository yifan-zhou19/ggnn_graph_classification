package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int j;
	int i;
	int n;
	int f;
	String s = new String(new char[301]);
	String a = new String(new char[26]);
	f = 0;
	for (i = 0;i < 26;i++)
	{
		a = a.substring(0, i);
	}

	for (i = 0;i < 301;i++)
	{
	 String tempVar = ConsoleInput.scanfRead(null, 1);
	 if (tempVar != null)
	 {
		 s = tangible.StringFunctions.changeCharacter(s, i, tempVar);
	 }
	 if (s.charAt(i) == '\n')
	 {
		 n = i;
		 break;
	 }
	}

	for (i = 0;i < n;i++)
	{
	 for (j = 0;j < 26;j++)
	 {
	 if (s.charAt(i) == 97 + j)
	 {
		a.charAt(j)++;
		f = 1;
		break;
	 }
	 }
	}

	if (f != 0)
	{
		for (i = 0;i < 26;i++)
		{
	if (a.charAt(i) != 0)
	{
		System.out.printf("%c=%d\n",97 + i,a.charAt(i));
	}
		}
	}
	else
	{
		System.out.print("No\n");
	}
	}

}


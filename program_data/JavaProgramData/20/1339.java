package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int j;
	int n;
	int mark;
	String s1 = new String(new char[11]);
	String s2 = new String(new char[4]);
	while (scanf("%s%s",s1,s2) != EOF)
	{
	n = s1.length();
	for (i = 0;i < n;i++)
	{
	for (j = 0,mark = 1;j < n;j++)
	{
	if (s1.charAt(i) < s1.charAt(j))
	{
	mark = 0;
	break;
	}
	}
	if (mark != 0)
	{
	for (j = 0;j <= i;j++)
	{
	System.out.printf("%c",s1.charAt(j));
	}
	System.out.printf("%s",s2);
	for (j = i + 1;j < n;j++)
	{
	System.out.printf("%c",s1.charAt(j));
	}
	System.out.print("\n");
	break;
	}
	}
	}
	return 0;
	}

}

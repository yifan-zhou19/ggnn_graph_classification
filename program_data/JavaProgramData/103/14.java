package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String s = new String(new char[1000]);
	int[] a = new int[1000];
	int i;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		s = tempVar.charAt(0);
	}
	for (i = 0;i < s.length();i++)
	{
	if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
	{
	s = tangible.StringFunctions.changeCharacter(s, i, s.charAt(i) - 'a'+'A');
	}
	}
	for (i = 0;i < s.length();i++)
	{
	a[i] = 1;
	}
	for (i = 1;i < s.length();i++)
	{
	if (s.charAt(i) == s.charAt(i - 1))
	{
	a[i] = a[i - 1] + 1;
	}
	}
	for (i = 0;i < s.length();i++)
	{
	if (s.charAt(i) != s.charAt(i + 1))
	{
	System.out.printf("(%c,%d)",s.charAt(i),a[i]);
	}
	}
	}

}


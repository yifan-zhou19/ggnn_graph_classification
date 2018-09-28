package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String a = new String(new char[100]);
	String b = new String(new char[100]);
	int i;
	int j;
	int k;
	for (i = 0;i < 100;i++)
	{
	a = tangible.StringFunctions.changeCharacter(a, i, '\0');
	b = tangible.StringFunctions.changeCharacter(b, i, '\0');
	}
	int[] C = new int[26];
	int[] c = new int[26];
	int[] D = new int[26];
	int[] d = new int[26];
	for (i = 0;i < 26;i++)
	{
	c[i] = 0;
	C[i] = 0;
	d[i] = 0;
	D[i] = 0;
	}
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = tempVar.charAt(0);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		b = tempVar2.charAt(0);
	}
	for (i = 0;i < 100;i++)
	{
	if (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z')
	{
	C[a.charAt(i) - 'A']++;
	}
	if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z')
	{
	c[a.charAt(i) - 'a']++;
	}
	if (b.charAt(i) >= 'A' && b.charAt(i) <= 'Z')
	{
	D[b.charAt(i) - 'A']++;
	}
	if (b.charAt(i) >= 'a' && b.charAt(i) <= 'z')
	{
	d[b.charAt(i) - 'a']++;
	}
	}
	for (i = 0;i < 26;i++)
	{
	if (c[i] != d[i] || C[i] != D[i])
	{
	System.out.print("NO");
	break;
	}
	}
	if (i == 26)
	{
	System.out.print("YES");
	}
	}
}


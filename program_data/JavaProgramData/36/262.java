package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	String a = new String(new char[300]);
	String b = new String(new char[300]);
	int j1;
	int j2;
	int i;
	int k;
	int j;
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
	j1 = a.length();
	j2 = b.length();
	if (j1 != j2)
	{
		System.out.print("NO");
	}
	else
	{
		j = j1;
	for (i = 0;i < j;i++)
	{
	for (k = 0;k < j;k++)
	{
	if (a.charAt(i) == b.charAt(k))
	{
	j1 = i;
	j2 = k;
	a = tangible.StringFunctions.changeCharacter(a, j1, b[j2] = ' ');
	break;
	}
	}
	}
	k = 0;
	for (i = 0;i < j;i++)
	{
	if (a.charAt(i) != ' ')
	{
		k++;
	}
	}
	if (k == 0)
	{
		System.out.print("YES");
	}
	else
	{
		System.out.print("NO");
	}
	}
	}
}


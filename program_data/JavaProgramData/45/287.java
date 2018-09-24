package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	String a = new String(new char[50]);
	String b = new String(new char[50]);
	int i;
	int j;
	int k;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = tempVar.charAt(0);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		b = tempVar2.charAt(0);
	}
	for (i = 0;b.charAt(i) != '\0';i++)
	{
		k = i;
	for (j = 0;a.charAt(j) != '\0' && a.charAt(j) == b.charAt(k);j++, k++)
	{
	;
	}
	if (a.charAt(j) == '\0')
	{
		break;
	}
	}
	System.out.printf("%d",i);
	}
}


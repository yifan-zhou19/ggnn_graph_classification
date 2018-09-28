package <missing>;

public class GlobalMembers
{
	public static void change(String a)
	{
		int i;
		int j;
		int t;
		int x;
	for (i = 0; !a[i].equals('\0');i++)
	{
		t = a[i];
		x = i;
	for (j = i; !a[j].equals('\0');j++)
	{
		if (a[j].compareTo(t) >= 0)
		{
			t = a[j];
			x = j;
		}
	}
	a[x] = a[i];
	a[i] = t;
	}
	}
	public static void Main()
	{
		String a = new String(new char[100]);
	String b = new String(new char[100]);
	int i;
	for (i = 0;i < 0;i++)
	{
		a = tangible.StringFunctions.changeCharacter(a, i, '\0');
		b = tangible.StringFunctions.changeCharacter(b, i, '\0');
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
	change(a);
	change(b);
	for (i = 0;a.charAt(i) != '\0';i++)
	{
		if (a.charAt(i) != b.charAt(i))
		{
			System.out.print("NO");
			break;
		}
	}
	if (a.charAt(i) == '\0')
	{
		System.out.print("YES");
	}
	}

}


package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int k;
	int i;
	int j;
	String a = new String(new char[20]);
	String b = new String(new char[20]);
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
	k = 0;
	for (i = 0;i < a.length();i++)
	{
		for (j = 0;j < 20;j++)
		{
			if (a.charAt(i) == b.charAt(j))
			{
				k = k + 1;
		//	a[i]='0';
			b = tangible.StringFunctions.changeCharacter(b, j, '0');
			break;
			}

		//	if(b[i]==a[j]&&b[i]!='0'&&a[j]!='0')
			//	m=1;
		}
	}
	if (a.length() != b.length())
	{
	System.out.print("NO");
	}
	else
	{
	if (k == a.length())
	{
	System.out.print("YES");
	}
	else
	{
		System.out.print("NO");
	}

	}

	return 0;

	}
}


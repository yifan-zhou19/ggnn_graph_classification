package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int k;
	int[] b = new int[51];
	String a = new String(new char[100]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a = tempVar2.charAt(0);
	}
	b[i] = a.length();
	for (k = 0;k < b[i];k++)
	{
	if (a.charAt(k) == 'e' && a.charAt(k + 1) == 'r' && a.charAt(k + 2) == '\0')
	{
		a = tangible.StringFunctions.changeCharacter(a, k, '\0');
		break;
	}
	else if (a.charAt(k) == 'l' && a.charAt(k + 1) == 'y' && a.charAt(k + 2) == '\0')
	{
		a = tangible.StringFunctions.changeCharacter(a, k, '\0');
		break;
	}
	else if (a.charAt(k) == 'i' && a.charAt(k + 1) == 'n' && a.charAt(k + 2) == 'g' && a.charAt(k + 3) == '\0')
	{
		a = tangible.StringFunctions.changeCharacter(a, k, '\0');
		break;
	}
	}
	System.out.printf("%s\n",a);
	}



	return 0;
	}

}


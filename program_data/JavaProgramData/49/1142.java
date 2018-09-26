package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[505]);
		String b = new String(new char[505]);
		String c = new String(new char[505]);
	int i;
	int j;
	int len;
	int k;
	int e = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = tempVar.charAt(0);
	}
	len = a.length();
	for (i = 2;i <= len;i++)
	{
		for (j = 0;j <= len - i;j++)
		{
		for (k = j;k <= j + i - 1;k++)
		{
		b = tangible.StringFunctions.changeCharacter(b, k - j, a.charAt(k));
		}
	b = tangible.StringFunctions.changeCharacter(b, k - j, '\0');
	for (k = 0;k < i;k++)
	{
		c = tangible.StringFunctions.changeCharacter(c, i - 1 - k, b.charAt(k));
	}
	//e=0;
	  //for(k=0;k<i;k++)
	//{if(c[k]!=b[k])
	  // e=e+1;}
	c = tangible.StringFunctions.changeCharacter(c, i, '\0');
	 // if(e==0)
	if (strcmp(c,b) == 0)
	{
	System.out.printf("%s\n",b);
	}
		}
	}
	return 0;
	}

}


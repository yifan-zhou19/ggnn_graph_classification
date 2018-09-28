package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int a;
	int b;
	int c = 0;
	int k;
	int i;
	String an = new String(new char[100]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	char * p;
	final String bn = "";
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		an = tempVar2.charAt(0);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		b = Integer.parseInt(tempVar3);
	}
	for (p = an; * p != '\0';p++)
	{
	if ((*p >= 'a') && (*p <= 'z'))
	{
	  c = c * a + *p - 87;
	}
	if ((*p >= 'A') && (*p <= 'Z'))
	{
	  c = c * a + *p - 55;
	}
	if ((*p >= '0') && (*p <= '9'))
	{
	  c = c * a + *p - 48;
	}
	}
	for (i = 0;c >= b;i++)
	{
	k = c % b;
	c = c / b;
	if ((k >= 0) && (k < 9))
	{
		bn = tangible.StringFunctions.changeCharacter(bn, i, k + 48);
	}
	else
	{
	bn = tangible.StringFunctions.changeCharacter(bn, i, k + 55);
	}
	}
	if ((c >= 0) && (c < 9))
	{
		bn = tangible.StringFunctions.changeCharacter(bn, i, c + 48);
	}
	else
	{
	bn = tangible.StringFunctions.changeCharacter(bn, i, c + 55);
	}
	for (;i >= 0;i--)
	{
	System.out.printf("%c",bn.charAt(i));
	}
	return 0;
	}
}


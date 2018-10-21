package <missing>;

public class GlobalMembers
{
	public static final int chushu = 13;
	public static int Main()
	{
	String n = new String(new char[101]);
	String shang = new String(new char[100]);
	int a;
	int i;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = tempVar.charAt(0);
	}
	if (n.charAt(1) == '\0')
	{
		System.out.printf("0\n%s",n);
	}
	else if (n.charAt(0) == '1' && n.charAt(1) < '3' && n.charAt(2) == '\0')
	{
		System.out.printf("0\n%s",n);
	}
	else
	{
	  a = n.charAt(0) - '0';
	  a = a * 10 + n.charAt(1) - '0';
	  if (a < 13)
	  {
	  for (i = 1;n.charAt(i + 1) != '\0';i++)
	  {
		  a = a * 10 + n.charAt(i + 1) - '0';
		  shang = tangible.StringFunctions.changeCharacter(shang, i - 1, a / chushu + '0');
		  a = a % chushu;
	  }
	  shang = tangible.StringFunctions.changeCharacter(shang, i - 1, '\0');
	  }
	  else
	  {
	  shang = tangible.StringFunctions.changeCharacter(shang, 0, a / chushu + '0');
	  a = a % chushu;
	  for (i = 1;n.charAt(i + 1) != '\0';i++)
	  {
		  a = a * 10 + n.charAt(i + 1) - '0';
		  shang = tangible.StringFunctions.changeCharacter(shang, i, a / chushu + '0');
		  a = a % chushu;
	  }
	  shang = tangible.StringFunctions.changeCharacter(shang, i, '\0');
	  }
	System.out.printf("%s\n%d",shang,a);
	}
	return 0;
	}
}


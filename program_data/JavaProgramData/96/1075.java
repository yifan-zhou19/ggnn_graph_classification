package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String a = new String(new char[100]);
	int[] b = new int[100];
	int i;
	int j;
	int m;
	int n;
	int l;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = tempVar.charAt(0);
	}
	l = a.length();
	if (a.charAt(0) == '1' && a.charAt(1) < '3')
	{
	 b[0] = 0;
	 b[1] = 0;
	 a = tangible.StringFunctions.changeCharacter(a, 1, 10 + a.charAt(1) - '0'+'0');
	}
	else
	{
	 b[0] = 0;
	 b[1] = ((a.charAt(0) - '0') * 10 + a.charAt(1) - '0') / 13;
	 a = tangible.StringFunctions.changeCharacter(a, 1, (a.charAt(0) - '0') * 10 + a.charAt(1) - '0' - b[1] * 13 + '0');
	}
	for (i = 1;i < l - 1;i++)
	{
	  b[i + 1] = ((a.charAt(i) - '0') * 10 + a.charAt(i + 1) - '0') / 13;
	  a = tangible.StringFunctions.changeCharacter(a, i + 1, (a.charAt(i) - '0') * 10 + a.charAt(i + 1) - '0' - b[i + 1] * 13 + '0');
	}
	if (l >= 3)
	{
		 if (b[1] == 0)
		 {
	   for (i = 2;i < l;i++)
	   {
	  System.out.printf("%d",b[i]);
	   }
		 }
	 else
	 {
	  for (i = 1;i < l;i++)
	  {
	  System.out.printf("%d",b[i]);
	  }
	 }
	}
	else
	{
	  if (l == 1)
	  {
	  System.out.print("0");
	  }
	  else if (l == 2)
	  {
	  if ((a.charAt(0) - '0') * 10 + a.charAt(1) - '0' < 13)
	  {
	   System.out.print("0");
	  }
	  else
	  {
		  System.out.printf("%d",b[1]);
	  }
	  }
	}
	if (a.charAt(l - 1) > '9')
	{
	 System.out.printf("\n1%c",a.charAt(l - 1) - 10);
	}
	else
	{
	  System.out.printf("\n%c",a.charAt(l - 1));
	}

	}

}


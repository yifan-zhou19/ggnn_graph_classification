package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int s = 0;
	int i;
	double a;
	char[][] b = new char[2][1000];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = Double.parseDouble(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		b[0] = tempVar2.charAt(0);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		b[1] = tempVar3.charAt(0);
	}
	if (String.valueOf(b[0]).length() != String.valueOf(b[1]).length())
	{
	   System.out.print("error");

	   return 0;
	}
	for (i = 0;i < String.valueOf(b[0]).length();i++)
	{
	 if (b[0][i] != 'A' && b[0][i] != 'T' && b[0][i] != 'C' && b[0][i] != 'G' && b[1][i] != 'A' && b[1][i] != 'T' && b[1][i] != 'C' && b[1][i] != 'G' && b[0][i] != 'a' && b[0][i] != 't' && b[0][i] != 'c' && b[0][i] != 'g' && b[1][i] != 'a' && b[1][i] != 't' && b[1][i] != 'c' && b[1][i] != 'g')
	 {
	  System.out.print("error");

	  return 0;
	 }
	 if (b[0][i] == b[1][i])
	 {
	  s++;
	 }
	}
	if (s * 1.0 / String.valueOf(b[0]).length() > a)
	{
	 System.out.print("yes");
	}
	else
	{
		System.out.print("no");
	}

	return 0;
	}

}


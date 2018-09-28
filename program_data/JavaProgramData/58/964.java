package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int j;
	int n;
	int l;
	int k = 1;
	String a = new String(new char[81]);
	String s = new String(new char[81]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	s = new Scanner(System.in).nextLine();
	for (i = 0;i < n;i++)
	{

	s = new Scanner(System.in).nextLine(); //?c ?? ???? s ?????
	l = s.length();
	a = tangible.StringFunctions.changeCharacter(a, 0, s.charAt(0));
	if (a.charAt(0) < 65 || (90 < a.charAt(0) && a.charAt(0) < 97 && a.charAt(0) != 95) || a.charAt(0)>122)
	{
	 System.out.print("0\n");
					 //break;
	}
	else //else
	{
						   for (j = 1;j < l;j++)
						   {
											a = tangible.StringFunctions.changeCharacter(a, j, s.charAt(j));
							   if (a.charAt(j) < 48 || (a.charAt(j)>57 && a.charAt(j) < 65) || (a.charAt(j)>90 && a.charAt(j) < 95) || a.charAt(j) == 96 || a.charAt(j)>122)
							   {
								 System.out.print("0\n");
								break;
							   }
						   }
	if (j == l)
	{
	System.out.print("1\n");
	}
	}
	}
	System.in.read();
	System.in.read();
	System.in.read();
	System.in.read();
	System.in.read();
	System.in.read();
	System.in.read();
	System.in.read();
	}


}


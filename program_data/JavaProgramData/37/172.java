package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int t;
	 int l;
	 int a;
	 int b;
	 String string = new String(new char[100001]);
	 int i = 0;
	 int j = 0;
	 int c = 0;
	 int d = 0;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 t = Integer.parseInt(tempVar);
	 }
	 scanf("\n");
	 while (t-- != 0)
	 {
	  String = new Scanner(System.in).nextLine();
	  l = String.length();
	  c = 0;
	for (a = 0;a < l;a++)
	{
	   i = 0;
	   j = 0;
	while (i < l)
	{
		if (String[a] != string.charAt(i) && a != i)
		{
		 j++;
		}
		i++;
	}
	   if (j == l - 1)
	   {
		c = c + 1;
		System.out.printf("%c\n",string.charAt(a));
		break;
	   }
	}
	if (c == 0)
	{
	   System.out.print("no\n");
	}
	 }
	 return 0;
	}


}


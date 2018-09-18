package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[100]);
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		int i;
		int l1;
		int l2;
		int e = 0;
		s = new Scanner(System.in).nextLine();
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
		System.in.read();
		l1 = s.length();
		l2 = a.length();
		for (i = 0;i < l1;i++)
		{
		  if (i == 0)
		  {
			 if (a.charAt(0) == s.charAt(i) && a.charAt(l2 - 1) == s.charAt(i + l2 - 1) && s.charAt(i + l2) == ' ')
			 {
				  System.out.printf("%s", b);
				  i += l2 - 1;
			 }
			 else
			 {
				   System.out.printf("%c", s.charAt(i));

			 }
		  }
		  else
		  {
			  if (a.charAt(0) == s.charAt(i) && a.charAt(l2 - 1) == s.charAt(i + l2 - 1) && s.charAt(i - 1) == ' ')
			  {
				  System.out.printf("%s", b);
				  i += l2 - 1;
			  }
			 else
			 {
				   System.out.printf("%c", s.charAt(i));

			 }
		  }
		}
		System.out.print("\n");
		System.in.read();
		return 0;
	}


}


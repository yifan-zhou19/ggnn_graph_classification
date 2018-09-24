package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1999]);
		int i;
		int t;
		a = new Scanner(System.in).nextLine();
		for (i = 0;a.charAt(i) != '\0';i++)
		{
		   if (a.charAt(i) <= 'z' && a.charAt(i) >= 'a')
		   {
		   a.charAt(i) -= 32;
		   }
		}
		for (i = 0;a.charAt(i) != '\0';i++)
		{
		   if (a.charAt(i + 1) == a.charAt(i))
		   {
			 t = 1;
			 while (a.charAt(i + 1) == a.charAt(i))
			 {
			   t++;
			   i++;
			 }
			 System.out.print("(");
			 System.out.print(a.charAt(i));
			 System.out.print(",");
			 System.out.print(t);
			 System.out.print(")");
		   }
		   else
		   {
		   System.out.print("(");
		   System.out.print(a.charAt(i));
		   System.out.print(",");
		   System.out.print(1);
		   System.out.print(")");
		   }

		}
		int ss;
		ss = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		return 0;
	}

}


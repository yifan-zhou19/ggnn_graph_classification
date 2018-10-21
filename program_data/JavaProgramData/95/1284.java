package <missing>;

public class GlobalMembers
{
	public static void change(String p)
	{
	   int i;
	   int j;
	   for (i = 0; !p[i].equals('\0');i++)
	   {
			if (p[i].compareTo('A') >= 0 && p[i].compareTo('Z') <= 0)
			{
		   p[i] = p[i] - 'A'+'a';
			}
	   }
	}
	public static int Main()
	{
	   String p1 = new String(new char[99]);
	   String p2 = new String(new char[99]);
	   p1 = new Scanner(System.in).nextLine();
	   p2 = new Scanner(System.in).nextLine();
	   change(p1);
	   change(p2);
	   int h = strcmp(p1,p2);
	   if (h < 0)
	   {
		   System.out.print("<");
	   }
	   else if (h == 0)
	   {
		   System.out.print("=");
	   }
	   else if (h > 0)
	   {
		   System.out.print(">");
	   }

	}

}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[90]);
		String b = new String(new char[90]);
	 a = new Scanner(System.in).nextLine();
	 b = new Scanner(System.in).nextLine();
	 void zhuan(char k[90]);
	 zhuan(a);
	 zhuan(b);
	 int i;
	 int j = 0;
	 int m;
	 int n;
	 for (i = 0;(a.charAt(i) != '\0') && (b.charAt(i) != '\0');i++)
	 {
		   if (a.charAt(i) > b.charAt(i))
		   {
			   System.out.print(">");
			   j = 1;
			   break;
		   }
		else if (a.charAt(i) < b.charAt(i))
		{
			System.out.print("<");
			j = 1;
			break;
		}
		else if (a.charAt(i) == b.charAt(i))
		{
			continue;
		}
	 }
	 if (j == 0)
	 {
		 System.out.print("=");
	 }


	}

	public static void zhuan(String k)
	{
		int p;
		 for (p = 0; !k[p].equals('\0');p++)
		 {
		  if ((k[p].compareTo('a') >= 0) && (k[p].compareTo('z') <= 0))
		  {
		   k[p] = k[p] - 'a'+'A';
		  }
		 }
	}

}

package <missing>;

public class GlobalMembers
{
	public static void trans(String a)
	{
		 int i;
		 for (i = 0;i <= a.length() - 1;i++)
		 {
			 if (a[i].compareTo('A') >= 0 && a[i].compareTo('Z') <= 0)
			 {
				a[i] = a[i].Substring(32);
			 }
		 }
	}

	public static void Main(String[] args)
	{
	  String a = new String(new char[80]);
	  String b = new String(new char[80]);
	  a = new Scanner(System.in).nextLine();
	  b = new Scanner(System.in).nextLine();
	  trans(a);
	  trans(b);
	  int i;
	  int j;
	  int flag = 1;
	  for (i = 0, j = 0;i <= a.length() - 1 && j <= b.length() - 1;i++, j++)
	  {
		  if (a.charAt(i) < b.charAt(j))
		  {
			 System.out.print("<");
			 flag = 0;
			 break;
		  }
		  else if (a.charAt(i) > b.charAt(j))
		  {
			   System.out.print(">");
			   flag = 0;
			   break;
		  }
	  }
	  if (flag == 1)
	  {
	  System.out.print("=");
	  }
	}

}

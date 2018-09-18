package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 String a = new String(new char[110]);
		 String b = new String(new char[110]);
		 String c = new String(new char[110]);
		 a = new Scanner(System.in).nextLine();
		 b = new Scanner(System.in).nextLine();
		 c = new Scanner(System.in).nextLine();
		 int x;
		 int y;
		 int z;
		 int flag;
		 x = a.length();
		 y = b.length();
		 z = c.length();

		 for (int i = 0;i < x;i++)
		 {
		  if ((i == 0 && a.charAt(y) == ' ') || (a.charAt(i - 1) == ' ' && (i + y) == x) || (a.charAt(i - 1) == ' ' && a.charAt(i + y) == ' '))
		  {
		  flag = 0;
		  for (int j = 0;j < y;j++)
		  {
			 if (a.charAt(i + j) != b.charAt(j))
			 {
			 flag = 1;
			 break;
			 }
		  }
		 if (flag == 0)
		 {
			 System.out.print(c);
		 i += y - 1;
		 continue;
		 }
		  }
		 System.out.print(a.charAt(i));
		 }

		 return 0;
	}
}

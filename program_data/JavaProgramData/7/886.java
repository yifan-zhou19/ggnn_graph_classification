package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		  int start;
		  int end;
		  int ok;
		  int i;
		  int j;
		  int n;
		  int m;
		  int s;
		  String a = new String(new char[300]);
		  String b = new String(new char[300]);
		  String c = new String(new char[300]);
		  a = new Scanner(System.in).nextLine();
		  b = new Scanner(System.in).nextLine();
		  c = new Scanner(System.in).nextLine();
		  n = a.length();
		  m = b.length();
		  s = c.length();
		  for (i = 0;i < n;i++)
		  {
			  if (a.charAt(i) == b.charAt(0))
			  {
				  ok = 1;
				  for (j = 1;j < m;j++)
				  {
					  if (a.charAt(j + i) != b.charAt(j))
					  {
						  ok = 0;
					  }
				  }
				  if (ok != 0)
				  {
					  start = i;
					  end = j + i;
					  break;
				  }
			  }
		  }
		  if (ok == 1)
		  {
		  for (i = 0;i < start;i++)
		  {
			  System.out.printf("%c",a.charAt(i));
		  }
		  for (i = 0;i < s;i++)
		  {
			  System.out.printf("%c",c.charAt(i));
		  }
		  for (i = end;i < n;i++)
		  {
			  System.out.printf("%c",a.charAt(i));
		  }
		  System.out.print("\n");
		  }
		  else
		  {
			  System.out.println(a);
		  }


	}

}

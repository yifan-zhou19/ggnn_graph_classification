package <missing>;

public class GlobalMembers
{
	public static int c(String a)
	{
		int i;
		int l;
		int z = 0;
		l = a.length();
		for (i = 0;i < l;i++)
		{
						if (a[i].equals('_'))
						{
						z = 0;
						}
						else if (a[i].compareTo('A') >= 0 && a[i].compareTo('Z') <= 0)
						{
						z = 0;
						}
						else if (a[i].compareTo('a') >= 0 && a[i].compareTo('z') <= 0)
						{
						z = 0;
						}
						else if (a[i].compareTo('0') >= 0 && a[i].compareTo('9') <= 0)
						{
						z = 0;
						}
						else
						{
							z = 1;
							break;
						}
		}
						return z;
	}
	public static int Main()
	{
		  String a = new String(new char[8000]);
		  int n;
		  int i;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  a = new Scanner(System.in).nextLine();
		  for (i = 0;i < n;i++)
		  {
						  a = new Scanner(System.in).nextLine();
						  if (c(a) == 1)
						  {
						  System.out.print("0\n");
						  }
						  else if (a.charAt(0) == '_')
						  {
						  System.out.print("1\n");
						  }
						  else if (a.charAt(0) >= 'A' && a.charAt(0) <= 'Z')
						  {
						  System.out.print("1\n");
						  }
						  else if (a.charAt(0) >= 'a' && a.charAt(0) <= 'z')
						  {
						  System.out.print("1\n");
						  }
						  else
						  {
						  System.out.print("0\n");
						  }
		  }
		  System.in.read();
		  System.in.read();
	}

}


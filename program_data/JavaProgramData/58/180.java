package <missing>;

public class GlobalMembers
{
	public static int judge(String a)
	{
		int i;
		int k;
		int l;
		l = a.length();
		for (i = 0;i < l;i++)
		{
						 if (a[i].compareTo('a') >= 0 && a[i].compareTo('z') <= 0)
						 {
						 k = 1;
						 }
						 else if (a[i].compareTo('A') >= 0 && a[i].compareTo('Z') <= 0)
						 {
						 k = 1;
						 }
						 else if (a[i].equals('_'))
						 {
						 k = 1;
						 }
						 else if (a[i].compareTo('0') >= 0 && a[i].compareTo('9') <= 0)
						 {
						 k = 1;
						 }
						 else
						 {
							  k = 0;
							  break;
						 }
		}
		return (k);
	}
	public static int Main()
	{
		  int n;
		  int i;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  System.in.read();
		  char[][] a =
		  {
			  {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		  };
		  for (i = 0;i < n;i++)
		  {
		  a[i] = new Scanner(System.in).nextLine();
		  }
		  for (i = 0;i < n;i++)
		  {
						  if (judge(a[i]) == 1)
						  {
											if (a[i][0] >= 'a' && a[i][0] <= 'z')
											{
											System.out.print("1\n");
											}
											else if (a[i][0] >= 'A' && a[i][0] <= 'Z')
											{
											System.out.print("1\n");
											}
											else if (a[i][0] == '_')
											{
											System.out.print("1\n");
											}
											else
											{
											System.out.print("0\n");
											}
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


package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int i;
		  int j;
		  int t;
		  int c;
		  int l;
		  c = 1;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  String a = new String(new char[100]);
		  for (i = 0;i < n;i++)
		  {
						  String tempVar2 = ConsoleInput.scanfRead();
						  if (tempVar2 != null)
						  {
							  a = tempVar2.charAt(0);
						  }
						  l = a.length();
						  for (j = 0;j < l;j++)
						  {
										  for (t = 0;t < l;t++)
										  {
											 if (a.charAt(t) == a.charAt(j) && t != j)
											 {
											 break;
											 }
											 if (t == l - 1)
											 {
											 System.out.printf("%c\n",a.charAt(j));
											 c = 0;
											 }

										  }
											 if (c == 0)
											 {
											  c = 1;
											  break;
											 }
											 if (j == l - 1)
											 {
											 System.out.print("no\n");
											 }
						  }
		  }
		  System.in.read();
		  System.in.read();
	}
}


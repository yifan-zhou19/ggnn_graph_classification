package <missing>;

public class GlobalMembers
{
	public static int j = 0;
	public static void shuchu(int k)
	{
	  if (k != 0)
	  {
	  System.out.print("yes\n");
	  }
	 else
	 {
	  System.out.print("no\n");
	 }
	}
	public static void decide(String t)
	{
	int de = 0;
	int j = 0;
	 if (t[0].compareTo('9') <= 0 && t[0].compareTo('0') >= 0)
	 {
		de = 0;

	 }
	else
	{
	 while (!t[j].equals('\0'))
	 {
	   if ((t[j].compareTo('9') <= 0 && t[j].compareTo('0') >= 0) || (t[j].compareTo('z') <= 0 && t[j].compareTo('a') >= 0) || (t[j].compareTo('Z') <= 0 && t[j].compareTo('A') >= 0) || (t[j].equals('_')))
	   {
		  de = 1;
	  j++;
	   }
	else
	{
		 de = 0;
	  break;
	}
	 }
	}
	  shuchu(de);

	}


	public static int Main()
	{
	  int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int i;
	char[][] u = new char[100][100];
	for (i = 0;i < n;i++)
	{
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  u[i] = tempVar2.charAt(0);
	  }
	}
	for (i = 0;i < n;i++)
	{
		decide(u[i]);
	}
	return 0;
	}


}


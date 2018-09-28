package <missing>;

public class GlobalMembers
{
	public static void Main()
	{

//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: char *del(char a[15]);
	   char del = char a[15];
	   int n;
	   int i;
	   char[][] s = new char[50][15];
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   for (i = 0;i < n;i++)
	   {
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   s[i] = tempVar2.charAt(0);
	   }

	   }
	   for (i = 0;i < n;i++)
	   {
	   del(s[i]);
	   System.out.printf("%s\n", s[i]);

	   }



	}

	public static String del(String a)
	{

		int b;
		b = a.length();
		if (a[b - 2].equals('e') && a[b - 1].equals('r'))
		{
			a[b - 2] = '\0';
		}
		else if (a[b - 2].equals('l') && a[b - 1].equals('y'))
		{
			a[b - 2] = '\0';
		}
		else if (a[b - 3].equals('i') && a[b - 2].equals('n') && a[b - 1].equals('g'))
		{
			a[b - 3] = '\0';
		}
		  return 0;
	}
}


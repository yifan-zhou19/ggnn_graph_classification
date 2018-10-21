package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int s;
		  int i;
		  int j;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *a;
		  int a;
		  char[][] q = new char[10000][100];
		  String[] p = new String[10000];
		  void test(char p[0]);
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  s = Integer.parseInt(tempVar);
		  }
		  for (i = 1;i <= s;i++)
		  {
			  q[i] = new Scanner(System.in).nextLine();
		  }
		  for (i = 1;i <= s;i++)
		  {
			  p[i] = q[i];
			  test(p[i]);
		  }

	}

	public static void test(tangible.RefObject<String> p)
	{
			  int m = 0;
			  int k = 0;
			  int n;
			  int i;
			  int j;
			  int[] a = new int[100000];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *b;
			  int b;
			  char s;
			  b = a;
			  n = p.argValue.length();
			  for (i = 0;i < n;i++)
			  {
							   for (j = 0;j < n;j++)
							   {
								   if (*(p.argValue.Substring(i)) == *(p.argValue.Substring(j)))
								   {
									   *(b + i) = *(b + i) + 1;
								   }
							   }
			  }


						 for (i = 0; * (b + i) != '\0';i++)
						 {
							 if (*(b + i) == 1)
							 {
								 s = (p.argValue.Substring(i));
								 m = 1;
								 break;
							 }
						 }
						 if (m == 1)
						 {
							 System.out.printf("%c\n",s);
						 }
						 else
						 {
							 System.out.print("no");
						 }

	}

}


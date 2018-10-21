package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String a = new String(new char[1000]);
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  a = tempVar.charAt(0);
		  }
		  char n;
		  int i;
		  int m;
		  int j;
		  m = 1;
		  for (i = 1;i < 1000;i++)
		  {
							 if (a.charAt(i - 1) == '\0')
							 {
								 break;
							 }
							 if (a.charAt(i) == a.charAt(i - 1))
							 {
							 m++;
							 }
							 else if (a.charAt(i) == a.charAt(i - 1) + ('A'-'a'))
							 {
							 m++;
							 }
							 else if (a.charAt(i) == a.charAt(i - 1) - ('A'-'a'))
							 {
							 m++;
							 }
							 else
							 {
								 if ('A' <= a.charAt(i - 1) && a.charAt(i - 1) <= 'Z')
								 {
								 System.out.printf("(%c,%d)",a.charAt(i - 1),m);
								 }
								 else
								 {
									 System.out.printf("(%c,%d)",a.charAt(i - 1) + 'A'-'a',m);
								 }
								 m = 1;
							 }
		  }

	}
}


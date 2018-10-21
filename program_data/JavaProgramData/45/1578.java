package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	  String a = new String(new char[51]);
	  String b = new String(new char[51]);
	  int i;
	  int j;
	  int k;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  a = tempVar.charAt(0);
	  }
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  b = tempVar2.charAt(0);
	  }
	  for (i = 0;i <= b.length() - 1;i++)
	  {
								 if (a.charAt(0) == b.charAt(i))
								 {
								 for (j = 0;j <= a.length() - 1;j++)
								 {
								 if (a.charAt(j) != b.charAt(i + j))
								 {
								 break;
								 }
								 }
								 }
								 if (j == a.length())
								 {
									 System.out.printf("%d",i);
								 break;
								 }
	  }

	}

}


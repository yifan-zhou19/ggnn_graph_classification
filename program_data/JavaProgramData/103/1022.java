package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String a = new String(new char[1010]);
		  char m = 0;
		  int i;
		  int j;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  a = tempVar.charAt(0);
		  }
		  for (i = 0;i < 999;)
		  {
							 for (j = i;j < 999;j++)
							 {
											   if (a.charAt(i) == a.charAt(j) || a.charAt(i) == a.charAt(j) + 'A'-'a' || a.charAt(i) == a.charAt(j) - 'A'+'a')
											   {
											   m++;
											   }
											   else
											   {
											   break;
											   }
							 }
											   if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z')
											   {
											   a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) + 'A'-'a');
											   }
											   System.out.printf("(%c,%d)",a.charAt(i),m);
											   i = i + m;
											   m = 0;
											   if (a.charAt(i) == 0)
											   {
											   break;
											   }
		  }

	}




}


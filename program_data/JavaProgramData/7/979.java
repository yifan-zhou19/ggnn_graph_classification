package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String a = new String(new char[260]);
		  String b = new String(new char[260]);
		  String c = new String(new char[260]);
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
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  c = tempVar3.charAt(0);
		  }
		  for (int i = 0;a.charAt(i) != '\0';i++)
		  {
				  int k = 0;
				  if (a.charAt(i) == b.charAt(0))
				  {
							  k = 1;
							  for (int e = 0;b.charAt(e) != '\0';e++)
							  {
									  if (a.charAt(i + e) != b.charAt(e))
									  {
									  k = 0;
									  }
							  }
							  if (k == 1)
							  {
							  for (int f = 0;b.charAt(f) != '\0';f++)
							  {
									  a = tangible.StringFunctions.changeCharacter(a, i + f, c.charAt(f));
							  }
							  }
				  }
				  if (k == 1)
				  {
				  break;
				  }
		  }
		  System.out.println(a);

	}
}


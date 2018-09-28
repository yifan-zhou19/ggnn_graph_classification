package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int i;
		  int j;
		  int k;
		  int countb;
		  int re;
		  String a = new String(new char[256]);
		  String b = new String(new char[20]);
		  String c = new String(new char[20]);
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
		  for (i = 0;b.charAt(i) != 0;i++)
		  {
			  countb = i;
		  }
		  for (i = 0;a.charAt(i) != '\0';i++)
		  {
				 re = 0;
				 if (a.charAt(i) == b.charAt(0))
				 {
						for (j = i;b.charAt(j - i) != '\0';j++)
						{
							if (a.charAt(j) != b.charAt(j - i))
							{
								break;
							}
						}
						if (j == i + countb + 1)
						{
						   re = 1;
						   for (j = i;j <= i + countb;j++)
						   {
						   a = tangible.StringFunctions.changeCharacter(a, j, c.charAt(j - i));
						   }
						}
				 }
				 else
				 {
					 continue;
				 }
				 if (re == 1)
				 {
				 break;
				 }
		  }
		  System.out.printf("%s",a);
		  System.in.read();
		  System.in.read();
	}

}


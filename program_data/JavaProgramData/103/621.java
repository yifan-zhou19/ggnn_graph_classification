package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 String a = new String(new char[1000]);
		 String b = new String(new char[1000]);
		 int[] c = new int[1000]; //b???? c????????? j???j?
		 int j = 0;
		 b = null;
		 c[1] = 0;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 a = tempVar.charAt(0);
		 }
		 for (int i = 0;;i++)
		 {
			  if (a.charAt(i) == '\0')
			  {
				  System.out.printf("(%c,%d)",b.charAt(j),c[j]);
				   break;
			  }
			  if (a.charAt(i) == b.charAt(j) || a.charAt(i) == b.charAt(j) + 32)
			  {
				  c[j] = c[j] + 1;
			  }
			  else
			  {
			  if (j > 0)
			  {
				  System.out.printf("(%c,%d)",b.charAt(j),c[j]);
			  }
			  j = j + 1;
			  c[j] = 1;
			  if (a.charAt(i) <= 90)
			  {
				  b = tangible.StringFunctions.changeCharacter(b, j, a.charAt(i));
			  }
			  else
			  {
				  b = tangible.StringFunctions.changeCharacter(b, j, a.charAt(i) - 32);
			  }
			  }
		 }

	}

}


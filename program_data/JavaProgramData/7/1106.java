package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	  String w = new String(new char[256]);
	  String s = new String(new char[256]);
	  String r = new String(new char[256]);
	  int i;
	  int j;
	  int a;
	  int b;
	  int t;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  w = tempVar.charAt(0);
		  }
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  s = tempVar2.charAt(0);
		  }
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  r = tempVar3.charAt(0);
		  }
		   b = w.length();
		a = s.length();
		for (i = 0;i < b;i++)
		{
		   if (s.charAt(0) == w.charAt(i))
		   {
			 for (j = 0;j < a;j++)
			 {
				 if (s.charAt(j) != w.charAt(i + j))
				 {
				 break;
				 }
			 }
				 if (j == a)
				 {
			   for (t = 0;t < a;t++)
			   {
				 w = tangible.StringFunctions.changeCharacter(w, i + t, r.charAt(t));
			   }
			   for (t = 0;t < b;t++)
			   {
				   System.out.printf("%c",w.charAt(t));
			   }
			   break;
				 }
		   }
		}
		if (i == b)
		{
		 for (t = 0;t < b;t++)
		 {
		   System.out.printf("%c",w.charAt(t));
		 }

		}

	}


}


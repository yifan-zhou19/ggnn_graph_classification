package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		   String text = new String(new char[100]);
		   final String s = "";
		   String a = new String(new char[20]);
		   String b = new String(new char[20]);
		   int i;
		   int j = 0;
		   int k = 0;
		   int len;
		   text = new Scanner(System.in).nextLine();
		   len = text.length();
		   for (i = 0;i < len;i++)
		   {
			   if (text.charAt(i) != ' ')
			   {
				   s.charAt(j)[k] = text.charAt(i);
				   k = k + 1;
			   }
			   else
			   {
					j = j + 1;
					k = 0;
			   }
		   }
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
		   for (i = 0;i <= j;i++)
		   {
			   if (strcmp(s.charAt(i),a) == 0)
			   {
				   s = tangible.StringFunctions.changeCharacter(s, i, b);
			   }
			   System.out.printf("%s",s.charAt(i));
			   if (i != j)
			   {
				   System.out.print(" ");
			   }
		   }
		   System.out.print("\n");
	}


}


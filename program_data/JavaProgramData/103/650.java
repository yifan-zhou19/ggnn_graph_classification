package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 String in = new String(new char[1000]);
	 int a = 1;
	 int b;
	 int c;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 in = tempVar.charAt(0);
	 }
	 for (int i = 0;in.charAt(i) != '\0';i++)
	 {
			 if (in.charAt(i) >= 'a')
			 {
				 in = tangible.StringFunctions.changeCharacter(in, i, in.charAt(i) - 'a'+'A');
			 }
			 else
			 {
				 in = tangible.StringFunctions.changeCharacter(in, i, in.charAt(i));
			 }
	 }

	 for (int i = 0;in.charAt(i) != '\0';i++)
	 {
	   if (in.charAt(i) == in.charAt(i + 1))
	   {
		a++;
							continue;
	   }
	   else
	   {
		   System.out.printf("(%c,%d)",in.charAt(i),a);
		   a = 1;
	   }
	 }


	  return 0;

	}

}


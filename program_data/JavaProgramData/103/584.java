package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int t;
	 String s = new String(new char[1000]);
	 char last;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 s = tempVar.charAt(0);
	 }
	// printf("%d%d",'a','A');
	 for (i = 0;s.charAt(i) != '\0';i++)
	 {
	   if (s.charAt(i) < 97)
	   {
		   s = tangible.StringFunctions.changeCharacter(s, i, s.charAt(i) + 32);
	   }
	 }
	 last = '!';
	 for (i = 0;s.charAt(i) != '\0';i++)
	 {
		 k = 0;
	   if (s.charAt(i) != last)
	   {
	   last = s.charAt(i);
	   for (j = i;s.charAt(j) == last;j++)
	   {
		  k = k + 1;
	   }

		   System.out.printf("(%c,%d)",s.charAt(i) - 32,k);

	   }
	 }


	 return 0;
	}

}


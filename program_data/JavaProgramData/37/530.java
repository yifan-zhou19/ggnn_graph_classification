package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		int tt;
		int i;
		int j;
		int len;
		int[] letter = new int[26];
		String str = new String(new char[100000]);
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (tt = 1;tt <= t;tt++)
		{
		   str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		   len = str.length();
		   for (i = 0;i <= len - 1;i++)
		   {
			  letter[str.charAt(i) - 'a']++;
		   }
		  for (i = 0;i <= len - 1;i++)
		  {
			if (letter[str.charAt(i) - 'a'] == 1)
			{
			 System.out.print(str.charAt(i));
			 System.out.print("\n");
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			 goto aa;
			}
		  }
		  System.out.print("no");
		  System.out.print("\n");
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	 aa:
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		  memset(letter,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		  memset(str,0,(Character.SIZE / Byte.SIZE));
		}
	return 0;
	}

}


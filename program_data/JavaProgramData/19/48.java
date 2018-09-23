package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 String str1 = new String(new char[100]);
	 String word1 = new String(new char[100]);
	 String word2 = new String(new char[100]);
	 int n = 0;
	 int i;
	 int j;
	 str1 = new Scanner(System.in).nextLine();
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 word1 = tempVar.charAt(0);
	 }
	 String tempVar2 = ConsoleInput.scanfRead(" ");
	 if (tempVar2 != null)
	 {
		 word2 = tempVar2.charAt(0);
	 }
	 for (i = 0;i < (int)(str1.length());i++)
	 {
	  for (j = i;j < i + (int)(word1.length());j++)
	  {
	  if (str1.charAt(j) != word1.charAt(j - i))
	  {
		  break;
	  }
	  n = n + 1;
	  }
	  if (i == 0 && n == (int)(word1.length()))
	  {
		  System.out.printf("%s ",word2);
		  i = i + (int)(word1.length());
	  }
	  else if (n == (int)(word1.length()) && (str1.charAt(i + n) == 32 || str1.charAt(i + n) == '\0') && str1.charAt(i - 1) == 32)
	  {
	  System.out.printf("%s ",word2);
	  i = i + (int)(word1.length());
	  }
	  else
	  {
		  System.out.printf("%c",str1.charAt(i));
	  }
	 n = 0;
	 }
	return 0;
	}
}


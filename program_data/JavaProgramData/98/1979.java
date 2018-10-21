package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 String[] words;
	 int n;
	 int i;
	 int j;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
	 words = (String)malloc(sizeof(String) * n);
	 for (i = 0;i < n;i++)
	 {
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	  words[i] = (String)malloc((Character.SIZE / Byte.SIZE) * 40);
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  words[i] = tempVar2.charAt(0);
	  }
	 }
	 System.out.printf("%s",words[0]);
	 j = String.valueOf(words[0]).length();
	 for (i = 1;i < n;i++)
	 {
	  j++;
	  j += String.valueOf(words[i]).length();
	  if (j <= 80)
	  {
	   System.out.printf(" %s",words[i]);
	  }
	  else
	  {
	   System.out.printf("\n%s",words[i]);
	   j = String.valueOf(words[i]).length();
	  }
	 }
	 for (i = 0;i < n;i++)
	 {
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
	  free(words[i]);
	 }
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
	 free(words);
	 return 0;
	}

}


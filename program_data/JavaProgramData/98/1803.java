package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 int len;
	 int len2;
	 //char word[50];
	 String ans = new String(new char[32768]);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
	 memset(ans,0,(Character.SIZE / Byte.SIZE));
	 ans = ConsoleInput.readToWhiteSpace(true).charAt(0);
	 len = ans.length();
	 len2 = ans.length();
	 //cout<<ans<<endl;
	 //cout<<len;
	 for (int i = 1;i < n;i++)
	 {
		 String word = new String(new char[50]);
	  word = ConsoleInput.readToWhiteSpace(true).charAt(0);
	  if (len + 1 + word.length() > 80)

	  {
	  /* cout<<len<<endl;
	      cout<<len2<<endl;*/
		  ans = tangible.StringFunctions.changeCharacter(ans, len2, '\n');
		  ans += word;
		  len = word.length();
		  len2 = len2 + word.length() + 1;
	  }
	  else
	  {
	   ans = tangible.StringFunctions.changeCharacter(ans, len2, ' ');
	   ans += word;
		len = len + 1 + word.length();
		len2 = len2 + 1 + word.length();
	  }
	 /* len=len+1+strlen(word);*/
	 }
	 //cout<<len<<endl;
	 System.out.print(ans);
	 System.out.print("\n");
	 return 0;
	}
}


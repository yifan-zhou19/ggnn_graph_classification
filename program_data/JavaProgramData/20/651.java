package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int max;
	int i;
	int max_index;
	String str1 = new String(new char[20]);
	String str2 = new String(new char[10]);
	String ans = new String(new char[20]);
	String t = new String(new char[20]);
	while (scanf("%s %s",str1,str2) != EOF)
	{
	  max = 0;
	  for (i = 0;str1.charAt(i);i++)
	  {
	   if (str1.charAt(i) > max)
	   {
		max = str1.charAt(i);
		max_index = i;
	   }
	  }
	   ans = "";
	   strncat(ans,str1,max_index + 1);
	   ans += str2;
	   for (i = max_index + 1;str1.charAt(i);i++)
	   {
		t = tangible.StringFunctions.changeCharacter(t, i - max_index - 1, str1.charAt(i));
	   }
	   t = tangible.StringFunctions.changeCharacter(t, i - max_index - 1, '\0');
	   ans += t;

	  System.out.printf("%s\n",ans);
	}
	return 0;
	}

}


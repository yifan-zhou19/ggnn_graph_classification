package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  String ans1 = new String(new char[100]);
	  String ans2 = new String(new char[100]);
	  String s1 = new String(new char[100]);
	  String s2 = new String(new char[100]);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
	  memset(ans1,0,(Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
	  memset(ans2,0,(Character.SIZE / Byte.SIZE));
	  ans1 = tangible.StringFunctions.changeCharacter(ans1, 0, '\0');
	  ans2 = tangible.StringFunctions.changeCharacter(ans2, 0, '\0');
	  while (scanf("%s",s1) != EOF)
	  {
		int i;
		int j;
		int l = s1.length();
		if (ans1.length() == 0)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memcpy' has no equivalent in Java:
			memcpy(ans1,s1,(Character.SIZE / Byte.SIZE));
		}
		for (i = 0;i < l;i++)
		{
		  if (s1.charAt(i) == ',')
		  {
			s1 = tangible.StringFunctions.changeCharacter(s1, i, '\0');
			for (j = i + 1;j < l;j++)
			{
			  s2 = tangible.StringFunctions.changeCharacter(s2, j - i - 1, s1.charAt(j));
			}
			s2 = tangible.StringFunctions.changeCharacter(s2, l - i - 1, '\0');
			break;
		  }
		}
		l = s1.length();
		if (l < ans1.length())
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memcpy' has no equivalent in Java:
			memcpy(ans1,s1,(Character.SIZE / Byte.SIZE));
		}
		if (l > ans2.length())
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memcpy' has no equivalent in Java:
			memcpy(ans2,s1,(Character.SIZE / Byte.SIZE));
		}
		l = s2.length();
		if (l != 0)
		{
		  if (l < ans1.length())
		  {
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memcpy' has no equivalent in Java:
			  memcpy(ans1,s2,(Character.SIZE / Byte.SIZE));
		  }
		  if (l > ans2.length())
		  {
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memcpy' has no equivalent in Java:
			  memcpy(ans2,s2,(Character.SIZE / Byte.SIZE));
		  }
		}
	  }
	  System.out.printf("%s\n%s\n",ans2,ans1);
	}
}


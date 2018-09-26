package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  String string = new String(new char[260]);
	  String sub = new String(new char[50]);
	  String replace = new String(new char[50]);
	  String result = new String(new char[260]);
	  int i;
	  int j;
	  int t = 0;
	  int mark = 0;
	  int a = 0;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  String = tempVar;
	  }
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  sub = tempVar2.charAt(0);
	  }
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  replace = tempVar3.charAt(0);
	  }
	for (i = 0;string.charAt(i) != '\0';i++,mark++)
	{
		if (String[i] == sub.charAt(0))
		{
			 a = 0;
			 for (t = i,j = 0;sub.charAt(j) != '\0';t++,j++)
			 {
						if (sub.charAt(j) != string.charAt(t))
						{
						   a = 1;
						   break;
						}
			 }
			 if (a == 0)
			 {
				 break;
			 }
		}
	}
	if (mark == String.length())
	{
		System.out.printf("%s\n",String);
	}
	else
	{
		  for (i = 0;i < mark;i++)
		  {
			 result = tangible.StringFunctions.changeCharacter(result, i, string.charAt(i));
		  }
		  for (i = mark,j = 0;j < replace.length();i++,j++)
		  {
			  result = tangible.StringFunctions.changeCharacter(result, i, replace.charAt(j));
		  }
	/*result[i]=0;*/
	/*printf("%s\n", result);*/

		  for (i = mark + j,t = mark + sub.length();string.charAt(t) != '\0';i++,t++)
		  {
			  result = tangible.StringFunctions.changeCharacter(result, i, string.charAt(t));
		  }
		  result = tangible.StringFunctions.changeCharacter(result, i, '\0');
		  System.out.printf("%s\n",result);
	}
	return;
	}
}


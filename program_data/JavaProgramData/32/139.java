package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	   String beijian = new String(new char[200]);
	   String jian = new String(new char[200]);
	   String jian2 = new String(new char[200]);
	   String result = new String(new char[200]);
	   int i = 0;
	   int j = 0;
	   int l1;
	   int l2;
	   int n;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
	   for (j = 0;j < n;j++)
	   {
		  for (i = 0;i < 100;i++)
		  {
		   jian2 = tangible.StringFunctions.changeCharacter(jian2, i, 48);
		   result = tangible.StringFunctions.changeCharacter(result, i, 48);
		  }
	   jian2 = jian2.substring(0, 99);
	   result = result.substring(0, 99);

	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   beijian = tempVar2.charAt(0);
	   }
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  jian = tempVar3.charAt(0);
		  }
		  l1 = beijian.length();
		  l2 = jian.length();
		  if (l1 == l2)
		  {
		  for (i = l1 - 1;i >= 0;i--)
		  {
			 if (beijian.charAt(i) < jian.charAt(i))
			 {
				beijian = tangible.StringFunctions.changeCharacter(beijian, i, beijian.charAt(i) + 10);
				beijian = tangible.StringFunctions.changeCharacter(beijian, i - 1, beijian.charAt(i - 1) - 1);
			 }
			  result = tangible.StringFunctions.changeCharacter(result, i, beijian.charAt(i) - jian.charAt(i) + 48);
		  }
		  result = tangible.StringFunctions.changeCharacter(result, l1, '\0');
		  }
		  else
		  {
			  for (i = l1 - 1;i >= l1 - l2;i--)
			  {
				  jian2 = tangible.StringFunctions.changeCharacter(jian2, i, jian.charAt(i - l1 + l2));
			  }
		   for (i = l1 - 1;i >= 0;i--)
		   {
			  if (beijian.charAt(i) < jian2.charAt(i))
			  {
				beijian = tangible.StringFunctions.changeCharacter(beijian, i, beijian.charAt(i) + 10);
				beijian = tangible.StringFunctions.changeCharacter(beijian, i - 1, beijian.charAt(i - 1) - 1);
			  }
			 result = tangible.StringFunctions.changeCharacter(result, i, beijian.charAt(i) - jian2.charAt(i) + 48);
		   }
		  result = tangible.StringFunctions.changeCharacter(result, l1, '\0');
		  }
		  for (i = 0;i < l1;i++)
		  {
			  if (result.charAt(i) != 0 && result.charAt(i) != 48)
			  {
				  break;
			  }
		  }
		  while (result.charAt(i) != '\0')
		  {
			  System.out.printf("%c",result.charAt(i++));
		  }
		  System.out.print("\n");
	   }
	}

}


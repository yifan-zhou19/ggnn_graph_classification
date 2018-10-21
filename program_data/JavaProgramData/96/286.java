package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  String str = new String(new char[101]);
	  final String result = "0";
	  int i;
	  int tem;
	  int max = 0;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  str = tempVar.charAt(0);
	  }
	  for (i = 1;str.charAt(i) != '\0';i++)
	  {
		if (str.charAt(i - 2) == '1')
		{
			i--;
		}
		if (((str.charAt(i - 1) - '0') * 10 + str.charAt(i) - '0') >= 13 || ((str.charAt(i - 1) - '0') * 10 + str.charAt(i) - '0') == 0)
		{
		  tem = (str.charAt(i - 1) - '0') * 10 + str.charAt(i) - '0';
		}
		else
		{
		  i++;
		  if (result.charAt(i - 2) == '\0')
		  {
			  result = tangible.StringFunctions.changeCharacter(result, i - 2, '0');
		  }
		  tem = (str.charAt(i - 2) - '0') * 100 + (str.charAt(i - 1) - '0') * 10 + str.charAt(i) - '0';
		}
		if (str.charAt(i) != '\0')
		{
			result = tangible.StringFunctions.changeCharacter(result, i - 1, tem / 13 + '0');
		}
		if (str.charAt(i) != '\0')
		{
			str = tangible.StringFunctions.changeCharacter(str, i - 1, (tem % 13) / 10 + '0');
		}
		if (str.charAt(i) != '\0')
		{
			str = tangible.StringFunctions.changeCharacter(str, i, (tem % 13) % 10 + '0');
		}
	  }
	  str = tangible.StringFunctions.changeCharacter(str, i, '\0');
	  //result[i-1]='\0';
	   //printf("%s\n",str);
	  if (result.charAt(0) == '0')
	  {
		if (result.charAt(1) == '\0')
		{
		  System.out.print("0\n");
		}
		else
		{
			System.out.printf("%s\n", result.charAt(1));
		}
	  }
	  else
	  {
		  System.out.printf("%s\n",result);
	  }
	  for (i = 0;str.charAt(i) != '\0';i++)
	  {
		  ;
	  }
	  if (str.charAt(i - 2) != '1')
	  {
		System.out.printf("%d",str.charAt(i - 1) - '0');
	  }
	  else
	  {
		System.out.printf("%d%d",1,str.charAt(i - 1) - '0');
	  }
	  return 0;
	}

}


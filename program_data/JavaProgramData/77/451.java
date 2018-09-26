package <missing>;

public class GlobalMembers
{
	public static void operation(String str)
	{
	  int i;
	  int j;
	  int counter = 0;
	  for (i = 0; !str[i].equals('\0');i++)
	  {
		if (str[i].equals(boy))
		{
	  for (j = i + 1;;j++)
	  {
	if (str[j].equals(boy))
	{
	break;
	}
		if (str[j].equals(girl))
		{
	System.out.print(i);
	System.out.print(" ");
	System.out.print(j);
	System.out.print("\n");
			str[i] = 'e';
			str[j] = 'e';
			counter = 1;
			num++;
	break;
		}
	  }
		}
	if (counter == 0)
	{
	continue;
	}
	else
	{
	break;
	}
	  }
	  if (num < str.length()) //strlen?????????????
	  {
	  operation(str);
	  }
	}
	public static int num = 0;
	public static char boy;
	public static char girl;
	public static int Main()
	{
	  String str = new String(new char[100]); //?50???????????
	  str = ConsoleInput.readToWhiteSpace(true).charAt(0);
	  boy = str.charAt(0);
	  int i;
	  for (i = 0;str.charAt(0) != '\0';i++)
	  {
		if (str.charAt(i) != boy)
		{
	girl = str.charAt(i);
	break;
		}
	  }
	  //cout<<boy<<girl;
	  operation(str);
	  return 0;
	}

}


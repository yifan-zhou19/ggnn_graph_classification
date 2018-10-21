package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  int alphabetic = char;
	  int longest = char[];
	  int shortest = char[];
	  int i;
	  int j;
	  String line = new String(new char[1000]);
	  line = new Scanner(System.in).nextLine();
	  for (i = longest(line);alphabetic(line.charAt(i)) != 0;i++)
	  {
	  System.out.printf("%c",line.charAt(i));
	  }
	  System.out.print("\n");
	  for (j = shortest(line);alphabetic(line.charAt(j)) != 0;j++)
	  {
	  System.out.printf("%c",line.charAt(j));
	  }
	  System.out.print("\n");
	}

	 public static int alphabetic(char c)
	 {

	  if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
	  {
	  return (1);
	  }
	  else
	  {
		  return (0);
	  }
	 }

	 public static int longest(String string)
	 {
	  int len = 0;
	  int length = 0;
	  int flag = 1;
	  int place = 0;
	  int i;
	  int point;
	  for (i = 0;i <= String.length();i++)
	  {
	  if (alphabetic(String[i]) != 0)
	  {
	  if (flag != 0)
	  {
	   point = i;
	   flag = 0;
	  }
	   else
	   {
		   len++;
	   }
	  }
	   else
	   {
		flag = 1;
		if (len > length)
		{
		  length = len;
		  place = point;
		}
		  len = 0;

	   }
	  }
	  return (place);
	 }
	  public static int shortest(String string)
	  {
	   int len = 0;
	   int length = 10;
	   int flag = 1;
	   int place = 0;
	   int i;
	   int point;
	   for (i = 0;i <= String.length();i++)
	   {
	   if (alphabetic(String[i]) != 0)
	   {
	   if (flag != 0)
	   {
		 point = i;
		 flag = 0;
	   }
		else
		{
			len++;
		}
	   }
	   else
	   {
		 flag = 1;
		 if (len < length)
		 {
			 length = len;
			 place = point;

		 }
		 len = 0;
	   }
	   }
	   return (place);
	  }

}

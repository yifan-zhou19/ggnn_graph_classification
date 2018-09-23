package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  String str = new String(new char[1001]);
	  int i;
	  int j = 0;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  str = tempVar.charAt(0);
	  }
	  for (i = 0;str.charAt(i) != '\0';i++)
	  {
		if ((str.charAt(i) == str.charAt(i + 1)) || (str.charAt(i) == str.charAt(i + 1) - 'a'+'A') || (str.charAt(i) == str.charAt(i + 1) + 'a'-'A'))
		{
		  j++;
		}
		else
		{
			  if (str.charAt(i) >= 'Z')
			  {
				  System.out.printf("(%c,%d)",(str.charAt(i) - 'a'+'A'),j + 1);
			  }
			 else
			 {
				 System.out.printf("(%c,%d)",str.charAt(i),j + 1);
			 }
		   j = 0;
		}
	  }
	  return 0;
	}

}


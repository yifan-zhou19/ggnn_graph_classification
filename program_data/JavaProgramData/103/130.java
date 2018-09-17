package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  final String str = "";
		  int i = 0;
		  int count = 0;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  str = tempVar.charAt(0);
		  }
		  char b;

		  for (;str.charAt(i) != '\0';i++)
		  {
			 if (str.charAt(i) <= 'z' && str.charAt(i) >= 'a')
			 {
					 str.charAt(i) += 'A'-'a';
			 }
		  }
		  i = 0;
		  b = str.charAt(0);
		  for (;str.charAt(i) != '\0';i++)
		  {
				if (b == str.charAt(i))
				{
				 count++;
				}
				else
				{
						 System.out.printf("(%c,%d)",b,count);
						 b = str.charAt(i);
						 count = 0;
						 i--;
				}
		  }
		  System.out.printf("(%c,%d)",b,count);


	}


}


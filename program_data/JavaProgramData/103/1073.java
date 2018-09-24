package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String str = new String(new char[1000]);
	int i;
	int j;
	int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		str = tempVar.charAt(0);
	}

	for (i = 0;str.charAt(i) != '\0';i++)
	{
	  if (str.charAt(i) >= 'a')
	  {
	  str.charAt(i) += 'A'-'a';
	  }
	  else
	  {
		  ;
	  }
	}


	n = 1;
	for (i = 0;str.charAt(i) != '\0';i++)
	{

		 if (str.charAt(i) == str.charAt(i + 1))
		 {
		 n++;
		 }
		 else
		 {
			 System.out.printf("(%c,%d)",str.charAt(i),n);
		 n = 1;
		 }


	}
	 return 0;
	}

}


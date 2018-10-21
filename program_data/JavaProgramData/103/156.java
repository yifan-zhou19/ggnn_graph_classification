package <missing>;

public class GlobalMembers
{
	//??(12-5) ??????

	 public static int Main()
	 {
		int i = 0;
		int n = 1;
		String k = new String(new char[1001]); //??????????????
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = tempVar.charAt(0);
		}
		for (i = 0;k.charAt(i) != '\0';i++)
		{
			if ((k.charAt(i) >= 'a') && (k.charAt(i) <= 'z'))
			{
				k = tangible.StringFunctions.changeCharacter(k, i, k.charAt(i) - 'a'+'A'); //??????????????
			}
		}

		for (i = 1;k.charAt(i) != '\0';i++)
		{
		  if (k.charAt(i) == k.charAt(i - 1))
		  {
			  n++;
		  }
		  else
		  {
			  System.out.printf("(%c,%d)",k.charAt(i - 1),n);
			  n = 1;
		  }

		}
		 System.out.printf("(%c,%d)",k.charAt(i - 1),n);
		return 0;
	 }
}


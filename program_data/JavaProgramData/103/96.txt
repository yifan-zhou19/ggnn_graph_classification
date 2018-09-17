package <missing>;

public class GlobalMembers
{
	//?? - ????


	public static int Main()
	{
		String a = new String(new char[1101]);
		int n;
		int count = 0;
		char b;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		n = a.length();
		for (i = 0;i < n;i++)
		{
						if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z')
						{
						a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 'a'+'A');
						}
		}

			  b = a.charAt(0);
			  count++;
			  if (n == 1)
			  {
				  System.out.printf("(%c,%d)",b,count);
			  }
			  else
			  {
			  for (j = 1;j < n;j++)
			  {
							  if (a.charAt(j) == b)
							  {
							  count++;
							  if (j == n - 1)
							  {
							  System.out.printf("(%c,%d)",a.charAt(j),count);
							  }
							  }
							  else
							  {

								  System.out.printf("(%c,%d)",a.charAt(j - 1),count);
								  count = 1;
								  b = a.charAt(j);
								  if (j == n - 1)
								  {
								  System.out.printf("(%c,%d)",a.charAt(j),count);
								  }

							  }
			  }
			  }
		 System.in.read();
		 System.in.read();




	return 0;
	}

}


package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zs = new String(new char[257]);
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				zs = tempVar2.charAt(0);
			}
			for (j = 0;zs.charAt(j) != '\0';j++)
			{
				if (zs.charAt(j) == 'A')
				{
					zs = tangible.StringFunctions.changeCharacter(zs, j, 'T');
				}
				else
				{
				  if (zs.charAt(j) == 'T')
				  {
					  zs = tangible.StringFunctions.changeCharacter(zs, j, 'A');
				  }
				  else
				  {
					  if (zs.charAt(j) == 'C')
					  {
						  zs = tangible.StringFunctions.changeCharacter(zs, j, 'G');
					  }
					  else
					  {
						  if (zs.charAt(j) == 'G')
						  {
							  zs = tangible.StringFunctions.changeCharacter(zs, j, 'C');
						  }
					  }
				  }
				}
			}
		 System.out.printf("%s\n",zs);
		}



		return 0;
	}

}


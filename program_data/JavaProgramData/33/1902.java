package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int len;
		int j;
		String a = new String(new char[256]);
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
				a = tempVar2.charAt(0);
			}
			len = a.length();
			for (j = 0;j < len;j++)
			{
				switch (a.charAt(j))
				{
				case 'A':
					a = tangible.StringFunctions.changeCharacter(a, j, 'T');
					break;
				case 'C':
					a = tangible.StringFunctions.changeCharacter(a, j, 'G');
					break;
				case 'G':
					a = tangible.StringFunctions.changeCharacter(a, j, 'C');
					break;
				case 'T':
					a = tangible.StringFunctions.changeCharacter(a, j, 'A');
					break;
				}



			}
			System.out.printf("%s\n",a);
		}




	}

}


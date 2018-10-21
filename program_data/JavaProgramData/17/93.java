package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zf = new String(new char[106]);
		while (true)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(zf,'\0',(Character.SIZE / Byte.SIZE));
		zf = new Scanner(System.in).nextLine();
		if (zf.charAt(0) == '\0')
		{
		break;
		}
		System.out.println(zf);
		for (int i = 0;i < zf.length();i++)
		{
				  if (zf.charAt(i) == ')')
				  {
				  for (int j = i;j >= 0;j--)
				  {
				  if (zf.charAt(j) == '(')
				  {
				  zf = tangible.StringFunctions.changeCharacter(zf, j, ' ');
				  zf = tangible.StringFunctions.changeCharacter(zf, i, ' ');
				  break;
				  }
				  }
				  }
				  else if (zf.charAt(i) != '(')
				  {
				  zf = tangible.StringFunctions.changeCharacter(zf, i, ' ');
				  }
		}
		for (int t = 0;t < zf.length();t++)
		{
				 if (zf.charAt(t) == '(')
				 {
				 zf = tangible.StringFunctions.changeCharacter(zf, t, '$');
				 }
				 else if (zf.charAt(t) == ')')
				 {
				 zf = tangible.StringFunctions.changeCharacter(zf, t, '?');
				 }
		}
		System.out.println(zf);
		}
	return 0;
	}
}


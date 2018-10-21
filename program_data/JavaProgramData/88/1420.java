package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String c = new String(new char[30]);
	int i;

			for (i = 0;i < 30;i++)
			{
				String tempVar = ConsoleInput.scanfRead(null, 1);
				if (tempVar != null)
				{
					c = tangible.StringFunctions.changeCharacter(c, i, tempVar);
				}
			switch (c.charAt(i))
			{
			case '1':
			case '2':
			case '3':
			case '4':
			case '5':
			case '6':
			case '7':
			case '8':
			 case '9':
			 case '0':
					System.out.printf("%c",c.charAt(i));
					break;
					default :
					{
							switch (c.charAt(i - 1))
							{
				   case '1':
					case '2':
				   case '3':
					case '4':
					case '5':
					case '6':
					case '7':
					case '8':
					  case '9':
					 case '0':
					System.out.print("\n");
					break;
							}
					}
			}
			}
		return 0;
	}

}


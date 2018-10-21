package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[600]);
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int l;
		int i;
		int j;
		int start;
		int num;
		String box1 = new String(new char[600]);
		String box2 = new String(new char[600]);
		for (l = 2;l <= a.length();l++)
		{
			for (start = 0;start <= a.length() - l;start++)
			{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
				memset(box1,600,'\0');
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
							memset(box2,600,'\0');
				num = 0;
				for (i = start;i < start + l;i++)
				{
					box1 = tangible.StringFunctions.changeCharacter(box1, num++, a.charAt(i));
				}
				for (i = 0;i < l;i++)
				{
					box2 = tangible.StringFunctions.changeCharacter(box2, i, box1.charAt(l - 1 - i));
				}
				for (i = 0;i < l;i++)
				{
					if (box1.charAt(i) != box2.charAt(i))
					{
						break;
					}
					if (i == l - 1)
					{
						for (j = 0;j < l;j++)
						{
							System.out.print(box1.charAt(j));
						}
						System.out.print("\n");
					}
				}

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
				memset(box1,600,'\0');
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
				memset(box2,600,'\0');
			}
		}
		return 0;
	}
}


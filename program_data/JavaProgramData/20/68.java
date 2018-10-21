package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[11]);
		String str = new String(new char[4]);
		char max;
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int position,i;
		int position;
		int i;
		while (scanf("%s%s",a,str) != EOF)
		{
			max = a.charAt(0);
			for (i = 0;i < a.length();i++)
			{
				if (max < a.charAt(i))
				{
					max = a.charAt(i);
				}
			}
			for (i = 0;i < a.length();i++)
			{
				if (max == a.charAt(i))
				{
					position = i;
					break;
				}
			}
			for (i = 0;i <= position;i++)
			{
				System.out.printf("%c",a.charAt(i));
			}
			System.out.printf("%s",str);
			for (i = position + 1;i < a.length();i++)
			{
					System.out.printf("%c",a.charAt(i));
			}
			System.out.print("\n");
		}
	}
}

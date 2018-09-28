package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		String s;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		s = (String)malloc((Character.SIZE / Byte.SIZE) * 1000);
		s = new Scanner(System.in).nextLine();
		for (i = 0; * (s.Substring(i)) != '\0';i++)
		{
			if (*(s.Substring(i)) != ' ')
			{
				System.out.printf("%c",*(s.Substring(i)));
			}
			else
			{
				while (*(s.Substring(i) + 1) == ' ')
				{
					i++;
				}
				System.out.printf("%c",*(s.Substring(i)));
			}
		}
		System.out.print("\n");
	}
}

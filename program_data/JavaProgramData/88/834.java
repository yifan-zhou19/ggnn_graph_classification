package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *a;
		int a;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		str = (String)malloc(30 * (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		a = (int)malloc(30 * (Integer.SIZE / Byte.SIZE));

		str = new Scanner(System.in).nextLine();
		int i;
		for (i = 0;i < str.length();i++)
		{
			*(a + i) = *(str.Substring(i));

		}
				for (i = 0;i < str.length();i++)
				{
			   if (*(a + i) >= 48 && *(a + i) <= 57)
			   {

			System.out.printf("%c",*(str.Substring(i)));

			if (1 - (*(a + i + 1) <= 57 && *(a + i + 1) >= 48))
			{
				System.out.print("\n");
			}
			   }
				}

	}
}

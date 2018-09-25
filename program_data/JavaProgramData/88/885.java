package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a;
		int i;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *symbol;
		int symbol;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		a = (String)malloc(30 * (Character.SIZE / Byte.SIZE));
		a = new Scanner(System.in).nextLine();
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		symbol = (int)malloc(a.length() * (Integer.SIZE / Byte.SIZE));
		for (i = 0;a.charAt(i) != 0;i++)
		{
			if ((*(a.Substring(i)) == '1') || (*(a.Substring(i)) == '2') || (*(a.Substring(i)) == '3') || (*(a.Substring(i)) == '4') || (*(a.Substring(i)) == '5') || (*(a.Substring(i)) == '6') || (*(a.Substring(i)) == '7') || (*(a.Substring(i)) == '8') || (*(a.Substring(i)) == '9') || (*(a.Substring(i)) == '0'))
			{
				*(symbol + i) = 1;
				System.out.printf("%c",*(a.Substring(i)));
			}
			else
			{
				*(symbol + i) = 0;
				if (*(symbol + (i - 1)) == 1)
				{
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}

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
		int k;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		a = (String)malloc(1000 * (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		symbol = (int)malloc(1000 * (Integer.SIZE / Byte.SIZE));
		a = new Scanner(System.in).nextLine();
		for (i = 0; * (a.Substring(i)) != '\0';i++)
		{
			if (*(a.Substring(i)) == ' ')
			{
				*(symbol + i) = 0;
			}
			else
			{
				*(symbol + i) = 1;
			}
		}
		for (i = 1; * (a.Substring(i)) != '\0';i++)
		{
			if ((*(symbol + (i - 1)) == 0) && (*(a.Substring(i)) == ' '))
			{
				for (k = i; * (a.Substring(k)) != '\0';k++)
				{
					*(a.Substring(k)) = *(a + (k + 1));
					*(symbol + k) = *(symbol + (k + 1));
				}
				i = i - 1;
			}
		}
		System.out.println(a);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(a);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(symbol);
		return 0;
	}
}

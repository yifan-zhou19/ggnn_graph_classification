package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: char *p=(char *)malloc(101 *sizeof(char));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		char p = (String)malloc(101 * (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: char *ch=(char *)malloc(101 *sizeof(char));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		char ch = (String)malloc(101 * (Character.SIZE / Byte.SIZE));
		p = new Scanner(System.in).nextLine();
		n = p.length();

		for (i = 0;i < n;i++) //??
		{
			if (i == n - 1)
			{
				*(ch + i) = *(p + i) + (p);
			}
			else
			{
				*(ch + i) = *(p + i) + *(p + i + 1);
			}
		}
		*(ch + n) = '\0'; //????,,????,,?????,????
		System.out.println(ch);
		return 0;
	}
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int n;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: char *s1=(char*)malloc(100 *sizeof(char));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		char s1 = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: char *s=(char*)malloc(100 *sizeof(char));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		char s = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
		s = new Scanner(System.in).nextLine();
		n = s.length();
		for (i = 0;i < n - 1;i++)
		{
		  *(s1 + i) = (char)((int)(*(s + i)) + (int)(*(s + i + 1)));
		}
		*(s1 + n - 1) = (char)((int)(*(s + n - 1)) + (int)(*(s + 0)));
		for (i = 0;i < n;i++)
		{
		 System.out.printf("%c",*(s1 + i));
		}
	}
}

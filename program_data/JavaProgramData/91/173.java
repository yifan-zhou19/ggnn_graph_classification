package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: char *s1=(char*)malloc(101 *sizeof(char));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		char s1 = (String)malloc(101 * (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: char *s2=(char*)malloc(101 *sizeof(char));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		char s2 = (String)malloc(101 * (Character.SIZE / Byte.SIZE));
		s1 = new Scanner(System.in).nextLine();
		n = s1.length();
		for (i = 0;i < n - 1;i++)
		{
			*(s2 + i) = *(s1 + i) + *(s1 + i + 1);
		}
		*(s2 + n - 1) = *(s1 + n - 1) + (s1);
		*(s2 + n) = '\0';
		System.out.println(s2);
	}
}

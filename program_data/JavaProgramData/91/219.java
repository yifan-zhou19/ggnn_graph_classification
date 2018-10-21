package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: char *p=(char *)calloc(100,sizeof(char));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
		char p = (String)calloc(100,(Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: char *q=(char *)calloc(100,sizeof(char));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
		char q = (String)calloc(100,(Character.SIZE / Byte.SIZE));
		p = new Scanner(System.in).nextLine();
		int i;
		for (i = 0; * (p + i + 1) != '\0';i++)
		{
		*(q + i) = *(p + i) + *(p + i + 1);
		}
		*(q + i) = *(p + i) + p;
		*(q + i + 1) = '\0';
		System.out.println(q);
	}
}

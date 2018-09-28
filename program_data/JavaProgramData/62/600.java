package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: char *p=(char *)calloc(256,sizeof(char));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
		char p = (String)calloc(256,(Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: char *q=(char *)calloc(256,sizeof(char));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
		char q = (String)calloc(256,(Character.SIZE / Byte.SIZE));
		p = new Scanner(System.in).nextLine();
		int i;
		int j;
		for (i = 0,j = 0; * (p + i) != '\0';i++)
		{
		if (*(p + i) == ' ' && *(p + i + 1) == ' ')
		{
			;
		}
		else
		{
			*(q + j) = *(p + i),j++;
		}
		}
		System.out.println(q);
	}
}

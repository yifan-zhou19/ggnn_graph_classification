package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int sum = 0;
		int f = 1;

//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: char *p=(char *)malloc(sizeof(char)*100);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		char p = (String)malloc((Character.SIZE / Byte.SIZE) * 100);
		p = new Scanner(System.in).nextLine();
		for (i = 0;i < p.length();i++)
		{
			if (*(p + i) >= 48 && *(p + i) <= 57)
			{
				f = 0;
				sum = 0;
				System.out.printf("%c",*(p + i));
			}
			else
			{
				sum++;
				if (sum == 1 && f == 0)
				{
					System.out.print("\n");
				}
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(p);
	}

}

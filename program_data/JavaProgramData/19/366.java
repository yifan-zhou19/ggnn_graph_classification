package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s;
		String a;
		String b;
		String word;
		int i;
		int j = 0;
		int flag = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		s = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		a = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		b = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		word = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
		s = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		i = 0;
		while (*(s.Substring(i)))
		{
			if (*(s.Substring(i)) == ' ')
			{
				if (flag != 0)
				{
					System.out.print(" ");
				}
				flag = 1;
				*(word.Substring(j)) = '\0';
				j = 0;
				if (strcmp(word,a) == 0)
				{
					System.out.printf("%s",b);
				}
				else
				{
					System.out.printf("%s",word);
				}
			}
			else
			{
				*(word.Substring(j)) = *(s.Substring(i));
				j++;
			}
			i++;
		}
		*(word.Substring(j)) = '\0';
		if (flag != 0)
		{
			System.out.print(" ");
		}
		if (strcmp(word,a) == 0)
		{
			System.out.printf("%s",b);
		}
		else
		{
			System.out.printf("%s",word);
		}

	}
}

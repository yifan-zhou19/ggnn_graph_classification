package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String p;
		String q;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		q = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
		int i;
		int s = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
		p = new Scanner(System.in).nextLine();
		for (i = 0;i < 101;i++)
		{
			s++;
		if (*(p.Substring(i) + 1) == '\0')
		{
		break;
		}
		}

		for (i = 0;i < (s - 1);i++)
		{
			*(q.Substring(i)) = *(p.Substring(i)) + *(p.Substring(i) + 1);
			System.out.printf("%c",*(q.Substring(i)));
		}
		System.out.printf("%c",*(p.Substring(i)) + p);

	}
}

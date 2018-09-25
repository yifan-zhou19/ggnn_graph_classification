package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		final String str = "";
		String w1 = new String(new char[100]);
		String w2 = new String(new char[100]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		String q;

		str = new Scanner(System.in).nextLine();
		w1 = new Scanner(System.in).nextLine();
		w2 = new Scanner(System.in).nextLine();
		p = str;
		q = str;
		while (*p != ' ')
		{
			p++;
		}
		*p = '\0';

		if (strcmp(q,w1) == 0)
		{
			System.out.printf("%s",w2);
		}
		else
		{
			System.out.printf("%s",q);
		}
		p++;
		q = p;

		while (*p != '\0')
		{
			p++;
			if ((*p == ' ') || (*p == '\0'))
			{
				*p = '\0';

				System.out.print(" ");
					if (strcmp(q,w1) == 0)
					{
						System.out.printf("%s",w2);
					}
					else
					{
						System.out.printf("%s",q);
					}

					p++;
					q = p;
			}
		}
	}





}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int t;
	int i;
	int j = 0;
	String[] p = new String[100];
	String q;
	String r;

	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		t = Integer.parseInt(tempVar);
	}

	for (i = 0;i < t;i++)
	{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p[i] = (String)malloc(100000 * (Character.SIZE / Byte.SIZE));
		p[i] = new Scanner(System.in).nextLine();
	}

	for (i = 0;i < t;i++)
	{
		for (q = p[i]; q != '\0';q++)
		{
			j = 0;
			for (r = q.Substring(1); r != '\0';r++)
			{
				if (r == q)
				{
				r = ' ';
				j++;
				}
			}
			if (j != 0)
			{
				q = ' ';
			}
		}

		for (r = p[i]; r != '\0';r++)
		{
				if (r != ' ')
				{
				System.out.printf("%c\n", r);
				break;
				}
		}
		if (r == '\0')
		{
			System.out.print("no\n");
		}

	}
	}


}


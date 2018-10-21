package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String[] p;
		String j;
		String k;
		int t;
		int i;
		int flag = 0;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		p = (String)malloc(t * sizeof(String));
		for (i = 0;i <= t;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p[i] = (String)malloc(10000 * (Character.SIZE / Byte.SIZE));
			p[i] = new Scanner(System.in).nextLine();
		}

		for (i = 1;i <= t;i++)
		{
			for (j = p[i]; j != '\0';j++)
			{
				for (k = j.Substring(1); k != '\0';k++)
				{
					if (k == j)
					{
						k = '0';
						flag = 1;
					}
				}
				if (flag == 1)
				{
					j = '0';
				}
			flag = 0;
			}
		}

		for (i = 1;i <= t;i++)
		{
			for (j = p[i]; j != '\0';j++)
			{
				if (j != '0')
				{
					System.out.printf("%c\n", j);
					break;
				}
			}
			if (j == '\0')
			{
				System.out.print("no\n");
			}
		}
	}

}


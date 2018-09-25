package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String[] s = new String[100];
		String a;
		String b;
		int i = 0;
		int j = 0;
		int x;
		for (i = 0;i < 100;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			s[i] = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
			for (j = 0;j < 100;j++)
			{
				s[i][j] = '\0';
			}
		}
		for (i = 0;;i++)
		{
			for (j = 0;;j++)
			{
				String tempVar = ConsoleInput.scanfRead(null, 1);
				if (tempVar != null)
				{
					s[i][j] = tempVar.charAt(0);
				}
				if (s[i][j] == ' ' || s[i][j] == '\n')
				{
					break;
				}
			}
			if (s[i][j] == '\n')
			{
				x = i;
				break;
			}
		}
		for (i = 0;i <= x;i++)
		{
			for (j = 0;;j++)
			{
				if (s[i][j] == ' ' || s[i][j] == '\n')
				{
					s[i][j] = '\0';
					break;
				}
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		a = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		b = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		for (i = 0;i <= x;i++)
		{
			if (!strcmp(s[i],a))
			{
				for (j = 0;j < 100;j++)
				{
					s[i][j] = '\0';
				}
				s[i] = b;
			}
		}
		for (i = 0;i < x;i++)
		{
			System.out.printf("%s ",s[i]);
		}
		System.out.printf("%s\n",s[x]);
	}
}


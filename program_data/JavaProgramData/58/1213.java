package <missing>;

public class GlobalMembers
{
	public static int check(tangible.RefObject<String> p)
	{
		if ((p.argValue == '_') || (p.argValue >= 'a' && p.argValue <= 'z') || (p.argValue >= 'A' && p.argValue <= 'Z'))
		{
			int i;
			for (i = 0; * (p.argValue.Substring(i)) != '\0';i++)
			{
				if ((*(p.argValue.Substring(i)) == '_') || (*(p.argValue.Substring(i)) >= 'a' && *(p.argValue.Substring(i)) <= 'z') || (*(p.argValue.Substring(i)) >= 'A' && *(p.argValue.Substring(i)) <= 'Z') || (*(p.argValue.Substring(i)) >= '0' && *(p.argValue.Substring(i)) <= '9'))
				{
					;
				}
				else
				{
					break;
				}
			}
			if (*(p.argValue.Substring(i)) == '\0')
			{
				return (1);
			}
			else
			{
				return (0);
			}
		}
		else
		{
			return (0);
		}
	}

	public static void Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String[] p = new String[n];
		int i;
		for (i = 0;i < n;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p[i] = (String)malloc(512 * (Character.SIZE / Byte.SIZE));
			p[i] = new Scanner(System.in).nextLine();
		}
		for (i = 0;i < n;i++)
		{
		System.out.printf("%d\n",check(p[i]));
		}
	}
}


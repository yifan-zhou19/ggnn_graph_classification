package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int f = char * str;
		int n;
		int i;
		int p;
		char[][] str = new char[100][100];
		String t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			str[i] = new Scanner(System.in).nextLine();
		}
		for (i = 0;i < n;i++)
		{
			t = str[i];
		tangible.RefObject<String> tempRef_t = new tangible.RefObject<String>(t);
			p = f(tempRef_t);
			t = tempRef_t.argValue;
			System.out.printf("%d\n",p);
		}
		return 0;
	}
	public static int f(tangible.RefObject<String> str)
	{
		int p = 1;
		int i = 0;
		if (str.argValue == '_' || (str.argValue >= 'A' && str.argValue <= 'Z') || (*(str.argValue.Substring(i)) >= 'a' && *(str.argValue.Substring(i)) <= 'z'))
		{
			p = 1;
		}
		else
		{
			p = 0;
		}
		for (i = 1; * (str.argValue.Substring(i)) != '\0';i++)
		{
			if ((*(str.argValue.Substring(i)) >= 48 && *(str.argValue.Substring(i)) <= 57) || (*(str.argValue.Substring(i)) >= 'A' && *(str.argValue.Substring(i)) <= 'Z') || (*(str.argValue.Substring(i)) >= 'a' && *(str.argValue.Substring(i)) <= 'z') || *(str.argValue.Substring(i)) == '_')
			{
				p = p;
			}
			else
			{
				p = 0;
				break;
			}
		}
		return p;
	}

}


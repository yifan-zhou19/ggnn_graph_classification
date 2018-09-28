package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int num;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = Integer.parseInt(tempVar);
		}
		String[] p;
		int judge = char * x;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		p = (String)malloc(num * sizeof(String));
		for (i = 0;i < num + 1;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p[i] = (String)malloc(100);
			p[i] = new Scanner(System.in).nextLine();
		}
		for (i = 1;i < num + 1;i++)
		{
			System.out.printf("%d\n",judge(p[i]));
		}
	}
	public static int judge(tangible.RefObject<String> x)
	{
		int i;
		int flag = 0;
		if (x.argValue == '_' || x.argValue >= 'a' && x.argValue <= 'z' || x.argValue >= 'A' && x.argValue <= 'Z')
		{
			flag = 1;
		}
		for (i = 1; * (x.argValue.Substring(i)) && flag == 1;i++)
		{
			if ((*(x.argValue.Substring(i)) >= 'a' && *(x.argValue.Substring(i)) <= 'z' || *(x.argValue.Substring(i)) >= 'A' && *(x.argValue.Substring(i)) <= 'Z' || *(x.argValue.Substring(i)) >= '0' && *(x.argValue.Substring(i)) <= '9' || *(x.argValue.Substring(i)) == '_') != 1)
			{
				flag = 0;
			}
		}
		return flag;
	}
}


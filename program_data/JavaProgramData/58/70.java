package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int k;
		int flag;
		String s;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		s = malloc(100 * (Character.SIZE / Byte.SIZE));
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		s = new Scanner(System.in).nextLine();
		for (i = 1;i <= n;i++)
		{
			flag = 1;
			k = 0;
		s = new Scanner(System.in).nextLine();
		if (*(s.Substring(0)) == '_')
		{
			k = 1;
		}
		if (*(s.Substring(0)) <= '9' && *(s.Substring(0)) >= '0')
		{
			flag = 0;
		}
		for (j = k; * (s.Substring(j)) != '\0';j++)
		{
			if (*(s.Substring(j)) <= 'z' && *(s.Substring(j)) >= 'A')
			{
				;
			}
				else if (*(s.Substring(j)) <= '9' && *(s.Substring(j)) >= '0')
				{
					;
				}
				else
				{
					flag = 0;
				}
		}
		System.out.printf("%d\n",flag);
		}
	}
}


package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] s = new char[100][101];
		String a = new String(new char[101]);
		String b = new String(new char[101]);
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s[0] = tempVar.charAt(0);
		}
		for (i = 1;System.in.read() != '\n';i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s[i] = tempVar2.charAt(0);
		}
		}
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		for (j = 0;j < i;j++)
		{
			if (strcmp(s[j],a) == 0)
			{
				s[j] = b;
			}
		}
		System.out.printf("%s",s[0]);
		for (j = 1;j < i;j++)
		{
			System.out.printf(" %s",s[j]);
		}
		return 0;
	}


}


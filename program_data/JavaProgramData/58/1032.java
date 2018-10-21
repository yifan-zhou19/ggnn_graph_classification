package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int k;
		String string = new String(new char[81]);
		String p;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.in.read();
		for (k = 1;k <= n;k++)
		{
		String = new Scanner(System.in).nextLine();
		p = String;
		if ((p == '_') || (p >= 'a' && p <= 'z') || (p >= 'A' && p <= 'Z'))
		{
			for (i = 0; * (p.Substring(i)) != '\0';i++)
			{
				if ((*(p.Substring(i)) == '_') || (*(p.Substring(i)) >= 'a' && *(p.Substring(i)) <= 'z') || (*(p.Substring(i)) >= 'A' && *(p.Substring(i)) <= 'Z') || (*(p.Substring(i)) >= '0' && *(p.Substring(i)) <= '9'))
				{
					;
				}
				else
				{
				System.out.print("0\n");
				break;
				}
			}
			if (*(p.Substring(i)) == '\0')
			{
				System.out.print("1\n");
			}
		}
		else
		{
			System.out.print("0\n");
		}
		}
	}

}


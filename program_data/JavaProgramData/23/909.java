package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str;
		String p;
		String q;
		String temp;
		int n;
		int i;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
		str = (String)calloc(128,(Character.SIZE / Byte.SIZE));
		str = new Scanner(System.in).nextLine();
		n = str.length();
		for (i = n - 1;i >= 0;i--)
		{
			*(str.Substring(i) + 1) = *(str.Substring(i));
		}
		str = '\0';
		p = q = str.Substring(n);
		while (true)
		{
			if (p != ' ' && p != '\0')
			{
				p--;
				continue;
			}
			if (p == ' ' || p == '\0')
			{
				for (temp = p.Substring(1);temp <= q;temp++)
				{
					System.out.printf("%c", temp);
				}
				if (p != '\0')
				{
					System.out.print(" ");
				}
				else
				{
					break;
				}
				p--;
				q = p;
				continue;
			}
		}
	}

}

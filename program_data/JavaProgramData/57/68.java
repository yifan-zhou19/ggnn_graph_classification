package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int j;
		int k;
		String p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p = (String)malloc(1000 * (Character.SIZE / Byte.SIZE));
		p = new Scanner(System.in).nextLine();
		k = p.length();
		if ((*(p.Substring(k) - 2) == 'e' && *(p.Substring(k) - 1) == 'r') || (*(p.Substring(k) - 2) == 'l' && *(p.Substring(k) - 1) == 'y'))
		{
			*(p.Substring(k) - 2) = '\0';
		}
		else if (*(p.Substring(k) - 3) == 'i' && *(p.Substring(k) - 2) == 'n' && *(p.Substring(k) - 1) == 'g')
		{
			*(p.Substring(k) - 3) = '\0';
		}
		System.out.printf("%s\n",p);
		}
	}

}


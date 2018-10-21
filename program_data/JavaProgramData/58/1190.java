package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String pi = new String(new char[81]);
	int i;
	int m;
	int n;
	int j;
	int ok = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
	pi = (char[81])calloc(n,(Character.SIZE / Byte.SIZE) * 81);
	*pi = new Scanner(System.in).nextLine();
	for (i = 0;i < n;i++)
	{
		*(pi.Substring(i)) = new Scanner(System.in).nextLine();
		ok = 1;
		m = String.valueOf(*(pi.Substring(i))).length();
		if ((*(*(pi.Substring(i))) >= 'A' && *(*(pi.Substring(i))) <= 'Z') || (*(*(pi.Substring(i))) >= 'a' && *(*(pi.Substring(i))) <= 'z') || (*(*(pi.Substring(i))) == '_'))
		{
			for (j = 1;j < m;j++)
			{
				if ((*(*(pi.Substring(i)) + j) >= 'A' && *(*(pi.Substring(i)) + j) <= 'Z') || (*(*(pi.Substring(i)) + j) >= 'a' && *(*(pi.Substring(i)) + j) <= 'z') || (*(*(pi.Substring(i)) + j) == '_') || (*(*(pi.Substring(i)) + j) >= '0' && *(*(pi.Substring(i)) + j) <= '9'))
				{
					;
				}
				else
				{
					ok = 0;
				}
			}
		}
		else
		{
			ok = 0;
		}
		System.out.printf("%d\n",ok);
	}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
	free(pi);
	return 0;
	}
}


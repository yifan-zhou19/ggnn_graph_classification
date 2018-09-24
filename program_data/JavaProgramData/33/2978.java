package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		String p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p = (String)malloc(225 * 4);
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p = tempVar2.charAt(0);
			}
			for (j = 0; * (p.Substring(j)) != '\0';j++)
			{
				switch (*(p.Substring(j)))
				{
				case 'T':
					System.out.printf("%c",'A');
					break;
				case 'A':
					System.out.printf("%c",'T');
					break;
				case 'C':
					System.out.printf("%c",'G');
					break;
				case 'G':
					System.out.printf("%c",'C');
					break;
				}
			}
			System.out.print("\n");
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
			free(p);
		}
	}




}


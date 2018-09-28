package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String[] p = new String[10000];
		String q;
		int n;
		int i;
		int j;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p[i] = (String)malloc(100000 * (Character.SIZE / Byte.SIZE));
			p[i] = new Scanner(System.in).nextLine();
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0; * (p[i] + j) != '\0';j++)
			{
				for (k = 0; * (p[i] + k) != '\0';k++)
				{
					if (k != j)
					{
					if (*(p[i] + k) == *(p[i] + j))
					{
						break;
					}
					}
				}
					if (*(p[i] + k) == '\0')
					{
						System.out.printf("%c\n",*(p[i] + j));
						break;
					}

			}
			if (*(p[i] + j) == '\0')
			{
				System.out.print("no\n");
			}
		}




	}
}


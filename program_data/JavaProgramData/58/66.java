package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String p;
		int n;
		int i;
		int j;
		int k;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *q;
		int q;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		q = (int)malloc(n * (Integer.SIZE / Byte.SIZE));
		for (i = 0;i < n;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p = (String)malloc(80 * (Character.SIZE / Byte.SIZE));
			p = new Scanner(System.in).nextLine();
			for (j = 0; * (p.Substring(j)) != '\0';j++)
			{
				if (*(p.Substring(j)) == '_' || (*(p.Substring(j)) >= 'A' && *(p.Substring(j)) <= 'Z') || (*(p.Substring(j)) >= 'a' && *(p.Substring(j)) <= 'z') || (*(p.Substring(j)) >= '0') && (*(p.Substring(j)) <= '9'))
				{
					k = 1;
				}
				else
				{
					k = 0;
					break;
				}
			}
			if ((p == '_' || (p >= 'A' && p <= 'Z') || (p >= 'a' && p <= 'z')) && (k == 1))
			{
				*(q + i) = 1;
			}
			else
			{
				*(q + i) = 0;
			}
		}
		System.out.printf("%d", q);
		for (i = 1;i < n;i++)
		{
			System.out.printf("\n%d",*(q + i));
		}
	}

}


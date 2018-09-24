package <missing>;

public class GlobalMembers
{
	public static int Main() //???????????,??????????
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *num;
		int num;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		num = (int)malloc(n * (Integer.SIZE / Byte.SIZE));
		int i;
		int j;
		for (i = 0;i < n;i++)
		{
			String org;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			org = (String)malloc(80 * (Character.SIZE / Byte.SIZE));
			org = new Scanner(System.in).nextLine();
			String p;
			p = org;
			if (p == '_' || Character.isLetter(p))
			{
				for (j = 0; * (p.Substring(j)) != '\0';j++)
				{
					if (Character.isLetter(*(p.Substring(j))) == 0 && Character.isDigit(*(p.Substring(j))) == 0 && *(p.Substring(j)) != '_')
					{
						*(num + i) = 3;
					}
				}
				if (*(num + i) == 3)
				{
					*(num + i) = 0;
				}
				else
				{
					*(num + i) = 1;
				}

			}
			else
			{
				*(num + i) = 0;
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%d\n",*(num + i));
		}
	}



}


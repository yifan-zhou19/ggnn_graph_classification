package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t = 0;
		int i = 0;
		int j = 0;
		int k = 0;
		int l = 0;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *n;
		int n;
		int m = 0;
		String[] p;
		char a;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		n = (int)malloc(26 * (Integer.SIZE / Byte.SIZE));
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		a = System.in.read(); //?????//
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		p = (String)malloc(100 * sizeof(String)); //??100?????//
		for (i = 0;i < t;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p[i] = (String)malloc(100000 * (Character.SIZE / Byte.SIZE));
			p[i] = new Scanner(System.in).nextLine();
		}
		for (i = 0;i < t;i++)
		{
			for (k = 0;k < 26;k++)
			{
				*(n + k) = -1;
			}
			l = String.valueOf(p[i]).length();
			for (j = 0;j < l;j++) //??????????????//
			{
				for (k = 0;k < 26;k++) //??????????????//
				{
					if (*(p[i] + j) == (97 + k))
					{
						if (*(n + k) == -1) //???????????//
						{
							*(n + k) = j; //???????????????,??????????j??2//
						}
						else //????????//
						{
							*(n + k) = -2;
						}
					}
				}
			}
			m = l;
			for (k = 0;k < 26;k++) //??26????????????????????//
			{
				if ((*(n + k) < m) && (*(n + k) != -1) && (*(n + k) != -2))
				{
					m = (n + k);

				}
			}
			if (m != l)
			{
				System.out.printf("%c\n",*(p[i] + m));
			}
			else
			{
				System.out.print("no\n");
			}
		}
		return 0;
	}
}


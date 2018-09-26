package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on the parameter 'p', so pointers on this parameter are left unchanged:
	public static void check(char * p)
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * pp;
		int i;
		int sum;
		int kk = 0;
		String q;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		q = (String)malloc(26 * (Character.SIZE / Byte.SIZE));
		for (i = 0;i < 26;i++)
		{
			*(q.Substring(i)) = i + 97;
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *qq,*s;
		int qq;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *s;
		int s;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		qq = (int)malloc(26 * (Integer.SIZE / Byte.SIZE));
		s = qq;
		for (i = 0;i < 26;i++)
		{
			*(s + i) = 0;
			for (pp = p; * pp != '\0';pp++)
			{
				if (*pp == *(q.Substring(i)))
				{
				(*(s + i))++;
				}
			}
		}
		for (pp = p; * pp != '\0';pp++)
		{
			if (*(qq + *pp - 97) == 1)
			{
				kk = 1;
				System.out.printf("%c\n",*pp);
				break;
			}
		}
		if (kk != 1)
		{
			System.out.print("no\n");
		}
	}







	public static void Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String[] p = new String[100];
		char[][] a = new char[100][100000];
		int i;
		for (i = 0;i < n;i++)
		{
			p[i] = *(a + i);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p[i] = tempVar2;
			}
		}
		for (i = 0;i < n;i++)
		{
			check(p[i]);
		}
	}





}


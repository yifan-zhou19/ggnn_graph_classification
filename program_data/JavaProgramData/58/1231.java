package <missing>;

public class GlobalMembers
{
	public static int panduan(tangible.RefObject<String> p)
	{
		int z = 1;
		int i;
		int j;
		int k;
		if (!(((p.argValue >= 'a') && (p.argValue <= 'z')) || ((p.argValue >= 'A') && (p.argValue <= 'Z')) || (p.argValue == '_')))
		{
			z = 0;
		}
		else
		{
			for (i = 1; * (p.argValue.Substring(i)) != '\0';i++)
			{
				if (!(((*(p.argValue.Substring(i)) >= 'a') && (*(p.argValue.Substring(i)) <= 'z')) || ((*(p.argValue.Substring(i)) >= 'A') && (*(p.argValue.Substring(i)) <= 'Z')) || (*(p.argValue.Substring(i)) == '_') || (*(p.argValue.Substring(i)) >= '0' && *(p.argValue.Substring(i)) <= '9')))
				{
					z = 0;
					break;
				}
			}
		}
		return (z);
	}
	public static void Main()
	{
		int panduan = char * p;
		int m;
		int n;
		int i;
		int j;
		int k;
		String p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		String * q;
		String[] Q;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		q = (String)malloc(m * sizeof(String));
		Q = q;
		for (i = 0;i < m;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p = (String)malloc(80 * (Character.SIZE / Byte.SIZE));
			for (j = 0;j < 80;j++)
			{
				*(p.Substring(j)) = '\0';
			}
			p = new Scanner(System.in).nextLine();
			*q = p;
			q = q.Substring(1);
		}
		for (i = 0;i < m;i++,Q++)
		{
			System.out.printf("%d\n",panduanQ);
		}
	}
}


package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * a;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *A;
		int A;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		char c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		a = (int)malloc(n * (Character.SIZE / Byte.SIZE));
		A = a;
		for (i = 0;i < n;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p = (String)malloc(80 * (Character.SIZE / Byte.SIZE));
			p = new Scanner(System.in).nextLine();
			scanf("\n");
			if (*p != '_' && ((*p < 'A') || ((*p>'Z') && (*p < 'a')) || (*p>'z')))
			{
				*a = 0;
				a++;
			}
			else
			{
				p++;
				for (; * p != '\0';p++)
				{
				if (*p != '_' && ((*p < 'A') || ((*p>'Z') && (*p < 'a')) || (*p>'z')) && (*p < '0' || *p>'9'))
				{
					break;
				}
				}
			if (*p == '\0')
			{
				*a = 1;
				a++;
			}
			else
			{
				*a = 0;
				a++;
			}
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%d\n", A);
			A++;
		}
	}



}


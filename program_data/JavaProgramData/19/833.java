package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * q;
		int k;
		int m = 0;
		String s;
		String a;
		String b;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		s = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		a = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		b = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
		s = new Scanner(System.in).nextLine();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}

		k = a.length();
		p = s;
		q = a;
		//printf("%c ",*q);

		while (*p != '\0')
		{
			//printf(" %d ",m);
			if (m == k)
			{
				if (*p == ' ' || *p == '\0')
				{
					System.out.printf("%s",b);
					m = 0;
					q = a;
				}
				else
				{
					System.out.printf("%s",a);
					m = 0;
					q = a;
				}
			}
			//printf("%c-%c ",*p,*q);

			if (*p == *q)
			{
				m++;
				if (m == 1)
				{
					if (p == s)
					{
						p++;
						q++;
					}
					else
					{
						p--;
						if (*p == ' ')
						{
							p = p + 2;
							q++;
						}
						else
						{
						m = 0;
						q = a;
						p++;
						System.out.printf("%c",*p);
						p++;
						}
					}
				}
				else
				{
					p++;
					q++;
				}
			}
			else
			{
				p = p - m;
				System.out.printf("%c",*p);
				m = 0;
				q = a;
				p++;
			}
		}
		if (m == k)
		{
			System.out.printf("%s",b);
		}
	}

}


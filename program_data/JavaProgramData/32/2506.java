package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int lena;
		int lens;
		int i;
		int j;
		int k;
		String str = new String(new char[100]);
		String a = new String(new char[100]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * pa;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * ps;
		String e = new String(new char[20]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		e = new Scanner(System.in).nextLine();
		for (i = 1;i <= n;i++)
		{
			str = new Scanner(System.in).nextLine();
			a = new Scanner(System.in).nextLine();
			e = new Scanner(System.in).nextLine();
			lens = str.length();
			lena = a.length();
			pa = a.Substring(lena) - 1;
			ps = str.Substring(lens) - 1;
			for (;pa >= a;pa--,ps--)
			{
				if (*ps >= *pa)
				{
					*ps = ps - *pa + 48;
				}
				else
				{
					*ps = ps - *pa + 58;
					p = ps - 1;
					while (*p == 0)
					{
						*p = 57;
						p--;
					}
					*p = p - 1;
				}
			}
			for (k = 0;k <= lens - 1;k++)
			{
				if (str.charAt(i) != 0)
				{
					break;
				}
			}
			for (j = k;j < lens - 1;j++)
			{
				System.out.printf("%c",str.charAt(j));
			}
			System.out.printf("%c\n",str.charAt(lens - 1));
		}
	}
}


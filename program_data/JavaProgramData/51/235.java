package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int l;
		int i;
		int j;
		int m = 0;
		int k = 0;
		String a = new String(new char[600]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		(char)(*s)[7];
		(char)(*q)[7];
		char[][] b = new char[600][7];
		char[][] c = new char[600][7];
		(char)(*t)[7];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		p = a;
		q = b;
		s = c;
		l = a.length();
		for (i = 0;i < l - n + 1;i++)
		{
			*q = p.substring(0, n);
		*(*q + n) = '\0';
			p++;
			q++;
		}
		q = b;
		for (i = 0;i < l - n + 1;i++)
		{
			k = 0;
			t = b;
			for (j = 0;j < l - n + 1;j++)
			{
				if (strcmp(*t,*q) == 0)
				{
					k++;
				}
				t++;

			}
			if (k > m)
			{
				m = k;
				s = c;
				*s = *q;
			}
			else if (k == m && strcmp(*s,*q) != 0)
			{
				s++;
				*s = *q;
			}
			q++;
		}
		l = s - c + 1;
		if (m == 1)
		{
			System.out.print("NO");
		}
		else
		{
			System.out.printf("%d\n",m);
			s = c;
			for (i = 0;i < l;i++)
			{
				k = 0;
				t = c;
				for (;t < s;)
				{
					if (strcmp(*t,*s) == 0)
					{
						k++;
					}
					t++;
				}
				if (k == 0)
				{
				System.out.println(*s);
				}
				s++;
			}
		}
		return 0;
	}
}


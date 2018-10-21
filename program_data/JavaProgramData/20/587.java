package <missing>;

public class GlobalMembers
{
	public static int max_number(tangible.RefObject<String> q, int n)
	{
		int j;
		int m = 1;
		int t = q.argValue;
		for (j = 1;j < n;j++)
		{
			if (t < *(q.argValue.Substring(j)))
			{
				t = (q.argValue.Substring(j));
				m = j + 1;
			}
		}
			return m;
	}

	public static void Main()
	{
		int i;
		int n;
		int m;
		String str = new String(new char[14]);
		String substr = new String(new char[4]);
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: char *p[2]={str,substr};
		char[] p = {str, substr};
		while (scanf("%s%s",p[0],p[1]) != EOF)
		{
			n = String.valueOf(p[0]).length();
			m = max_number(p[0], n);
		/*	printf("%d",m);*/
			for (i = n - m;i > 0;i--)
			{
				*(p[0] + m + i + 2) = *(p[0] + m + i - 1);
			}
			*(p[0] + n + 3) = '\0';
			for (i = 0;i < 3;i++)
			{
				*(p[0] + m + i) = *(p[1] + i);
			}
			System.out.println(str);
		}
	}


}


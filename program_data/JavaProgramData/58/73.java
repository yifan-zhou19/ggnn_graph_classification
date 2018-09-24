package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int s;
		  int i;
		  int j;
		  char[][] q = new char[10000][100];
		  String[] p = new String[10000];
		  void test(char p[0]);
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  s = Integer.parseInt(tempVar);
		  }
		  for (i = 1;i <= s;i++)
		  {
			  q[i] = new Scanner(System.in).nextLine();
		  }
		  for (i = 1;i <= s;i++)
		  {
			  p[i] = q[i];
			  test(p[i]);
		  }

	}

	public static void test(tangible.RefObject<String> p)
	{
		int t;
		int m = 0;
		int n = 0;
		int i;
		int b;
		b = p.argValue.length();
		for (i = 0;i < b;i++)
		{
			if ((*(p.argValue.Substring(i)) == '_') || (*(p.argValue.Substring(i)) >= 'a' && *(p.argValue.Substring(i)) <= 'z') || (*(p.argValue.Substring(i)) >= 'A' && *(p.argValue.Substring(i)) <= 'Z') || (*(p.argValue.Substring(i)) <= '9' && *(p.argValue.Substring(i)) >= '0'))
			{
				m = m + 1;
			}
		}
		if ((p.argValue == '_') || (p.argValue >= 'a' && p.argValue <= 'z') || (p.argValue >= 'A' && p.argValue <= 'Z'))
		{
			n = 1;
		}
		if (n > 0 && m == b)
		{
			t = 1;
		}
		else
		{
			t = 0;
		}
		System.out.printf("%d\n",t);
	}

}


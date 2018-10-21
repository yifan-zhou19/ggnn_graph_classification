package <missing>;

public class GlobalMembers
{
	public static char d;
	public static char e;
	public static void sort(tangible.RefObject<String> t, tangible.RefObject<String> p, tangible.RefObject<String> q, int i)
	{
		int j;
		int n;
		for (j = 0;j < i;j++)
		{
			if (t.argValue.charAt(j) == e)
			{
				t.argValue = t.argValue.substring(0, j);
				q.argValue = j;
				for (n = j;n >= 0;n--)
				{
					if (t.argValue.charAt(n) == d)
					{
						t.argValue = t.argValue.substring(0, n);
						p.argValue = n;
						break;
					}
				}
			break;
			}
		}
	}
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[50]);
		String c = new String(new char[50]);
		String p;
		String q;
		String t;
		int i;
		int j;
		p = b;
		q = c;
		t = a;
		for (i = 0;i < 100;i++)
		{
			String tempVar = ConsoleInput.scanfRead(null, 1);
			if (tempVar != null)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, tempVar);
			}
			if (a.charAt(i) == 10)
			{
				break;
			}
		}
		d = a.charAt(0);
		e = a.charAt(i - 1);
		for (j = 0;j < i / 2;j++,p++,q++)
		{
		tangible.RefObject<String> tempRef_t = new tangible.RefObject<String>(t);
		tangible.RefObject<String> tempRef_p = new tangible.RefObject<String>(p);
		tangible.RefObject<String> tempRef_q = new tangible.RefObject<String>(q);
			sort(tempRef_t, tempRef_p, tempRef_q, i);
			q = tempRef_q.argValue;
			p = tempRef_p.argValue;
			t = tempRef_t.argValue;
		}
		p = b;
		q = c;
		for (j = 0;j < i / 2;j++)
		{
			System.out.printf("%d %d\n",p.charAt(j),q.charAt(j));
		}
		return 0;
	}
}


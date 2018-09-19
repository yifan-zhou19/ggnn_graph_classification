package <missing>;

public class GlobalMembers
{
	public static void cha(String str)
	{
		String substr = new String(new char[10]);
		String res = new String(new char[1000]);
		char giant;
		String p;
		String q;
		String t;
		int i;
		int max;
		int n;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			substr = tempVar.charAt(0);
		}
		n = str.length();
		max = 0;
		p = str;
		giant = p;
		for (i = 0;i < n;i++)
		{
			if (*(p.Substring(i)) > giant)
			{
				giant = (p.Substring(i));
				max = i;
			}
		}
		p = str;
		q = res;
		t = substr;
		m = substr.length();
		q = p.substring(0, max + 1);
		q.Substring(max) + 1 = t;
		q.Substring(max) + m + 1 = p.Substring(max) + 1;
		System.out.println(res);
	}
	public static void Main()
	{
	   String str = new String(new char[100]);
	   while (scanf("%s",str) != EOF)
	   {
		   cha(str);
	   }
	}

}


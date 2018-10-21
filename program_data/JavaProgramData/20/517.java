package <missing>;

public class GlobalMembers
{
	public static void insert(String a, String b)
	{
		int max;
		int i;
		int index;
		String p;
		String ans = new String(new char[20]);
		p = a;
		max = 0;
		for (i = 1; * (p.Substring(i));i++)
		{
				if (*(p.Substring(i)) > max)
				{
					max = (p.Substring(i)),index = i;
				}
		}
		ans = "";
		strncat(ans,a,index + 1);
		ans += b;
		ans += a + index + 1;
		System.out.printf("%s\n",ans);
	}
	public static void Main()
	{
		String str = new String(new char[20]);
		String substr = new String(new char[10]);
		while (scanf("%s %s\n",str,substr) != EOF)
		{
			insert(str, substr);
		}
	}

}

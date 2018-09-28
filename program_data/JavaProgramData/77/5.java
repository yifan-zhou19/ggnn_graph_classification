//C++ TO JAVA CONVERTER NOTE: Classes must be named in Java, so the following class has been named AnonymousClass:
public class AnonymousClass
{
		public int num;
		public int t;
		public char s;
}

package <missing>;

public class GlobalMembers
{
	public static char b;
	public static char g;
	public static String chr = new String(new char[100]);
		public static AnonymousClass[] ch = tangible.Arrays.initializeWithDefaultAnonymousClassInstances(100);

	public static void chulie(int a)
	{
		int k;
		int m;
		int n;
		if ((ch[a].s == g) && ch[a].t != 0)
		{
			for (k = a - 1;k >= 0;k--)
			{
				if (ch[k].s == b && ch[k].t != 0)
				{
					System.out.printf("%d %d\n",ch[k].num,ch[a].num);
					ch[k].t = 0;
					ch[a].t = 0;
					break;
				}
			}
		}
		if (chr.charAt(a + 1) != '\0')
		{
			chulie(++a);
		}
	}
	public static int Main()
	{

		int nb;
		int ng;
		int i;
		int j;
		int k;
		int l;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			chr = tempVar.charAt(0);
		}
		b = chr.charAt(0);
		for (i = 0;chr.charAt(i) != '\0';i++)
		{
			ch[i].num = i;
			ch[i].t = 1;
			ch[i].s = chr.charAt(i);
		}
		for (i = 0;chr.charAt(i) != '\0';i++)
		{
			if (chr.charAt(i) != b)
			{
				g = chr.charAt(i);
				break;
			}
		}
		chulie(i);
		return 0;
	}

}


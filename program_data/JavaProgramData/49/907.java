package <missing>;

public class GlobalMembers
{
	public static int judge(tangible.RefObject<String> p, int l)
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * x;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * t;
		t = p.argValue;
		int y = 1;
		x = t + l - 1;
		while ((t <= x) && y != 0)
		{
			if (*t != *x)
			{
				y = 0;
			}
			t++;
			x--;
		}
		return y;
	}
	public static void pp(tangible.RefObject<String> p, int l)
	{
		int i;
		String t;
		t = p.argValue;
		for (i = 1;i <= l;i++)
		{
			System.out.printf("%c",*(p.argValue.Substring(i) - 1));
		}

	System.out.print("\n");
	}
	public static void Main()
	{
		String c = new String(new char[3243]);
		int i;
		int j;
		int k;
		int l;
		String p;
		//freopen("tt.in","r",stdin);
		//freopen("tt.out","w",stdout);
		c = new Scanner(System.in).nextLine();
		l = c.length();
		p = c;
		for (i = 2;i <= l;i++)
		{

		 for (j = 1;j <= l - i + 1;j++)
		 {
			 if (judge(p.Substring(j) - 1, i) != 0)
			 {
			pp(p.Substring(j) - 1, i);
			 }
		 }
		}





	}
}


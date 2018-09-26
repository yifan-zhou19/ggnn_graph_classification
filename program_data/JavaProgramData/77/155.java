package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		void f(char c[],char,char,int);
		String c = new String(new char[1000]);
		char a;
		char b;
		char n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			c = tempVar.charAt(0);
		}
		n = c.length();
		a = c.charAt(0);
		b = c.charAt(n - 1);
		f(c, a, b, n);

	}


	public static void f(String c, char a, char b, int n)
	{
		int i;
		int nan;
		int nv;
		int k;
		for (i = 0;i < n;i++)
		{
			if (c[i].equals(b))
			{
				nan = 0;
				nv = 0;
				for (k = i;k >= 0;k--)
				{
					if (c[k].equals(a))
					{
						nan++;
					}
					else if (c[k].equals(b))
					{
						nv++;
					}
					if (nan == nv)
					{
						System.out.printf("%d %d\n",k,i);
						break;
					}
				}
			}
		}
	}

}


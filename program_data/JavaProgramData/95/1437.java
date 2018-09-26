package <missing>;

public class GlobalMembers
{
	public static String a = new String(new char[80]);
	public static String b = new String(new char[80]);
	public static int n;
	public static int m;
	public static int i;
	public static int j;

	/*
	
	int min(int x,int y)
	{
	    if(x>y) return y;
	    return x;
	}
	
	char compare()
	{
	    int l=min(n,m);
	    for(int i=0;i<l;i++)
	    {
	        if (lower(a[i])<lower(b[i])) return '<'; 
	        if (lower(a[i])>lower(b[i])) return '>'; 
	    }
	    if (n<m) return '<';
	    if (n>m) return '>';
	    return '=';
	}*/

	public static char lower(char x)
	{
		if (x >= 'A' && x <= 'Z')
		{
			return x + 'a'-'A';
		}
		return x;
	}

	public static char tochar(int m)
	{
	   if (m > 0)
	   {
		   return '>';
	   }
	   if (m < 0)
	   {
		   return '<';
	   }
	   return '=';
	}

	public static void toLowerArray(String x, int len)
	{
		for (int j = 0;j < len;j++)
		{
			x[j] = lower(x[j]);
		}
	}

	public static int Main()
	{
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		n = a.length();
		m = b.length();

		toLowerArray(a, n);
		toLowerArray(b, m);

		System.out.print(tochar(strcmp(a,b)));
		//cout<<compare();     
		return 0;
	}

}

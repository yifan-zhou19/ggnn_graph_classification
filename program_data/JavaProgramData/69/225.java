package <missing>;

public class GlobalMembers
{
	public static String s1 = new String(new char[200]);
	public static String s2 = new String(new char[200]);
	public static int[] a = new int[200];
	public static int[] b = new int[200];
	public static int[] c = new int[200];
	public static int alen;
	public static int blen;
	public static int clen;

	public static int str2bigint(tangible.RefObject<String> str, int[] t)
	{
		int len = str.argValue.intValue().length();
		int i;
		for (i = 0;i < len;i++)
		{
			t[i] = str.argValue.charAt(len - i - 1) - '0';
		}
		return len;
	}

	public static void print_int(int[] a)
	{
		int k = 199;
		int i;
		while (a[k] == 0 && k > 0)
		{
			k = k - 1;
		}
		for (i = k;i >= 0;i--)
		{
			System.out.printf("%d",a[i]);
		}
	}


	public static int add_bigint(int[] a, int alen, int[] b, int blen, int[] c)
	{
		int i;
		int temp = 0;
		int tmpsum = 0;
		int len = (alen > blen)?alen:blen;
		for (i = 0;i < len;i++)
		{
			tmpsum = a[i] + b[i] + temp;
			c[i] = tmpsum % 10;
			temp = tmpsum / 10;
		}
		if (temp != 0)
		{
			c[len] = temp;
			return len + 1;
		}
		else
		{
			return len;
		}
	}

	public static void Main(String[] args)
	{
		//int N,i;

		//scanf("%d",&N);
	   // for(i=1;i<=N;i++)
		//{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				s1 = tempVar.charAt(0);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s2 = tempVar2.charAt(0);
			}

		tangible.RefObject<String> tempRef_s1 = new tangible.RefObject<String>(s1);
			alen = str2bigint(tempRef_s1, a);
			s1 = tempRef_s1.argValue;

		tangible.RefObject<String> tempRef_s2 = new tangible.RefObject<String>(s2);
			blen = str2bigint(tempRef_s2, b);
			s2 = tempRef_s2.argValue;

			clen = add_bigint(a, alen, b, blen, c);
			print_int(c);
	//}
	}

}


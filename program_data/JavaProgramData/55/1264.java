package <missing>;

public class GlobalMembers
{
	public static int convert_1(char a)
	{
	   if (a >= '0' && a <= '9')
	   {
		   return a - '0';
	   }
	   if (a >= 'a' && a <= 'z')
	   {
		   return a - 'a' + 10;
	   }
	   if (a >= 'A' && a <= 'Z')
	   {
		   return a - 'A' + 10;
	   }
	}
	public static char convert_2(int a)
	{
		if (a < 10)
		{
			return a + '0';
		}
		 else
		 {
			 return a - 10 + 'A';
		 }
	}
	public static void convert(int a,int n)
	{
		if (a >= n)
		{
			convert(a / n, n);
		}
		System.out.printf("%c",convert_2(a % n));
	}
	public static int Main()
	{
		int a;
		int n = 0;
		int b;
		int k = 1;
		int i;
		String str = new String(new char[500]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			str = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		for (i = str.length() - 1;i >= 0;i--)
		{
			n += convert_1(str.charAt(i)) * k;
			k *= a;
		}
		convert(n, b);
		System.out.print("\n");
		return 0;
	}

}


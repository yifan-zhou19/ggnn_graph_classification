package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int k;
		int l;
		int n = 0;
		int a;
		int z;
		int A;
		int Z;
		int j = 0;
		int p = 0;
		String s = new String(new char[301]);
		s = new Scanner(System.in).nextLine();
		l = s.length();
		A = (int)'A';
		Z = (int)'Z';
		a = (int)'a';
		z = (int)'z';
		k = A;
		for (;k < Z + 1;k++)
		{
			for (i = 0;i < l;i++)
			{
				 if (k == (int)s.charAt(i))
				 {
					 n++;
				 }
			}
			if (n != 0)
			{
				System.out.printf("%c=%d\n",(char)k,n);
				j++;
			}
			n = 0;
		}
		k = a;
		for (;k < z + 1;k++)
		{
			for (i = 0;i < l;i++)
			{
				 if (k == (int)s.charAt(i))
				 {
					 n++;
				 }
			}
			if (n != 0)
			{
				System.out.printf("%c=%d\n",(char)k,n);
				p++;
			}
			n = 0;
		}
		if (j == 0 && p == 0)
		{
			System.out.print("No\n");
		}
	}


}

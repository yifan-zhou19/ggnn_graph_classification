package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int k;
		int p;
		int q;
		int l;
		int m;
		int n;
		String a = new String(new char[500]);
		 a = new Scanner(System.in).nextLine();
		l = a.length();
		for (k = 0;k < l - 1;k++)
		{
			if (a.charAt(k) == a.charAt(k + 1))
			{
				System.out.printf("%c%c\n",a.charAt(k),a.charAt(k + 1));
			}
		}
		  for (i = 2;i < l;i++)
		  {
			  for (k = 0;k < l;k++)
			  {
					p = k;
					q = i + k;
				m = p;
				n = q;
				while (a.charAt(p) == a.charAt(q) && p <= q)
				{
					p++;
				   q--;
				}
				   if (q - p < 1)
				   {
					   for (j = m;j < n;j++)
					   {
					   System.out.printf("%c",a.charAt(j));
					   }
					   System.out.printf("%c\n",a.charAt(n));
				   }
			  }
		  }

	}


}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1000]);
		String b = new String(new char[50]);
		String e = new String(new char[50]);
		int[] c = new int[1000];
		int[] d = new int[1000];
		int i;
		int n;
		int flag1 = 0;
		int j = 0;
		int m;
		int k;
		int x;
		int l;
		int flag2 = 0;
		int g;
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		e = new Scanner(System.in).nextLine();
		n = a.length();
		x = b.length();
		d[0] = 0;
		for (i = 0;i < n;i++)
		{
			if (a.charAt(i) == ' ' && flag1 == 0)
			{
				c[j] = i;
				d[j + 1] = i + 1;
				j++;
				flag1 = 1;
				m = i;
			}
			else
			{
				if (a.charAt(i) == ' ')
				{
				   c[j] = i - m - 1;
				   d[j + 1] = i + 1;
				   j++;
				   m = i;
				}
			}

		}
		c[j] = n - 1 - m;
		k = j + 1;
	   for (j = 0;j < k;j++)
	   {

		   if (c[j] == x)
		   {
			   g = 0;
			   for (l = d[j];l < d[j] + c[j];l++,g++)
			   {
					if (b.charAt(g) != a.charAt(l))
					{
						flag2 = 1;
					}
			   }
			   g = 0;
			   if (flag2 == 0)
			   {
					 if (j == 0)
					 {
						 System.out.printf("%s",e);
					 }
					 else
					 {
						 System.out.printf(" %s",e);
					 }
			   }
			   else
			   {
				   if (j == 0)
				   {
					 for (l = d[j];l < d[j] + c[j];l++)
					 {
						 System.out.printf("%c",a.charAt(l));
					 }
				   }
					 else
					 {
						 System.out.print(" ");
					   for (l = d[j];l < d[j] + c[j];l++)
					   {
						   System.out.printf("%c",a.charAt(l));
					   }
					 }
			   }
			   flag2 = 0;
		   }
		   else
		   {
			   if (j == 0)
			   {
					 for (l = d[j];l < d[j] + c[j];l++)
					 {
						 System.out.printf("%c",a.charAt(l));
					 }
			   }
					 else
					 {
						 System.out.print(" ");
					   for (l = d[j];l < d[j] + c[j];l++)
					   {
						   System.out.printf("%c",a.charAt(l));
					   }
					 }
		   }
	   }


		return 0;

	}
}

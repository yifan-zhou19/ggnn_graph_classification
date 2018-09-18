package <missing>;

public class GlobalMembers
{
	public static char zuida(String a)
	{
		char max;
		int i;
		int p = 0;
		max = a[0];
		for (i = 0; !a[i].equals('\0');i++)
		{
			if (a[i].compareTo(max) > 0)
			{
				max = a[i];
				p = i;
			}
		}



		return (p);

	}



	public static void Main()
	{
		String a = new String(new char[50]);
		String b = new String(new char[20]);
		int i;
		int t1;
		int t2;
		int m;

		while (scanf("%s%s",a,b) != EOF)
		{

		t1 = a.length();
		t2 = b.length();

		m = zuida(a);

	   for (i = 0;i < m + 1;i++)
	   {
		  System.out.printf("%c",a.charAt(i));
	   }
	   for (i = 0;i < t2;i++)
	   {
		  System.out.printf("%c",b.charAt(i));
	   }
	   for (i = m + 1;i < t1;i++)
	   {
		  System.out.printf("%c",a.charAt(i));
	   }
	   System.out.print("\n");
		}

	}

}

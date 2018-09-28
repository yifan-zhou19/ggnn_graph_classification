package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[10000]);
		int i;
		int a;
		int n;
		int b;
	a = 0;
	b = 0;
	str = new Scanner(System.in).nextLine();
	n = str.length();
	for (i = 0;i < n;i++)
	{
		if (str.charAt(i) == ' ')
		{
			b = 1;
		}
	}
	if (b == 1)
	{
	for (i = 0;str.charAt(i) != '\0';i++)
	{
		  if (str.charAt(i) != ' ')
		  {
		  a = a + 1;
		  }
		  else if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' '))
		  {
			  System.out.printf("%d,",a);
			  a = 0;
		  }
	}
	a = 0;
	for (i = n - 1;str.charAt(i) != ' ';i--)
	{
			a = a + 1;
	}
		System.out.printf("%d",a);
	}
	else if (b == 0)
	{
		System.out.printf("%d",n);
	}
		return 0;
	}

}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String a = new String(new char[500]);
	a = new Scanner(System.in).nextLine();
	int i;
	int j;
	int k;
	int b;
	int m;
	int n;
	for (j = 2;j <= a.length();j = j + 2)
	{
	   for (i = 0;i < a.length() - j + 1;i++)
	   {
		  b = 0;
		  m = i;
		  n = i + j - 1;
		  for (;m < n;m++,n--)
		  {
			if (a.charAt(m) != a.charAt(n))
			{
				b = 1;
			break;
			}

		  }
		  if (b == 0)
		  {
			for (k = i;k <= i + j - 1;k++)
			{
			System.out.printf("%c",a.charAt(k));
			}
			System.out.print('\n');
		  }
	   }
	}
	return 0;
	}
}

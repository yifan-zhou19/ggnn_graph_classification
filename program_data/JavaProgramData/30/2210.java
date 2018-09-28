package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int i;
	  int j = 0;
	  int k = 0;
	  int p = 0;
	  int q = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 1;i <= n;i++)
	{
	  j += i * i;
	}
	for (i = 1;i <= n;i++)
	{
	  if (i % 7 == 0)
	  {
		k += i * i;
	  }
	}
	for (i = 1;i <= n;i++)
	{
	  if (i / 10 == 7)
	  {
		p += i * i;
	  }
	}
	for (i = 1;i <= n;i++)
	{
	  if (i % 10 == 7)
	  {
		q += i * i;
	  }
	}
	if (n < 7)
	{
	System.out.printf("%d",j);
	}
	if (n<70 & n >= 7)
	{
	System.out.printf("%d",j - k - p - q + 7 * 7);
	}
	if (n >= 77)
	{
	System.out.printf("%d",j - k - p - q + 7 * 7 + 70 * 70 + 77 * 77 * 2);
	}
	if (n >= 70 && n < 77)
	{
	System.out.printf("%d",j - k - p - q + 7 * 7 + 70 * 70);
	}
	return 0;
	}

}


package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int[] a = new int[26];
	int i;
	int t = 0;
	char c;
	for (i = 0;i <= 25;i++)
	{
	  a[i] = 0;
	}
	while ((c = System.in.read()) != '\n')
	{
	for (i = 0;i <= 25;i++)
	{
	  if (c == ('a' + i))
	  {
		 a[i]++;
		 break;
	  }
	}
	}
	for (i = 0;i <= 25;i++)
	{
	  if (a[i] != 0)
	  {
		t++;
	  }
	}
	if (t == 0)
	{
	  System.out.print("No\n");
	}
	else
	{
	  for (i = 0;i <= 25;i++)
	  {
		if (a[i] != 0)
		{
		  System.out.printf("%c=%d\n",'a' + i,a[i]);
		}
	  }
	}
	}
}

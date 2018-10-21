package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String ch = new String(new char[1000]);
		int[] a = new int[50];
		ch = new Scanner(System.in).nextLine();
		int m;
		m = ch.length();
		int i;
		int j = 0;
		for (i = 0;i <= m - 1;i++)
		{
			if (ch.charAt(i) == ' ' || ch.charAt(i) == '\n')
			{
		j++;
			}
		else
		{
		a[j]++;
		}
		}
		int max = 0;
		int min = 100;
		int q;
		int p;
		for (i = 0;i <= j;i++)
		{
			if (max < a[i])
			{
			max = a[i];
		q = i;
			}
		if (min > a[i])
		{
			min = a[i];
		p = i;
		}
		}
	if (q == 0)
	{
		for (i = 0;ch.charAt(i) != ' ';i++)
		{
	System.out.printf("%c",ch.charAt(i));
		}
	System.out.print("\n");
	}
	else
	{
		int num = 0;

	for (i = 0;i <= m - 1;i++)
	{
		if (ch.charAt(i) == ' ')
		{
	  num++;
		}
	  else if (num == q)
	  {
	  System.out.printf("%c",ch.charAt(i));
	  }
	}
	  System.out.print("\n");





	}
	if (p == 0)
	{
		for (i = 0;ch.charAt(i) != ' ';i++)
		{
	System.out.printf("%c",ch.charAt(i));
		}
	System.out.print("\n");
	}
	else
	{
		int mum = 0;
	for (i = 0;i <= m - 1;i++)
	{
		if (ch.charAt(i) == ' ')
		{
	 mum++;
		}
	else if (mum == p)
	{
	System.out.printf("%c",ch.charAt(i));
	}
	if (mum == p + 1)
	{
		  System.out.print("\n");
	  break;
	}
	}
	}










	}

}

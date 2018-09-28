package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int[] a = new int[300];
		int j = 0;
		int t;
		int l;
		int k;
		String str = new String(new char[1500]);
		str = new Scanner(System.in).nextLine();
		l = str.length();
		for (i = 0;i <= l - 1;i++)
		{
			a[j] = 0;
			for (;i <= l - 1;i++)
			{
			if (str.charAt(i) == ',')
			{
				  break;
			}
			else
			{
				a[j] = str.charAt(i) - 48 + a[j] * 10;
			}
			}
		j++;
		}

		if (l == 1)
		{
			System.out.print("No");
		}
		else
		{
			for (i = 0;i <= j - 2;i++)
			{
			if (a[i] != a[i + 1])
			{
				break;
			}
			}
		if (i == j - 1)
		{
			System.out.print("No");
		}
	   else
	   {
		   for (i = 0;i <= j - 2;i++)
		   {
			 for (k = 0;k <= j - 2 - i;k++)
			 {
		   if (a[k] <= a[k + 1])
		   {
			   t = a[k];
			   a[k] = a[k + 1];
			   a[k + 1] = t;
		   }
			 }
		   }
		for (i = 0;i <= j - 2;i++)
		{
			if (a[i] != a[i + 1])
			{
				System.out.printf("%d",a[i + 1]);
			break;
			}
		}
	   }
		}

	}
}

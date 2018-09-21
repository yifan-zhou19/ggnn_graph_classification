package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i = 0;
		int j;
		int k = 0;
		int l;
		int[] a = new int[300];
		int temp;
		String b = new String(new char[500]);
		b = new Scanner(System.in).nextLine();
		while (b.charAt(i) != '\0')
		{
			if (b.charAt(i) == ',')
			{
				k = k + 1;
			}
			else
			{
				a[k] = a[k] * 10 + b.charAt(i) - '0';
			}
			i = i + 1;
		}
		l = 0;
		for (i = 1;i <= k;i++)
		{
			if (a[0] == a[i])
			{
				l = l + 1;
			}
		}
		if (l == k)
		{
			System.out.print("No");
		}
		else
		{
			if (k == 0)
			{
				System.out.print("No");
			}
			else
			{
			j = 0;
			}
			for (i = 1;i <= k;i++)
			{
				 if (a[j] < a[i])
				 {
					 j = i;
				 }
			}
			temp = a[k];
			a[k] = a[j];
			a[j] = temp;
			for (i = 0;i < k;i++)
			{
				if (a[i] == a[k])
				{
					a[i] = -1;
				}
			}
			   a[k] = -1;
			j = 0;
			for (i = 1;i <= k;i++)
			{
			   if (a[j] < a[i])
			   {
				   j = i;
			   }
			}
			System.out.printf("%d",a[j]);
		}
	}



}

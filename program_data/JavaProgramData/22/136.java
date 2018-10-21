package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[300];
		int i;
		int j;
		int k;
		int n = 0;
		int b;
		int x;
		String str = new String(new char[1202]);
		char[][] t = new char[300][5];
		str = new Scanner(System.in).nextLine();
		j = 0;
		k = 0;
		for (i = 0;str.charAt(i) != 0;i++)
		{
			if ((str.charAt(i) <= '9' && str.charAt(i) >= '0') && (str.charAt(i + 1) <= '9' && str.charAt(i + 1) >= '0'))
			{
				t[j][k] = str.charAt(i);
				k++;
			}
			if ((str.charAt(i) <= '9' && str.charAt(i) >= '0') && (str.charAt(i + 1) > '9' || str.charAt(i + 1) < '0'))
			{
				t[j][k] = str.charAt(i);
				k = 0;
				j++;
				n++;
				t[j][k + 1] = '\0';
			}
		}
		if (j == 1)
		{
			System.out.print("No\n");
		}
		else
		{


				for (i = 0;i < n;i++)
				{
					 sscanf(t[i], "%d", a[i]);
				}
				x = a[0];
				for (i = 0;i < n;i++)
				{
					if (a[i] != x)
					{
						break;
					}
				}
			if (i < n)
			{
				for (i = 1;i < n;i++)
				{
					for (j = 0;j < n - i;j++)
					{
						  if (a[j] < a[j + 1])
						  {
							b = a[j];
							a[j] = a[j + 1];
							 a[j + 1] = b;
						  }
					}
				}
				x = a[0];
				for (i = 0;i < n;i++)
				{
					if (a[i] != x)
					{
						break;
					}
				}
			 System.out.printf("%d\n",a[i]);
			}
			else
			{
				System.out.print("No\n");
			}
		}
	}
}

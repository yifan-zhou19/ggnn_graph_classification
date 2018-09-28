package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[3000]);
		int[] a = new int[300];
		int i = 0;
		int j;
		int flag = 0;
		int n;
		str = new Scanner(System.in).nextLine();
		for (i = 0;i < 300;i++)
		{
			a[i] = 0;
		}
		i = 0;
		for (j = -1;;)
		{
			j++;
			if (str.charAt(j) == '\0')
			{
				break;
			}
			else if (str.charAt(j) == ' ')
			{
				flag = 1;
			}
			else
			{
				if (flag == 0)
				{
					a[i]++;
				}
				else
				{
					i++;
				n = i;
				a[i]++;
				flag = 0;
				}

			}
		}
		if (j == 1)
		{
			System.out.printf("%d",a[0]);
		}
		else
		{
			System.out.printf("%d",a[0]);
			for (i = 1;i <= n;i++)
			{
			System.out.printf(",%d",a[i]);
			}
		}
	}

}

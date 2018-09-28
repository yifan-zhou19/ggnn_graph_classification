package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER NOTE: This was formerly a static local variable declaration (not allowed in Java):
private static int Main_j = 0;
	public static void Main(String[] args)
	{
		String str = new String(new char[30000]);
		int i;
		int n;
		int k;
		int flag = 0;
		int num = 0;
		int[] a = new int[300];
		str = new Scanner(System.in).nextLine();
		n = 0;
		i = 0;
		while (str.charAt(i) != '\0')
		{
			n++;
			i++;
		}
		for (i = 0;i < n;i++)
		{
			if (str.charAt(i) == ' ')
			{
				flag = 0;
			}
			else if (flag == 0)
			{
				flag = 1;
				num++;
			}
		}
		for (i = 0;i < num;i++)
		{
	//C++ TO JAVA CONVERTER NOTE: This static local variable declaration (not allowed in Java) has been moved just prior to the method:
	//		static int j=0;
			k = 0;
			for (;Main_j < n;Main_j++)
			{
				if (str.charAt(Main_j) == ' ')
				{
					continue;
				}
				else
				{
					k++;
					if (str.charAt(Main_j + 1) == ' ')
					{
						Main_j = Main_j + 1;
						break;
					}
				}
			}
			a[i] = k;
		}
		for (i = 0;i < num;i++)
		{
			if (i == num - 1)
			{
				System.out.printf("%d",a[i]);
			}
			else
			{
				System.out.printf("%d,",a[i]);
			}
		}

	}
}

package <missing>;

public class GlobalMembers
{
	public static int u = 0;
	public static void prin(String a, int l)
	{
		int i;
		int j;
		for (i = 0;i < l;i++)
		{
			if (a[i].equals('\0'))
			{
				continue;
			}
			for (j = i + 1;j < l;j++)
			{
				if (a[j].equals('\0'))
				{
					continue;
				}
				if (!a[j].equals(a[i]))
				{
					System.out.printf("%d %d\n",i,j);
					a[i] = '\0';
					a[j] = '\0';
					u++;
					break;
				}
				if (a[j].equals(a[i]))
				{
					break;
				}
			}
			if (!a[j].equals('\0'))
			{
				continue;
			}
			if (a[j].equals('\0'))
			{
				break;
			}
		}
		if (u != l / 2)
		{
			prin(a, l);
		}
	}




	public static void Main()
	{
		String a = new String(new char[100]);
		int l;
		a = new Scanner(System.in).nextLine();
		l = a.length();
		prin(a, l);
	}

}

package <missing>;

public class GlobalMembers
{
	public static char s(String a)
	{
		int i = 0;
		int j;
		while (!a[i].equals('\0'))
		{
			j = 0;
			while (!a[j].equals('\0'))
			{
				if (i != j && a[i].equals(a[j]))
				{
					break;
				}
				j++;
			}
			if (a[j].equals('\0'))
			{
				return (a[i]);
			}
			i++;
		}
		if (a[i].equals('\0'))
		{
			return ('N');
		}
	}
	public static void Main()
	{
		int n;
		int i;
		int[] a = new int[100000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			a = new Scanner(System.in).nextLine();
			if (s(a) == 'N')
			{
				System.out.print("no\n");
			}
			else
			{
				System.out.printf("%c\n",s(a));
			}
		}
	}
}


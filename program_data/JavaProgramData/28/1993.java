package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int j;
	int q;
	int k;
	int x;
	int m;
	int l;
	String a = new String(new char[30000]);
	int[] b = new int[10000];
	a = new Scanner(System.in).nextLine();
	j = 0;
	q = 0;
	l = a.length();
	for (int i = 0;i < l;i++)
	{
		if (a.charAt(i) == ' ')
		{
				b[j] = i - q;
				k = 0;
				for (int m = i + 1;m < l;m++)
				{
					if (a.charAt(m) == ' ')
					{
						k++;
					}
					else
					{
						break;
					}
				}

		i = i + k;
		q = i + 1;
		j++;
		}
	}
	for (int i = 0;i < j;i++)
	{
		System.out.printf("%d%c",b[i],',');
	}
	System.out.printf("%d",l - q);
	return 0;
	}
}

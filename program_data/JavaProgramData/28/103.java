package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[3000]);
		int[] l = new int[300];
		int i;
		int p;
		int k;
		int ch;
		int j;
		a = new Scanner(System.in).nextLine();
		ch = a.length();
		for (i = 0,j = 0,l[0] = 0;i < ch;i++)
		{
			if (a.charAt(i) != ' ')
			{
				l[j]++;
			}
			if (a.charAt(i) == ' ')
			{
				j++;
				l[j] = 0;
			}
		}
		p = j;
		for (i = 0,k = 0;i <= p;i++)
		{
			if (l[i] != 0)
			{
				k = i;
			}
		}
		for (i = 0;i < k;i++)
		{
			if (l[i] != 0)
			{
		System.out.printf("%d,",l[i]);
			}
		}
		System.out.printf("%d\n",l[k]);
	}

}

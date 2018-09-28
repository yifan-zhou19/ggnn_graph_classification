package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int k;
		int m;
		int n;
		int[] a = new int[100];
		String s = new String(new char[1000]);
		char c;
		s = new Scanner(System.in).nextLine();
		i = 0;
		for (k = 0;s.charAt(k) != '\0';k++)
		{
			if (s.charAt(k) != ' ')
			{
				a[i]++;
				if (s.charAt(k + 1) == ' ')
				{
				i++;
				}
			}
		}
		//printf("%d",i);
		m = i + 1;
		System.out.printf("%d",a[0]);
		for (i = 1;i < m;i++)
		{
			System.out.printf(",%d",a[i]);
		}

	}

}

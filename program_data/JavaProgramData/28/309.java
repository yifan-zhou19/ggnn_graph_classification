package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String c = new String(new char[1000]);
		String p;
		int i;
		int j;
		c = new Scanner(System.in).nextLine();
		p = c;
		int[] a = new int[1000];
		for (i = 0,j = 0; * (p.Substring(i)) != '\0';i++)
		{
			if (*(p.Substring(i)) != ' ')
			{

				a[j] = a[j] + 1;


			}
				if (*(p.Substring(i)) == ' ')
				{

					if (a[j] != 0)
					{
						j = j + 1;
					}

					continue;
				}
		}

		for (i = 0;i < j;i++)
		{
			System.out.printf("%d,",a[i]);
		}
		System.out.printf("%d",a[j]);


	}

}

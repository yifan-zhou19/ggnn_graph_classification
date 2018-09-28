package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int n = 0;
		int e = 0;
		int m;
		int[] b = new int[300];
		String a = new String(new char[3000]);
		a = new Scanner(System.in).nextLine();
		for (i = 0;i < 3000 && a.charAt(i) != '\0';i++)
		{
			if (a.charAt(i) == ' ')
			{
				e = 1;
				break;
			}
		}
		if (e == 0)
		{
			System.out.printf("%d",a.length());
		}
		if (e == 1)
		{
		for (i = 0;i < 3000;i++)
		{
			if (a.charAt(i) == '\0')
			{
				System.out.printf(",%d",i - k);
				break;
			}
			if (a.charAt(i) == ' ')
			{
				n++;
			if (n == 1)
			{
				System.out.printf("%d",i);
			}
			if (n > 1)
			{
				if (i - k > 0)
				{
					System.out.printf(",%d",i - k);
				}
			}

			for (j = i + 1;j < 3000 && a.charAt(j) != '\0';j++)
			{
					if (a.charAt(j) != ' ')
					{
						k = j;
						break;
					}
			}
			}
		}
		}

		return 0;
	}
//C++ TO JAVA CONVERTER NOTE: Access declarations are not available in Java:
	//		;
}

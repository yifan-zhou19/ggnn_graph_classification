package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[300]);
		int i;
		int time = 0;
		int j;
		int n;
		int m = 0;
		a = new Scanner(System.in).nextLine();
		for (i = 65;i <= 90;i++)
		{
			for (j = 0;a.charAt(j) != '\0';j++)
			{
				n = a.charAt(j);
				if (n == i)
				{
					time++;
				}
			}
			if (time > 0)
			{
				System.out.printf("%c=%d\n",i,time);
				m++;
			}
			time = 0;
		}
		for (i = 97;i <= 122;i++)
		{
			for (j = 0;a.charAt(j) != '\0';j++)
			{
				n = a.charAt(j);
				if (n == i)
				{
					time++;
				}
			}
			if (time > 0)
			{
				System.out.printf("%c=%d\n",i,time);
				m++;
			}
			time = 0;
		}
		if (m == 0)
		{
			System.out.print("No\n");
		}
		return 0;
	}






}

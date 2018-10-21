package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		int t;
		int g;
		a = new Scanner(System.in).nextLine();
		int i = 0;
		int temp = 0;
		while (a.charAt(i) != 0)
		{
			i++;
		}
		g = i - 1;
		while (a.charAt(g) == ' ')
		{
			i--;
			g--;
		}
		a = a.substring(0, i);
		i = 0;

		while (a.charAt(i) != 0)
		{

			if (a.charAt(i) == ' ')
			{
				  if (temp == 0)
				  {
					System.out.print(a.charAt(i));
				  }
				temp = 1;
			}
			else
			{
				System.out.print(a.charAt(i));
				temp = 0;
			}
			i++;

		}
		return 0;
	}
}

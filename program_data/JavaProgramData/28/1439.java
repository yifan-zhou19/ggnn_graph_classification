package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String s = new String(new char[1000]);
		  int j = 0;
		  int[] g = new int[300];
		  int i;
		  int len;
		  s = new Scanner(System.in).nextLine();
		  len = s.length();

		  for (i = 0;i < len;i++)
		  {
			if (s.charAt(i) == ' ' && s.charAt(i + 1) != ' ')
			{
			   j += 1;
			}
			if (s.charAt(i) != ' ')
			{
			   g[j] += 1;
			}
		  }
		for (i = 0;i < 300;i++)
		{
			if (g[i + 1] != 0)
			{
			   System.out.printf("%d,",g[i]);
			}
			else
			{
			   System.out.printf("%d",g[i]);
			   break;
			}
		}

					return 0;

	}



}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s1 = new String(new char[100]);
		char[][] p = new char[50][100];
		s1 = new Scanner(System.in).nextLine();
		s1 += " ";
		int len;
		int i;
		int j;
		int n = 0;
		int y;
		len = s1.length();
		for (i = 0;i < len;i++)
		{
			if (s1.charAt(i) == ' ')
			{
				n++;
			}
		}
		int t = 0;
		for (y = 0;y < n;y++)
		{
		   for (i = t,j = 0;i < len;i++,j++)
		   {
			  if (s1.charAt(i) != ' ')
			  {
				 p[y][j] = s1.charAt(i);
			  }
			  else
			  {
				   p[y][j] = '\0';
				   t = i + 1;
				   break;
			  }
		   }
		}
		int max = 0;
		int min = 0;
		for (i = 0;i < n;i++)
		{
			if (String.valueOf(p[i]).length() > String.valueOf(p[max]).length())
			{
				max = i;
			}
			if (String.valueOf(p[i]).length() < String.valueOf(p[min]).length())
			{
				min = i;
			}
		}
		System.out.printf("%s\n%s",p[max],p[min]);
		return 0;
	}

}

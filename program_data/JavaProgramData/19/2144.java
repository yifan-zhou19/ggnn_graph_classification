package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   String s = new String(new char[101]);
	   char[][] str = new char[200][20];
	   String rep = new String(new char[20]);
	   String sub = new String(new char[20]);
	   int i;
	   int sum = 0;
	   int a = 0;
	   int b = 0;
	   int max = 0;
	   int min = 0;
	   s = new Scanner(System.in).nextLine();
	   sub = new Scanner(System.in).nextLine();
	   rep = new Scanner(System.in).nextLine();
	   for (i = 0;s.charAt(i) != '\0';i++)
	   {
			if (s.charAt(i) == ' ')
			{
				str[a][b] = '\0';
				a++;
				b = 0;
				sum++;
			}
			else
			{
				str[a][b] = s.charAt(i);
				 b++;
			}
	   }

		str[a][b] = '\0';
			for (a = 0;a <= sum;a++)
			{
				if (strcmp(str[a],sub) == 0)
				{
				   str[a] = rep;
				}
				else
				{
				   continue;
				}
			}
			for (a = 0;a < sum;a++)
			{
				System.out.printf("%s ",str[a]);
			}
			System.out.printf("%s",str[sum]);
	return 0;
	}

}

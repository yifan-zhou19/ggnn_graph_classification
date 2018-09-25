package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[] str = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		char[] substr = {0, '\0', '\0'};
		char[][] string =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		char max;
		int i;
		int x;
		int d;
		int j;
		j = 0;

		 while (true)
		 {
			 str = new Scanner(System.in).nextLine();

			d = str.length();
	if (d == 0)
	{
		break;
	}
				  for (i = 0;i < d;i++)
				  {
				if (str[i] == ' ')
				{
					break;
				}
				  }
				for (x = i + 1;x <= i + 4;x++)
				{
					substr[x - i - 1] = str[x];
				}
				str[i] = '\0';
				d = d - 3;
			max = str[0];
			x = 0;
			for (i = 0;str[i] != '\0';i++)
			{
			   if (str[i] > max)
			   {
					max = str[i];
					 x = i;
			   }
			}
			 for (i = d - 1;i > x;i--)
			 {
				 str[i + 3] = str[i];
			 }
			for (i = x + 1;i < x + 4;i++)
			{
				str[i] = substr[i - x - 1];
			}
			String[j] = str;
			String[j][d + 3] = '\0';
			j = j + 1;
			 for (i = 0;i < 13;i++)
			 {
				 str[i] = 0;
				 substr[i] = 0;
			 }

		 }
	d = j;
			for (i = j;i < 500;i++)
			{
		String[i][0] = '\0';
			}
	 for (i = 0;i < d;i++)
	 {
		 System.out.printf("%s\n",string[i]);
	 }
	}




}

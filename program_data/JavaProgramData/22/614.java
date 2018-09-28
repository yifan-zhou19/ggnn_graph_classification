package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[350]);
		char[][] x = new char[400][20];
		String temp = new String(new char[350]);
		int n;
		int i = 0;
		int j = 0;
		int k;
		int l;
		int h = 0;
		str = new Scanner(System.in).nextLine();
		n = str.length();
		while (i < n)
		{
			if (str.charAt(i) > '0' && str.charAt(i) <= '9')
			{
				k = 0;
				while (str.charAt(i) >= '0' && str.charAt(i) <= '9')
				{
						x[j][k] = str.charAt(i);
						i++;
						 k++;
				}
				x[j][k] = '\0';
				j++;
			}
			else
			{
				i++;
			}
		}
		if (j > 1)
		{
		  for (i = 0;i < j;i++)
		  {
			for (l = 0;l < j - i - 1;l++)
			{
				if (String.valueOf(x[l]).length() == String.valueOf(x[l + 1]).length() && strcmp(x[l],x[l + 1]) > 0)
				{
					temp = x[l];
					x[l] = x[l + 1];
					x[l + 1] = temp;
				}
				else if (String.valueOf(x[l]).length() > String.valueOf(x[l + 1]).length())
				{
					temp = x[l];
					x[l] = x[l + 1];
					x[l + 1] = temp;
				}
			}
		  }
		  for (i = j - 1;i > 0;i--)
		  {
			  if (strcmp(x[i],x[i - 1]))
			  {
				  System.out.printf("%s\n",x[i - 1]);
				  h += 1;
				  break;
			  }
		  }
		  if (i = 1 && h == 0)
		  {
			  System.out.print("No\n");
		  }
		}
		else
		{
			System.out.print("No\n");
		}


	}
}

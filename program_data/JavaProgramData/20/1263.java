package <missing>;

public class GlobalMembers
{
	public static char maxASCII(tangible.RefObject<String> str)
	{
		 int len = str.argValue.length();
		 int i;
		 int j = 0;
		 for (i = 0; i < len; i++)
		 {
				  if (str.argValue.charAt(i) > j)
				  {
					  j = str.argValue.charAt(i);
				  }
		 }
		 return j;
	}
	public static int maxlocate(String string, char maxx)
	{
		 int x;
		 for (x = 0; x < String.length(); x++)
		 {
				  if (String[x] == maxx)
				  {
							   return x;
				  }
		 }
	}

	public static int Main(String[] args)
	{
		char[][] str = new char[100][10];
		char[][] substr = new char[100][4];
		int max;
		int rank;
		int i;
		int j;
		j = 0;
		while (scanf("%s%s",str[j],substr[j]) != EOF)
		{
			j++;
		}
		for (i = 0; i < j; i++)
		{


				max = maxASCII(str[i]);
				rank = maxlocate(str[i], max);
				int a;
				for (a = 0; a <= rank; a++)
				{
						 System.out.print(str[i][a]);
				}
				System.out.print(substr[i]);
				for (a = rank + 1; a < String.valueOf(str[i]).length(); a++)
				{
					   System.out.print(str[i][a]);
				}
				System.out.print("\n");
		}

		return EXIT_SUCCESS;
	}

}


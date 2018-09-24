package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String[] str = new String[1024];
		int n = 0;
		int i;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
		str[0] = (String)calloc(101,(Character.SIZE / Byte.SIZE));
		while (scanf("%s",str[n]) != EOF)
		{
			n = n + 1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
			str[n] = (String)calloc(101,(Character.SIZE / Byte.SIZE));
		}
		for (i = 0;i < n - 3;i++)
		{
			if (strcmp(str[i],str[n - 2]) == 0)
			{
				System.out.printf("%s ",str[n - 1]);
			}
			else
			{
				System.out.printf("%s ",str[i]);
			}
		}
		if (strcmp(str[i],str[n - 2]) == 0)
		{
			System.out.printf("%s",str[n - 1]);
		}
		else
		{
			System.out.printf("%s",str[i]);
		}
	}

}

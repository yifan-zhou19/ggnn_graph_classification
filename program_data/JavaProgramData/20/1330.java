package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s1 = new String(new char[MAX]);
		String s2 = new String(new char[MAX]);
		int i;
		int j;
		int max;
		while (scanf("%s%s",s1,s2) != EOF)
		{
			max = 0;
			i = 1;
			while (s1.charAt(i) != '\0')
			{
				if (s1.charAt(max) < s1.charAt(i))
				{
					max = i;
				}
				i++;
			}
		i = 0;
		while (i <= max)
		{
			System.out.print(s1.charAt(i));
			i++;
		}
		j = 0;
		while (s2.charAt(j) != '\0')
		{
			System.out.print(s2.charAt(j));
			j++;
		}
		while (s1.charAt(i) != '\0')
		{
			System.out.print(s1.charAt(i));
			i++;
		}
		System.out.print("\n");
		}
	  return 0;
	}


}

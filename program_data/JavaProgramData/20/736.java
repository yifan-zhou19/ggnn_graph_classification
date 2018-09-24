package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String s1 = "";
		char[][] s2 = new char[100][4];
		int i = 0;
		int j;
		int max;
		int k;
		int u;
			 while (scanf("%s%s\n", s1.charAt(i), s2[i]) != EOF)
			 {
				 i++;
			 }
		for (j = 0;j <= i;j++)
		{
			max = 0;
			k = 1;
			while (s1.charAt(j)[k] != '\0')
			{
				if (s1.charAt(j)[k] > s1.charAt(j)[max])
				{
					max = k;
				}
				k++;
			}
			for (u = k - 1;u > max;u--)
			{
				s1.charAt(j)[u + 3] = s1.charAt(j)[u];
			}
			s1.charAt(j)[max + 1] = s2[j][0];
			s1.charAt(j)[max + 2] = s2[j][1];
			s1.charAt(j)[max + 3] = s2[j][2];
			s1.charAt(j)[k + 3] = '\n';
			System.out.printf("%s",s1.charAt(j));
		}
	}

}

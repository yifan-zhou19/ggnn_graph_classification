package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s1 = new String(new char[11]);
		String s2 = new String(new char[4]);
		int i;
		int j;
		int n;
		int b;
		while (scanf("%s%s",s1,s2) != EOF)
		{
			n = s1.length() - 1;
			j = 0;
			b = s1.charAt(0);
			for (i = 0;i <= n - 1;i++)
			{
				if (b < s1.charAt(i))
				{
					j = i;
					b = s1.charAt(i);
				}
			} //printf("%d",j);
	//		printf("%d\n",j);
			for (i = 0;i <= j;i++)
			{
				System.out.printf("%c",s1.charAt(i));
			}
			System.out.printf("%s",s2);
			while (j < n)
			{
				System.out.printf("%c",s1.charAt(j + 1));
				j++;
			}
					System.out.print("\n");
	//		printf("%c",s1[j+1]);
	/*		for (i=j+1;i<=n;j++)
			{
				printf("%c",s1[i]);
			}*/


		}
	}
}

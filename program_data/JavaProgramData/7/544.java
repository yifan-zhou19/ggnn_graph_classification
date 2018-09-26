package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k = 1;
		int t;
		String s1 = new String(new char[256]);
		String s2 = new String(new char[256]);
		String s3 = new String(new char[256]);
		s1 = new Scanner(System.in).nextLine();
		s2 = new Scanner(System.in).nextLine();
		s3 = new Scanner(System.in).nextLine();
		for (i = 0;s1.charAt(i) != '\0';i++)
		{
			if (s1.charAt(i) == s2.charAt(0))
			{
				for (j = 1;s2.charAt(j) != '\0';j++)
				{
					if (s2.charAt(j) == s1.charAt(i + j))
					{
						k++;
					}
				}
				if (s2.charAt(k) == '\0')
				{
					for (t = 0;t < i;t++)
					{
						System.out.printf("%c",s1.charAt(t));
					}
					for (t = 0;t < k;t++)
					{
						System.out.printf("%c",s3.charAt(t));
					}
					for (t = i + k;s1.charAt(t) != '\0';t++)
					{
						System.out.printf("%c",s1.charAt(t));
					}
					System.out.print("\n");
					break;
				}
			}
		}
		if (s2.charAt(k) != '\0')
		{
			System.out.printf("%s\n",s1);
		}
		return 0;
	}


}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int sum = 0;
		int[] sz = new int[1000];
		int i;
		int j;
		int k;
		String s1 = new String(new char[10000]);
		s1 = new Scanner(System.in).nextLine();
		for (i = 0;i < s1.length();i++)
		{
			if (i == 0)
			{

				for (j = 0;s1.charAt(i + j) != ' ' && s1.charAt(i + j) != '\0';j++)
				{
					sz[sum]++;
				}
				sum++;
			}
			else
			{
				if (s1.charAt(i) != ' ' && s1.charAt(i - 1) == ' ')
				{

					for (j = 0;s1.charAt(i + j) != ' ' && s1.charAt(i + j) != '\0';j++)
					{
						sz[sum]++;
					}
					sum++;
				}
			}
		}

		for (i = 0;i < sum;i++)
		{
			if (i != 0)
			{
				System.out.print(",");
			}
			System.out.printf("%d",sz[i]);
		}






			return 0;
	}





}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[100]);
		int[] chars = new int[20];
		int[] loci = new int[20];
		int i;
		int j = 0;
		int max;
		int maxi;
		int min;
		int mini;
		int preword = 0;
		int word = 0;
		s = new Scanner(System.in).nextLine();
		for (i = 0;i <= s.length();i++)
		{
			if (preword != 0)
			{
				if (Character.isLetter(s.charAt(i)))
				{
						word = 1;
						chars[j]++;
						preword = 1;
				}
				else
				{
					word = 0;
					preword = 0;
					j++;
				}
			}
			else
			{
				if (Character.isLetter(s.charAt(i)))
				{
					word = 1;
					chars[j]++;
					loci[j] = i;
					preword = 1;
				}
				else
				{
					word = 0;
					preword = 0;
				}
			}
		}
		max = chars[0];
		maxi = 0;
		for (i = 0;i < j;i++)
		{

			if (max < chars[i])
			{
				max = chars[i];
				maxi = i;
			}
		}
		min = chars[0];
		mini = 0;
		for (i = 0;i < j;i++)
		{

			if (min > chars[i])
			{
				min = chars[i];
				mini = i;
			}
		}
		for (i = loci[maxi];i < loci[maxi] + max;i++)
		{
			System.out.printf("%c",s.charAt(i));
		}
		System.out.print("\n");
		for (i = loci[mini];i < loci[mini] + min;i++)
		{
			System.out.printf("%c",s.charAt(i));
		}
		System.out.print("\n");
		return 0;
	}

}

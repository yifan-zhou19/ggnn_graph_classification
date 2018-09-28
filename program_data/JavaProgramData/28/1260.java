package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[3000]);
		int[] n = new int[300];
		int i;
		int j = 0;
		int k = 1;
		str = new Scanner(System.in).nextLine();

		for (i = 1;str.charAt(i) != '\0';i++)
		{
		  if (str.charAt(i) != ' ' && str.charAt(i - 1) == ' ')
		  {
			 k++;
		  }
		}

		for (i = 0;str.charAt(i) != '\0';i++)
		{
			if (str.charAt(i) != ' ')
			{
				n[j]++;
			}
			if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ')
			{
				j++;
			}
		}

		for (j = 0;j < k - 1;j++)
		{
		   System.out.printf("%d,",n[j]);
		}
		System.out.printf("%d",n[k - 1]);
		return 0;
	}

}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String smin = new String(new char[p]);
		String smax = new String(new char[p]);
		String ch = new String(new char[p]);
		String temp = new String(new char[p]);
		int max = 0;
		int min = p;
		int sum;
		int i;
		int j;
		int n;

		ch = new Scanner(System.in).nextLine();
		n = ch.length();
		sum = 0;
		for (i = 0;i <= n;i++)
		{
		  if ((ch.charAt(i) == ' ') || (ch.charAt(i) == ',') || (i == n))
		  {
			if ((sum < min) && (sum>0))
			{
				smin = temp;
				min = sum;
			}
			if (sum > max)
			{
				smax = temp;
				max = sum;
			}
			sum = 0;
		  }
		  else
		  {
			  sum++;
			  temp = tangible.StringFunctions.changeCharacter(temp, sum - 1, ch.charAt(i));
		  }
		}

		for (j = 0;j < max;j++)
		{
			System.out.printf("%c",smax.charAt(j));
		}
		System.out.print("\n");
		for (j = 0;j < min;j++)
		{
			System.out.printf("%c",smin.charAt(j));
		}
		return 0;
	}
}


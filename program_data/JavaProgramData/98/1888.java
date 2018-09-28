package <missing>;

public class GlobalMembers
{
	//************************************
	//??:????
	//??:2013.12.20
	//************************************
	public static int Main()
	{
		int n = 0;
		int i = 0;
		int[] b = new int[50];
		int l = 0;
		int sum = 0;
		int j = 0;
		int k = 0;
		int sum2 = 0;
		String a = new String(new char[10000]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		a = new Scanner(System.in).nextLine();
		for (i = 0;i < a.length();i++)
		{
			if (a.charAt(i) != ' ')
			{
				l++;
			}
			else
			{
				sum = sum + l;
				if (sum > 80)
				{
					b[j] = sum - l - 1;
					j++;
					sum = l + 1;
				}
				else if (sum == 80)
				{
					b[j] = sum;
					j++;
					sum = 0;
				}
				else
				{
					   sum = sum + 1;
				}
				l = 0;
			}
		}
		b[j] = sum + l;
		j = 0;
		for (i = 0;i < a.length();i++)
		{
			System.out.print(a.charAt(i));
			sum2++;
			if (sum2 == b[j])
			{
				System.out.print("\n");
				i++;
				j++;
				sum2 = 0;
			}
		}
		return 0;
	}
}


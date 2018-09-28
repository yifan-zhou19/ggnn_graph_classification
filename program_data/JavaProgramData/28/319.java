package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String ch = new String(new char[1000000]);
		void f(char * p,int n);
			int m;
		ch = new Scanner(System.in).nextLine();
		m = ch.length();
	tangible.RefObject<String> tempRef_ch = new tangible.RefObject<String>(ch);
		f(tempRef_ch, m);
		ch = tempRef_ch.argValue;

	}
	public static void f(tangible.RefObject<String> p, int n)
	{
		int i;
		int j;
		int k = 0;
		j = 0;
		for (i = 0;i < n;i++)
		{

			if (*(p.argValue.Substring(i)) != ' ')
			{
				j++;
			}

			else
			{
				if (j != 0)
				{
				System.out.printf("%d,",j);
				}
				j = 0;
			}

		}
		for (i = n - 1;i > -1;i--)
		{
			if (*(p.argValue.Substring(i)) != ' ')
			{
				k++;
			}
			else
			{
				break;
			}
		}
			if (k != 0)
			{
			System.out.printf("%d",k);
			}


	}
}


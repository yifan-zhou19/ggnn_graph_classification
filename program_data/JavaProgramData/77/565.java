package <missing>;

public class GlobalMembers
{
	public static String str = new String(new char[200 + 1]);
	public static int length;
	public static int sum;
	public static int i;
	public static int[] flag = new int[100 + 1];
	public static char p;
	public static char q;

	public static void f(String s, int k)
	{
		if (k <= sum)
		{
			for (i = flag[k] ; i >= 0 ; i--)
			{
				if (s[i].equals(p))
				{
					System.out.printf("%d %d\n",i,flag[k]);
					s[i] = '\0';
					s[flag[k]] = '\0';
					break;
				}
			}
			f(s, k + 1);
		}
		else
		{
			return;
		}
	}

	public static int Main()
	{
		int j;
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);

		length = str.length();
		p = str.charAt(0);
		q = str.charAt(length - 1);
		j = 0;
		for (i = 1 ;i <= length - 1 ; i++)
		{
			if (str.charAt(i) == q)
			{
				j++;
				flag[j] = i;
			}
		}
		sum = j;
		f(str, 1);
		return 0;
	}


















}


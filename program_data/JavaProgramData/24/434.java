package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[500]);
		char[][] a = new char[50][20];
		int i;
		int len;
		int j = 0;
		int k;
		int max;
		int min;
		s = new Scanner(System.in).nextLine();
		len = s.length();
		for (i = 0;i < 50;i++)
		{
			for (k = 0;k < 20;k++)
			{
				a[i][k] = 0;
			}
		}
		k = 0;
		for (i = 0;i < len;i++)
		{
			if (s.charAt(i) != ' ')
			{
				a[j][k] = s.charAt(i);
				k++;
			}
			else
			{
				k = 0;
				j++;
			}
		}
		max = String.valueOf(a[0]).length();
		min = max;
		for (i = 1;i <= j;i++)
		{
			if (max < (String.valueOf(a[i]).length()))
			{
				max = String.valueOf(a[i]).length();
			}
			else if (min > String.valueOf(a[i]).length())
			{
				min = String.valueOf(a[i]).length();
			}
		}
		for (i = 0;i <= j;i++)
		{
			if (String.valueOf(a[i]).length() == max)
			{
				System.out.println(a[i]);
				break;
			}
		}
		for (i = 0;i <= j;i++)
		{
			if (String.valueOf(a[i]).length() == min)
			{
				System.out.println(a[i]);
				break;
			}
		}
	}





}

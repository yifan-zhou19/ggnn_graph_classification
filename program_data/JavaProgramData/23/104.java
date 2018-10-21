package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String string = new String(new char[100]);
		int i;
		int k = 0;
		int j = 0;
		int n = 0;
		int[] a = new int[100];
		String = new Scanner(System.in).nextLine();
		for (i = 0;i < 100;i++)
		{
			if (String[i] != '\0')
			{
				n++;
			}
		else
		{
			break;
		}
		}
		for (i = n - 1;i >= 0;i--)
		{
			if (String[i] != ' ')
			{
				a[k]++;
			}
			else
			{
				k++;
			}
		}


		for (j = 0;j < k;j++)
		{
			for (i = n - a[j];i < n;i++)
			{
				System.out.printf("%c",string.charAt(i));
			}
			n = n - a[j] - 1;
			System.out.print(" ");
		}
		for (i = n - a[j];i < n;i++)
		{
				System.out.printf("%c",string.charAt(i));
		}


	}
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[10000]);
		int i;
		int j;
		int k;
		int p;
		int n;
		a = new Scanner(System.in).nextLine();
		n = a.length();
		int[] b = new int[300];
		for (i = 0;i < 300;i++)
		{
			b[i] = 0;
		}
		j = 0;
		p = 0;
		for (i = 0;i < n;i++)
		{

			if (a.charAt(i) != ' ')
			{
				p = 1;
				b[j]++;
			}
			if (a.charAt(i) == ' ' && p != 0)
			{
				j++;
				p = 0;
			}
		}
		System.out.printf("%d",b[0]);
		for (i = 1;i < 300;i++)
		{
			if (b[i] != 0)
			{
				System.out.printf(",%d",b[i]);
			}
		}
	}







}

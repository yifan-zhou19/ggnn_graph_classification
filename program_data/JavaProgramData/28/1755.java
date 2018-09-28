package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[30000]);
		char[][] b = new char[300][100];
		int lenth;
		int i;
		int n = 0;
		int k = 0;
		int[] shuzu = new int[300];
		a = new Scanner(System.in).nextLine();
		lenth = a.length();
		for (i = 0;i < lenth;i++)
		{
			if (a.charAt(i) != ' ')
			{
				b[n][k] = a.charAt(i);
				k++;
			}
			if (a.charAt(i) == ' ' && a.charAt(i + 1) != ' ')
			{
				n++;
				k = 0;
			}
		}
		n++;
		for (i = 0;i < n;i++)
		{
			shuzu[i] = String.valueOf(b[i]).length();
		}
		System.out.printf("%d",shuzu[0]);
		for (i = 1;i < n;i++)
		{
			System.out.printf(",%d",shuzu[i]);
		}
		return 0;
	}

}

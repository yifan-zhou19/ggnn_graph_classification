package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String A = new String(new char[1000]);
		int[] B = new int[100];
		A = new Scanner(System.in).nextLine();
		int i = 0;
		int j = 0;
		int l;
		int k;
		l = A.length();
		for (k = 0;k <= l;k++)
		{
			if (A.charAt(k) == ' ' || A.charAt(k) == '\0')
			{
				B[j] = i;
				j++;
				i = 0;
				continue;
			}
			i++;
		}
		l = j;
		for (j = 0;j < (l - 1);j++)
		{
			if (B[j] == 0)
			{
				continue;
			}
			else
			{
				System.out.printf("%d,",B[j]);
			}
		}
		System.out.printf("%d",B[l - 1]);
	}
}

package <missing>;

public class GlobalMembers
{
	public static int wordsnumber(String a)
	{
		int i = 0;
		int num;
		for (; !a[i].equals('\0');i++)
		{
			num = i;
		}
		num = num + 1;
		return (num);
	}

	public static void Main()
	{
		final String A = "";
		final String B = "";
		int numA;
		int i;
		int t;
		int j;
		int count;
		int[] num = new int[300];
		A = new Scanner(System.in).nextLine();
		numA = wordsnumber(A);
		for (i = 0,t = 0,j = 0;i < numA;i++)
		{
			if (A.charAt(i) != ' ')
			{
				B.charAt(t)[j] = A.charAt(i);
				j = j + 1;
			}
			else
			{
				t = t + 1;
				j = 0;
			}
		}
		for (i = 0,count = 0;i < t + 1;i++)
		{
			if (B.charAt(i)[0] == '\0')
			{
				continue;
			}
			count = count + 1;
			num[i] = wordsnumber(B.charAt(i));

			if (count == 1)
			{
				System.out.printf("%d",num[i]);
			}
			else
			{
				System.out.printf(",%d",num[i]);
			}
		}
		System.out.print("\n");
	}

}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] num = new int[101];
		int i;
		int j;
		int[] num2 = new int[101];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			num[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			num2[n - i - 1] = num[i]; //???D???��
		}
			 System.out.print(num2[0]);
			 for (i = 1;i < n;i++)
			 {
				 System.out.print(" ");
				 System.out.print(num2[i]);
			 }
		return 0;
	}

}


package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] num = new int[300];
		int n = 0;
		int i;
		int j;
		int t;
		int flag = 0;
	 char c;
	 do
	 {
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num[n++] = Integer.parseInt(tempVar);
		}
	 }while (c = System.in.read() != '\n');

	 if (n == 1)
	 {
		 System.out.print("No");
	 }
	 else
	 {
		 for (i = 0;i < n - 1;i++)
		 {
			for (j = 0;j < n - i - 1;j++)
			{
				if (num[j] < num[j + 1])
				{
					t = num[j];
					num[j] = num[j + 1];
					num[j + 1] = t;
				}
			}
		 }

	 for (i = 1;i < n;i++)
	 {
		if (num[i] < num[0])
		{
			flag = 1;
			System.out.printf("%d",num[i]);
			break;
		}
	 }
	 if (flag == 0)
	 {
		 System.out.print("No");
	 }
	 }

	}

}


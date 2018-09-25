package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int count = new int(int facevalue,int sum,int n);
		int n;
		int sum = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] facevalue = {100, 50, 20, 10, 5, 1};
		int[] num = new int[6];
		for (int i = 0;i < 6;i++)
		{
			num[i] = count(facevalue[i], sum, n);
			System.out.print(num[i]);
			System.out.print("\n");
			sum += num[i] * facevalue[i];
		}
		return 0;
	}

	/*-----?????????-----*/
	public static int count(int facevalue,int sum,int n)
	{
		for (int i = 0;;)
		{
			if ((i + 1) * facevalue + sum <= n)
			{
				i++;
			}
			else
			{
				return i;
			}
		}
	}
}


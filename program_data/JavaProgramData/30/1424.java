package <missing>;

public class GlobalMembers
{
	//*************************************
	//*?????7??????
	//*?????? ?? 1200012904
	//*???20121008
	//************************************
	public static int Main()
	{
		int n;
		int a;
		int b;
		int c;
		int i;
		int sum = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			a = i % 7;
			b = i - 7;
			c = b % 10;
			if (a == 0)
			{
				sum = sum; //??i???7?????i
			}
			else if (i >= 70 && i <= 79)
			{
				sum = sum; //??i?????7?????i
			}
			else if (c == 0)
			{
				sum = sum; //??i?????7?????i
			}
			else
			{
				sum = sum + i * i; //?????i??7??
			}
		}
		System.out.print(sum);
		System.out.print("\n");
		return 0;
	}
}


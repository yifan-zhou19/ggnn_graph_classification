package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = {3, 5, 7}; //????357
		if (n % 3 == 0 && n % 7 == 0 && n % 5 == 0) //????3?5?7???????3 5 7??????????)
		{
			System.out.print("3 5 7");
		}
		else if (!(n % 3 == 0 || n % 7 == 0 || n % 5 == 0))
		{
			System.out.print("n");
		}
		else //???????????????3 5?? 3 7??5 7,???????
		{
			int k = 0;
			int[] b = new int[2];
			for (int i = 0;i < 3;i++)
			{
				if (n % a[i] == 0)
				{
					b[k] = a[i];
				k = k + 1;
				}
			}
			for (int j = 0;j < k;j++)
			{
				if (j == k - 1)
				{
					System.out.print(b[j]);
				}
				else
				{
					System.out.print(b[j]);
					System.out.print(" ");
				}
			}
		}
		return 0;
	}
}


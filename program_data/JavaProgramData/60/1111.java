package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int sushu = int k;
		int n;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n < 5)
		{
			System.out.print("empty");
			System.out.print("\n");
		}
		else
		{
			for (i = 2;i < n - 1;i++)
			{
				 if (sushu(i) == 1 && sushu(i + 2) == 1)
				 {
					   System.out.print(i);
					   System.out.print(' ');
					   System.out.print(i + 2);
					   System.out.print("\n");
				 }
			}
		}
		return 0;
	}

	public static int sushu(int k)
	{
		int t;
		int j;
		int l = 0;
		if (k > 2)
		{
			for (j = 2;j < k;j++)
			{
				 if (k % j == 0)
				 {
					  l++;
				 }
				 else
				 {
					  l = l;
				 }
			}
		}
		else if (k == 1 || k == 2)
		{
			l = 0;
		}
		if (l == 0)
		{
			t = 1;
		}
		else
		{
			t = 0;
		}
		return (t);
	}







}


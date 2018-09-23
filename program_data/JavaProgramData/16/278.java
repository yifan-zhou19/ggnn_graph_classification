package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int temp;
		int p;
		int q;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		temp = a;
		if (a != 0)
		{
			while (temp % 10 - temp != 0 || (temp % 10 - temp == 0 && q >= 10))
			{
			p = temp % 10;
			System.out.printf("%d",p);
			q = temp;
			temp = temp / 10;
			}
		}
		else
		{
			System.out.print("0");
		}
		System.out.print("\n");
	}
}


package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String in = new String(new char[101]);
		int[] shan = new int[100];
		int a = 0;
		int yu = 0;
		int n = 0;
		in = ConsoleInput.readToWhiteSpace(true).charAt(0);
		if (in.length() == 1 || (in.length() == 2 && in.charAt(0) == '1' && in.charAt(1) < '3'))
		{
			System.out.print('0');
			System.out.print("\n");
			System.out.print(in);
			System.out.print("\n");
		}
		else
		{
		yu = in.charAt(0) - '0';
		for (int i = 1;in.charAt(i) != 0;i++)
		{
			   a = yu * 10 + (in.charAt(i) - '0');
			   shan[i - 1] = a / 13;
			   yu = a - shan[i - 1] * 13;
			   n++;
		}
		if (shan[0] == 0)
		{
		  for (int i = 1;i < n;i++)
		  {
			 System.out.print(shan[i]);
		  }
		}
		else
		{
			for (int i = 0;i < n;i++)
			{
				System.out.print(shan[i]);
			}
		}
		System.out.print("\n");
		System.out.print(yu);
		System.out.print("\n");
		}
		return 0;
	}

}


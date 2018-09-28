package <missing>;

public class GlobalMembers
{
	public static int judge(char c)

	{

		return (!(c == 'A' || c == 'T' || c == 'C' || c == 'G'));

	}



	public static int Main()

	{

		double n;

		int icount = 0;

		int flag = 0;

		String s = new String(new char[600]);
		String t = new String(new char[600]);

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			t = tempVar3.charAt(0);
		}

		int len1 = s.length();
		int len2 = t.length();

		if (len1 != len2)
		{

			System.out.print("error\n");
		}

		else

		{

			for (int i = 0; i < len1; ++i)

			{

				if (s.charAt(i) == t.charAt(i))
				{
					icount++;
				}

				if (judge(s.charAt(i)) != 0 || judge(t.charAt(i)) != 0)
				{
					flag = 1;
					break;
				}

			}

			if (flag != 0)
			{

				System.out.print("error\n");
			}

			else

			{

				if (1.0 * icount / len1 >= n)
				{
					System.out.print("yes\n");
				}

				else
				{
					System.out.print("no\n");
				}

			}

		}

		return 0;

	}

}


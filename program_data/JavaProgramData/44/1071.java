package <missing>;

public class GlobalMembers
{
	public static void reverse(int x)
	{
		int i;
		int j;
		String s = new String(new char[10]);
		if (x >= 0)
		{
			s = String.format("%d", x);
			for (i = (Character.SIZE / Byte.SIZE) - 1 ; i >= 0 ; i--)
			{
				if (s.charAt(i) > '0' && s.charAt(i) <= '9')
				{
					for (j = i ; j >= 0 ; j--)
					{
						System.out.printf("%c", s.charAt(j));
					}
					break;
				}
			}
		}
		else
		{
			System.out.print("-");
			reverse(-x);
		}
	}

	public static void Main(String[] args)
	{
		int i;
		int num;
		for (i = 0 ; i < 6 ; i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				num = Integer.parseInt(tempVar);
			}
			reverse(num);
			System.out.print("\n");
		}
	}

}


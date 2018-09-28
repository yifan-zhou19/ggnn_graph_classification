package <missing>;

public class GlobalMembers
{
	//*******************************
	//*???? ??13              *
	//*?  ????  1100062709     *
	//*?  ??2011.11.5            *
	//*******************************
	public static int Main()
	{
			int r = 0;
			int j;
			String str = new String(new char[101]);
			str = ConsoleInput.readToWhiteSpace(true).charAt(0);
			int[] num = new int[101];
			for (j = 0; str.charAt(j) != '\0'; j++)
			{
				num[j] = (r * 10 + str.charAt(j) - '0') / 13;
				r = (r * 10 + str.charAt(j) - '0') % 13;
			}
			j = 0;
			while (num[j] == 0)
			{
				  j++;
			}
			if (str.charAt(j) == '\0')
			{
				System.out.print("0");
			}
			for (; str.charAt(j) != '\0'; j++)
			{
				System.out.print(num[j]);
			}
			System.out.print("\n");
			System.out.print(r);
			System.out.print("\n");
			r = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		return 0;
	}


}


package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j = 0;
		String sz = new String(new char[30]);
		sz = new Scanner(System.in).nextLine(); //????

		for (i = 0;i < 30;i++)
		{
			if ((sz.charAt(i) == '0') || (sz.charAt(i) == '1') || (sz.charAt(i) == '2') || (sz.charAt(i) == '3') || (sz.charAt(i) == '4') || (sz.charAt(i) == '5') || (sz.charAt(i) == '6') || (sz.charAt(i) == '7') || (sz.charAt(i) == '8') || (sz.charAt(i) == '9'))
			{
				System.out.printf("%c",sz.charAt(i));
				j = 0; //???????????????????
			}
			else
			{
				j++;
				if (j == 1)
				{
					System.out.print("\n");
				} //????????????????
			}
		}

		return 0;
	}


}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str1 = new String(new char[1000]);
		String str2 = new String(new char[1000]);
		int i = 0;
		int[] count1 = new int[53];
		int[] count2 = new int[53];
		int flag = 1;
		int le1;
		int le2;
		str1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		str2 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		le1 = str1.length();
		le2 = str2.length();
	  for (i = 0;i <= le1 - 1;i++)
	  {
			if (str1.charAt(i) >= 97)
			{
				count1[str1.charAt(i) - 70]++;
			}
			else
			{
				count1[str1.charAt(i) - 64]++;
			}

	  }

		for (i = 0;i <= le2 - 1;i++)
		{

				if (str2.charAt(i) >= 97)
				{
					count2[str2.charAt(i) - 70]++;
				}
				else
				{
					count2[str2.charAt(i) - 64]++;
				}


		}
		for (i = 1;i <= 52;i++)
		{
			if (count1[i] != count2[i])
			{
				flag = 0;
				break;
			}
		}
		if (flag == 0)
		{
			System.out.print("NO");
			System.out.print("\n");
		}
		if (flag == 1)
		{
			System.out.print("YES");
			System.out.print("\n");
		}
		return 0;
	}

}


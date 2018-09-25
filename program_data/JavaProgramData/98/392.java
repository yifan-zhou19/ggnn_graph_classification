package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n; //len1?????????????len2????????????
		int i;
		int len1 = 0;
		int len2;
		char[][] words = new char[1000][41]; //????
		String p = null; //?????????
		p = words;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			*(p.Substring(i)) = ConsoleInput.readToWhiteSpace(true);
		}
		len2 = String.valueOfp.length() + 1;
		for (i = 0;i < n;i++)
		{
			len1 += String.valueOf(*(p.Substring(i))).length(); //?????????
			len2 += String.valueOf(*(p.Substring(i) + 1)).length(); //???????????
			if (len2 <= 80 && i != n - 1) //????????80?????
			{
				System.out.print((p.Substring(i)));
				System.out.print(" ");
				len1++;
				len2++; //??????
			}
			else
			{
				if (len1 <= 80) //????????80
				{
					System.out.print((p.Substring(i)));
					System.out.print("\n");
					len1 = 0;
					len2 = String.valueOf(*(p.Substring(i) + 1)).length() + 1;
				}
				else //?????????80
				{
					System.out.print("\n");
					len1 = 0;
					len2 = String.valueOf(*(p.Substring(i))).length() + 1;
				}
			}
		}
		return 0;
	}
}


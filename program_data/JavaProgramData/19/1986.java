package <missing>;

public class GlobalMembers
{
	public static void huan(int start, String W, String B, int Len1, int Len2, int Len3, int t)
	{
		int i;
		int k;
		String WW = new String(new char[100]);
		for (i = 0;i < start;i++)
		{
			WW = tangible.StringFunctions.changeCharacter(WW, i, W[i]);
		}
		for (i = start,k = 0;i < start + Len3;i++,k++)
		{
			WW = tangible.StringFunctions.changeCharacter(WW, i, B[k]);
		}
		for (i = start + Len3;i <= Len1 - Len2 * t + Len3 * t - 1;i++)
		{
			WW = tangible.StringFunctions.changeCharacter(WW, i, W[i + Len2 - Len3]);
		}
		for (i = 0;i <= Len1 - Len2 * t + Len3 * t - 1;i++)
		{
			W[i] = WW.charAt(i);
		}
	}


	public static int Main()
	{
		String whole = new String(new char[100]);
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		String gai = new String(new char[100]);
		whole = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		int i;
		int j;
		int k;
		int t;
		int len1;
		int len2;
		int len3;
		len1 = whole.length();
		len2 = a.length();
		len3 = b.length();
		int judge;
		int[] begin = new int[100];
		t = 0;
		if (whole.charAt(0) != a.charAt(0))
		{
		for (i = 0;i < len1 - len2 + 1;i++)
		{
			for (j = i, k = 0;j < len2 + i;j++,k++)
			{
				if (whole.charAt(j) != a.charAt(k))
				{
					judge = 0;
					break;
				}
				else
				{
					judge = 1;
				}
			}
			if (whole.charAt(i - 1) == ' ' && judge == 1)
			{
				begin[t] = i;
				t++;
			}
		}
		}
		else
		{
			t = 1;
			begin[0] = 0;
	for (i = 0;i < len1 - len2 + 1;i++)
	{
			for (j = i, k = 0;j < len2 + i;j++,k++)
			{
				if (whole.charAt(j) != a.charAt(k))
				{
					judge = 0;
					break;
				}
				else
				{
					judge = 1;
				}
			}
			if (whole.charAt(i - 1) == ' ' && judge == 1)
			{
				begin[t] = i;
				t++;
			}
	}
		}

		if (len1 >= len2)
		{
		int u;
		for (i = t - 1,u = 1;i >= 0;i--,u++)
		{
			huan(begin[i], whole, b, len1, len2, len3, u);
		}
		for (i = 0;i <= len1 - 1 - len2 * (u - 1) + len3 * (u - 1);i++)
		{
			System.out.printf("%c",whole.charAt(i));
		}
		}
		else
		{
			int v;
		for (i = 0,v = 1;i <= t - 1;i++,v++)
		{
			huan(begin[i], whole, b, len1, len2, len3, v);
		}
		for (i = 0;i <= len1 - 1 - len2 * (v - 1) + len3 * (v - 1);i++)
		{
			System.out.printf("%c",whole.charAt(i));
		}
		}


		return 0;
	}
}

